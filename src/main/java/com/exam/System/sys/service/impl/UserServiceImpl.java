package com.exam.System.sys.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.System.sys.entity.User;
import com.exam.System.sys.mapper.UserMapper;
import com.exam.System.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.System.viewmodel.admin.user.UserPageRequestVM;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  用户管理服务实现类
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private UserMapper userMapper;

    @Override
    public Page<User> userPage(UserPageRequestVM requestVM) {
        
        return null;
    }
}
