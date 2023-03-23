package com.yupi.yupiclientsdk;

import com.yupi.yupiclientsdk.client.YuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Mv
 * @date 2023/3/23 17:26
 */

@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class YuApiClientConfig {

    private String accessKey;
    private String secretKey;


    @Bean
    public YuApiClient yuApiClient() {
        return new YuApiClient(accessKey, secretKey);
    }

}
