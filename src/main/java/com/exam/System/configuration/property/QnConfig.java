package com.exam.System.configuration.property;

import lombok.Data;

@Data
public class QnConfig {
    private String url;
    private String bucket;
    private String accessKey;
    private String secretKey;
}
