package com.exam.System.sys.service.impl;

import com.exam.System.sys.entity.User;
import com.exam.System.sys.mapper.UserMapper;
import com.exam.System.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
