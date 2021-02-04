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
@ApiModel(value="TaskExamCustomerAnswer对象", description="")
public class TaskExamCustomerAnswer extends Model<TaskExamCustomerAnswer> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer taskExamId;

    private Integer createUser;

    private Date createTime;

    @ApiModelProperty(value = "任务完成情况(Json)")
    private Integer textContentId;


}
