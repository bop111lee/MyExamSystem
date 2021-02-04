package com.exam.System.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@ApiModel(value="Question对象", description="")
public class Question extends Model<Question> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "1.单选题  2.多选题  3.判断题 4.填空题 5.简答题")
    private Integer questionType;

    @ApiModelProperty(value = "学科")
    private Integer subjectId;

    @ApiModelProperty(value = "题目总分(千分制)")
    private Integer score;

    @ApiModelProperty(value = "级别")
    private Integer gradeLevel;

    @ApiModelProperty(value = "题目难度")
    private Integer difficult;

    @ApiModelProperty(value = "正确答案")
    private String correct;

    @ApiModelProperty(value = "题目  填空、 题干、解析、答案等信息")
    private Integer infoTextContentId;

    @ApiModelProperty(value = "创建人")
    private Integer createUser;

    @ApiModelProperty(value = "1.正常")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    private Boolean deleted;


}
