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
@ApiModel(value="UserToken对象", description="")
public class UserToken extends Model<UserToken> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String token;

    @ApiModelProperty(value = "用户Id")
    private Integer userId;

    @ApiModelProperty(value = "微信openId")
    private String wxOpenId;

    private Date createTime;

    private Date endTime;

    @ApiModelProperty(value = "用户名")
    private String userName;


}
