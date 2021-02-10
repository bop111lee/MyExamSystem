package com.exam.System.sys.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.System.sys.entity.UserEventLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.System.viewmodel.admin.user.UserEventLogVM;
import com.exam.System.viewmodel.admin.user.UserEventPageRequestVM;

/**
 * <p>
 *  用户服务类
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
public interface IUserEventLogService extends IService<UserEventLog> {

    Page<UserEventLogVM> page(UserEventPageRequestVM model);

}
