package com.exam.System.sys.service.impl;

import com.exam.System.sys.entity.Message;
import com.exam.System.sys.mapper.MessageMapper;
import com.exam.System.sys.service.IMessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
