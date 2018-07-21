/**
 * 
 */
package com.eureka.client;

	import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**     
 * @Description:
 * @author: zhaoxuefeng 
 * @date:   2018年7月21日 下午3:47:41     
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
