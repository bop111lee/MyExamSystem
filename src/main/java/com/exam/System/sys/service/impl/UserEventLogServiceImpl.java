package com.exam.System.sys.service.impl;

import com.exam.System.sys.entity.UserEventLog;
import com.exam.System.sys.mapper.UserEventLogMapper;
import com.exam.System.sys.service.IUserEventLogService;
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
public class UserEventLogServiceImpl extends ServiceImpl<UserEventLogMapper, UserEventLog> implements IUserEventLogService {

}
