package com.exam.System.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ExamPaperQuestionCustomerAnswer对象", description = "")
public class ExamPaperQuestionCustomerAnswer extends Model<ExamPaperQuestionCustomerAnswer> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "题目Id")
    private Integer questionId;

    @ApiModelProperty(value = "答案Id")
    private Integer examPaperId;

    private Integer examPaperAnswerId;

    @ApiModelProperty(value = "题型")
    private Integer questionType;

    @ApiModelProperty(value = "学科")
    private Integer subjectId;

    @ApiModelProperty(value = "得分")
    private Integer customerScore;

    @ApiModelProperty(value = "题目原始分数")
    private Integer questionScore;

    @ApiModelProperty(value = "问题内容")
    private Integer questionTextContentId;

    @ApiModelProperty(value = "做题答案")
    private String answer;

    @ApiModelProperty(value = "做题内容")
    private Integer textContentId;

    @ApiModelProperty(value = "是否正确")
    private Boolean doRight;

    @ApiModelProperty(value = "做题人")
    private Integer createUser;

    private Date createTime;

    private Integer itemOrder;


}
