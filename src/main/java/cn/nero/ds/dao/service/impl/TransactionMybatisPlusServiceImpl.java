package cn.nero.ds.dao.service.impl;

import cn.nero.ds.domain.po.TransactionDetailsPO;
import cn.nero.ds.dao.mappers.TransactionDetailsMybatisPlusMapper;
import cn.nero.ds.dao.service.TransactionMybatisPlusService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @since 2024/3/6
 */
@DS("balance")
@Service
public class TransactionMybatisPlusServiceImpl extends ServiceImpl<TransactionDetailsMybatisPlusMapper, TransactionDetailsPO> implements TransactionMybatisPlusService {
}
