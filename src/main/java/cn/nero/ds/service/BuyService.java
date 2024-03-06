package cn.nero.ds.service;

import cn.nero.ds.domain.po.TransactionDetailsPO;
import cn.nero.ds.domain.po.UserPO;
import cn.nero.ds.dao.service.TransactionMybatisPlusService;
import cn.nero.ds.dao.service.UserMybatisPlusService;
import cn.nero.ds.service.argrst.BuyArgBO;
import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @since 2024/3/6
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BuyService {

    // 1765274476330680322

    private final UserMybatisPlusService userMybatisPlusService;

    private final TransactionMybatisPlusService transactionMybatisPlusService;

    @DSTransactional
    public void buy (List<BuyArgBO> args, boolean rollback) {
        Long userId = args.get(0).getUserId();

        BigDecimal totalPrice = args.stream().map(it -> it.getUnitPrice().multiply(new BigDecimal(it.getItemNum().toString()))).collect(Collectors.reducing(BigDecimal.ZERO, BigDecimal::add));

        UserPO userPo = userMybatisPlusService.getById(userId);

        BigDecimal amount = userPo.getAmount();

        if (amount.compareTo(totalPrice) < 0) {
            throw new RuntimeException("Insufficient balance!");
        }

        List<TransactionDetailsPO> poList = args.stream().map(it -> {
            TransactionDetailsPO po = new TransactionDetailsPO();
            po.setId(IdWorker.getId());
            po.setOrderNo("O" + DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now()));
            po.setTitle("购买" + it.getItemName() + "结算单");
            po.setItemName(it.getItemName());
            po.setItemNum(1);
            po.setUnitPrice(it.getUnitPrice());
            return po;
        }).toList();

        transactionMybatisPlusService.saveBatch(poList);

        BigDecimal newAmount = amount.subtract(totalPrice);

        userPo.setAmount(newAmount);
        userMybatisPlusService.updateById(userPo);

        if (rollback) {
            throw new RuntimeException();
        }
    }

}
