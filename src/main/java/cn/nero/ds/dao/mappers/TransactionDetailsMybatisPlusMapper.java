package cn.nero.ds.dao.mappers;

import cn.nero.ds.domain.po.TransactionDetailsPO;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @since 2024/3/6
 */
@Mapper
@DS("balance")
public interface TransactionDetailsMybatisPlusMapper extends BaseMapper<TransactionDetailsPO> {
}
