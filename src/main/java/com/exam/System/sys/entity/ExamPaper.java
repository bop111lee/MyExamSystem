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
@ApiModel(value = "ExamPaper对象", description = "")
public class ExamPaper extends Model<ExamPaper> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "试卷名称")
    private String name;

    @ApiModelProperty(value = "学科")
    private Integer subjectId;

    @ApiModelProperty(value = "试卷类型( 1固定试卷  2临时试卷 3班级试卷 4.时段试卷 5.推送试卷)")
    private Integer paperType;

    @ApiModelProperty(value = "级别")
    private Integer gradeLevel;

    @ApiModelProperty(value = "试卷总分(千分制)")
    private Integer score;

    @ApiModelProperty(value = "题目数量")
    private Integer questionCount;

    @ApiModelProperty(value = "建议时长(分钟)")
    private Integer suggestTime;

    @ApiModelProperty(value = "时段试卷 开始时间")
    private Date limitStartTime;

    @ApiModelProperty(value = "时段试卷 结束时间")
    private Date limitEndTime;

    @ApiModelProperty(value = "试卷框架 内容为JSON")
    private Integer frameTextContentId;

    private Integer createUser;

    private Date createTime;

    private Boolean deleted;

    private Integer taskExamId;


}
