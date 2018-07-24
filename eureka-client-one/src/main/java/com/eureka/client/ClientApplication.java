/**
 * 
 */
package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**     
 * @Description:
 * @author: zhaoxuefeng 
 * @date:   2018年7月21日 下午3:47:41     
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
