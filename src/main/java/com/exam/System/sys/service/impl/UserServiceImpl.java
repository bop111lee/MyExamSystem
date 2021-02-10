package com.exam.System.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.System.sys.entity.User;
import com.exam.System.sys.mapper.UserMapper;
import com.exam.System.sys.service.IUserService;
import com.exam.System.viewmodel.admin.user.UserPageRequestVM;
import com.exam.System.viewmodel.admin.user.UserResponseVM;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户管理服务实现类
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Page<UserResponseVM> userPage(UserPageRequestVM model) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (model.getRole() != null && model.getRole() != 0) {
            queryWrapper.eq("role", model.getRole());
        }
        if (model.getUserName() != null) {
            queryWrapper.eq("user_name", model.getUserName());
        }
        queryWrapper.orderByDesc("id");
        Page<User> userPage = userMapper.selectPage(new Page<>(model.getPageIndex(), model.getPageSize()), queryWrapper);
        Page<UserResponseVM> page = new Page<>();
        //TODO：数据复制具有不确定性
        BeanUtils.copyProperties(userPage,page);
        return page;
    }
}
