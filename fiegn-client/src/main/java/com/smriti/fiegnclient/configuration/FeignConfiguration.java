package com.smriti.fiegnclient.configuration;

import com.smriti.fiegnclient.FeignSpringFormEncoder;
import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public Encoder feignFormEncoder() {
        return new FeignSpringFormEncoder();
    }
}