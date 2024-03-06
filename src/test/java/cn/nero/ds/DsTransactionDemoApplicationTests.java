package cn.nero.ds;

import cn.nero.ds.service.BuyService;
import cn.nero.ds.service.argrst.BuyArgBO;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@MapperScan(basePackages = {
        "cn.nero.ds.dao.mappers"
})
@SpringBootTest
class DsTransactionDemoApplicationTests {

    @Autowired
    private BuyService buyService;

    @Test
    public void test1() {

        BuyArgBO argument = new BuyArgBO();
        argument.setItemName("鸭梨手机");
        argument.setItemNum(1);
        argument.setUnitPrice(new BigDecimal("300"));
        argument.setUserId(1765274476330680322L);
        buyService.buy(List.of(argument), false);
    }
}
