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
@ApiModel(value="Subject对象", description="")
public class Subject extends Model<Subject> implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "语文 数学 英语 等")
    private String name;

    @ApiModelProperty(value = "年级 (1-12) 小学 初中 高中  大学")
    private Integer level;

    @ApiModelProperty(value = "一年级、二年级等")
    private String levelName;

    @ApiModelProperty(value = "排序")
    private Integer itemOrder;

    private Boolean deleted;


}
