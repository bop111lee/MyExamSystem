package com.exam.System.viewmodel.admin.user;

import com.exam.System.viewmodel.BasePage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;


@Data
@ApiModel(value = "查询分页用户列表入参")
public class UserPageRequestVM extends BasePage {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("角色 1-学生 3-管理员")
    private Integer role;

}
