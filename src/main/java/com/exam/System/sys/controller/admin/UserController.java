package com.exam.System.sys.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.System.common.RestResponse;
import com.exam.System.sys.entity.User;
import com.exam.System.sys.service.IUserService;
import com.exam.System.viewmodel.admin.user.UserPageRequestVM;
import com.exam.System.viewmodel.admin.user.UserResponseVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("AdminUserController")
@Api(tags = "用户管理接口")
@RequestMapping(value = "/api/admin/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/page/list", method = RequestMethod.POST)
    @ApiOperation(value = "获取分页用户列表")
    public RestResponse<Page<UserResponseVM>> pageList(@RequestBody UserPageRequestVM model) {
        return RestResponse.ok(userService.userPage(model));
    }


}
