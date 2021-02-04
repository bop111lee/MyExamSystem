package com.exam.System.sys.service.impl;

import com.exam.System.sys.entity.Question;
import com.exam.System.sys.mapper.QuestionMapper;
import com.exam.System.sys.service.IQuestionService;
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
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
