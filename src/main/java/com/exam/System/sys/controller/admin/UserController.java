package com.exam.System.sys.controller.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.System.common.RestResponse;
import com.exam.System.sys.service.IUserEventLogService;
import com.exam.System.sys.service.IUserService;
import com.exam.System.viewmodel.admin.user.UserEventLogVM;
import com.exam.System.viewmodel.admin.user.UserEventPageRequestVM;
import com.exam.System.viewmodel.admin.user.UserPageRequestVM;
import com.exam.System.viewmodel.admin.user.UserResponseVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController("AdminUserController")
@Api(tags = "用户管理接口")
@RequestMapping(value = "/api/admin/user")
public class UserController {

    private IUserService userService;

    private IUserEventLogService userEventLogService;

    @RequestMapping(value = "/page/list", method = RequestMethod.POST)
    @ApiOperation(value = "获取分页用户列表")
    public RestResponse<Page<UserResponseVM>> pageList(@RequestBody UserPageRequestVM model) {
        return RestResponse.ok(userService.userPage(model));
    }

    @RequestMapping(value = "/event/page/list", method = RequestMethod.POST)
    @ApiOperation(value = "获取分页用户登录事件列表")
    public RestResponse<Page<UserEventLogVM>> eventPageList(@RequestBody UserEventPageRequestVM model) {
        return RestResponse.ok(userEventLogService.page(model));
    }

    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    @ApiOperation(value = "指定某一用户")
    public RestResponse<UserResponseVM> select(@PathVariable Integer id) {
        return null;
    }
}
