package com.exam.System.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.System.sys.entity.UserEventLog;
import com.exam.System.sys.mapper.UserEventLogMapper;
import com.exam.System.sys.service.IUserEventLogService;
import com.exam.System.viewmodel.admin.user.UserEventLogVM;
import com.exam.System.viewmodel.admin.user.UserEventPageRequestVM;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
@Service
public class UserEventLogServiceImpl extends ServiceImpl<UserEventLogMapper, UserEventLog> implements IUserEventLogService {

    private UserEventLogMapper userEventLogMapper;

    @Override
    public Page<UserEventLogVM> page(UserEventPageRequestVM model) {
        QueryWrapper<UserEventLog> queryWrapper = new QueryWrapper<>();
        if (model.getUserId() != null) {
            queryWrapper.eq("user_id", model.getUserId());
        }
        if (StringUtils.isNotEmpty(model.getUserName())) {
            queryWrapper.eq("user_name", model.getUserName());
        }
        Page<UserEventLog> userEventLogPage = userEventLogMapper.selectPage(new Page<>(model.getPageIndex(), model.getPageSize()), queryWrapper);
        Page<UserEventLogVM> page = new Page<>();
        BeanUtils.copyProperties(userEventLogPage, page);
        return page;
    }
}
