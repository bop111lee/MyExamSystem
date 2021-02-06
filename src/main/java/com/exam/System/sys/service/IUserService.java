package com.exam.System.sys.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.System.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.System.viewmodel.admin.user.UserPageRequestVM;
import com.exam.System.viewmodel.admin.user.UserResponseVM;

/**
 * <p>
 *  用户管理服务类
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
public interface IUserService extends IService<User> {

    /**
     * 分页查询用户
     * @param model
     * @return
     */
    Page<UserResponseVM> userPage(UserPageRequestVM model);
}
