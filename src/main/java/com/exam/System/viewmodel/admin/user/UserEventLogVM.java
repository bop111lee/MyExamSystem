package com.exam.System.viewmodel.admin.user;

import com.exam.System.viewmodel.BasePage;
import lombok.Data;

@Data
public class UserEventLogVM extends BasePage {

    private Integer userId;

    private String userName;

}
