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
@ApiModel(value="MessageUser对象", description="")
public class MessageUser extends Model<MessageUser> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "消息内容ID")
    private Integer messageId;

    @ApiModelProperty(value = "接收人ID")
    private Integer receiveUserId;

    @ApiModelProperty(value = "接收人用户名")
    private String receiveUserName;

    @ApiModelProperty(value = "接收人真实姓名")
    private String receiveRealName;

    @ApiModelProperty(value = "是否已读")
    private Boolean readed;

    private Date createTime;

    @ApiModelProperty(value = "阅读时间")
    private Date readTime;


}
