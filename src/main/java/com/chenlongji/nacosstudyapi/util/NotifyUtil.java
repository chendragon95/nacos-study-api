package com.chenlongji.nacosstudyapi.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author clj
 */
@Component
public class NotifyUtil {
    @Value("${user.name:api默认名字}")
    private String name;

    @Value("${user.message:api默认消息}")
    private String message;

    public String getInfo(){
        return "[name=" + name + ",message=" + message + "]";
    }

}
