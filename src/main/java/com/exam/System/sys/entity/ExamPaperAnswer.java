package com.exam.System.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author li
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="ExamPaperAnswer对象", description="")
public class ExamPaperAnswer extends Model<ExamPaperAnswer> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("试卷id")
    private Integer examPaperId;

    @ApiModelProperty(value = "试卷名称")
    private String paperName;

    @ApiModelProperty(value = "试卷类型( 1固定试卷  2临时试卷 3班级试卷 4.时段试卷 )")
    private Integer paperType;

    @ApiModelProperty(value = "学科")
    private Integer subjectId;

    @ApiModelProperty(value = "系统判定得分")
    private Integer systemScore;

    @ApiModelProperty(value = "最终得分(千分制)")
    private Integer userScore;

    @ApiModelProperty(value = "试卷总分")
    private Integer paperScore;

    @ApiModelProperty(value = "做对题目数量")
    private Integer questionCorrect;

    @ApiModelProperty(value = "题目总数量")
    private Integer questionCount;

    @ApiModelProperty(value = "做题时间(秒)")
    private Integer doTime;

    @ApiModelProperty(value = "试卷状态(1待判分 2完成)")
    private Integer status;

    @ApiModelProperty(value = "学生")
    private Integer createUser;

    @ApiModelProperty(value = "提交时间")
    private Date createTime;

    private Integer taskExamId;


}
