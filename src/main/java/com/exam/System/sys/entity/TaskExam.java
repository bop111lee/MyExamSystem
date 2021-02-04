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
@ApiModel(value="TaskExam对象", description="")
public class TaskExam extends Model<TaskExam> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "任务标题")
    private String title;

    @ApiModelProperty(value = "级别")
    private Integer gradeLevel;

    @ApiModelProperty(value = "任务框架 内容为JSON")
    private Integer frameTextContentId;

    private Integer createUser;

    private Date createTime;

    private Boolean deleted;

    private String createUserName;


}
