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
@ApiModel(value="Message对象", description="")
public class Message extends Model<Message> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "内容")
    private String content;

    private Date createTime;

    @ApiModelProperty(value = "发送者用户ID")
    private Integer sendUserId;

    @ApiModelProperty(value = "发送者用户名")
    private String sendUserName;

    @ApiModelProperty(value = "发送者真实姓名")
    private String sendRealName;

    @ApiModelProperty(value = "接收人数")
    private Integer receiveUserCount;

    @ApiModelProperty(value = "已读人数")
    private Integer readCount;


}
