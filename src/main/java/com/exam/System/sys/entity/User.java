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
@ApiModel(value="User对象", description="")
public class User extends Model<User> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String userUuid;

    @ApiModelProperty(value = "用户名")
    private String userName;

    private String password;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    private Integer age;

    @ApiModelProperty(value = "1.男 2女")
    private Integer sex;

    private LocalDateTime birthDay;

    @ApiModelProperty(value = "学生年级(1-12)")
    private Integer userLevel;

    private String phone;

    @ApiModelProperty(value = "1.学生 2.老师 3.管理员")
    private Integer role;

    @ApiModelProperty(value = "1.启用 2禁用")
    private Integer status;

    @ApiModelProperty(value = "头像地址")
    private String imagePath;

    private Date createTime;

    private Date modifyTime;

    private Date lastActiveTime;

    @ApiModelProperty(value = "是否删除")
    private Boolean deleted;

    @ApiModelProperty(value = "微信openId")
    private String wxOpenId;


}
