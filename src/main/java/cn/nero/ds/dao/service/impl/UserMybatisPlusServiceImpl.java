package cn.nero.ds.dao.service.impl;

import cn.nero.ds.domain.po.UserPO;
import cn.nero.ds.dao.mappers.UserMybatisPlusMapper;
import cn.nero.ds.dao.service.UserMybatisPlusService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @since 2024/3/6
 */
@DS("user")
@Service
public class UserMybatisPlusServiceImpl extends ServiceImpl<UserMybatisPlusMapper, UserPO> implements UserMybatisPlusService {
}
