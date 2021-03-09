package com.exam.System.viewmodel.admin.user;

import com.exam.System.viewmodel.BasePage;
import lombok.Data;

@Data
public class UserEventPageRequestVM extends BasePage {

    private Integer id;

    private Integer userId;

    private String userName;

    private String realName;

    private String content;

    private String createTime;
}
