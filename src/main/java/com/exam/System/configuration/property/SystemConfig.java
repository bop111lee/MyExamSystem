package com.exam.System.configuration.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "system")
public class SystemConfig {

    private PasswordKeyConfig pwdKey;
    private List<String> securityIgnoreUrls;
    private WxConfig wx;
    private QnConfig qn;
}
