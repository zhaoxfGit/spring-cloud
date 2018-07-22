package com.eureka.client.templates.eurekaone;

import org.springframework.context.annotation.Configuration;

/**
 * @Description: 段容器类
 * @author: zhaoxuefeng
 * @date: 2018年7月22日 下午9:34:53
 */
@Configuration
public class FeignClientsFallBack implements FeignClients {

	@Override
	public String demo(String id) {

		return "eureka-one-client-链接失败:" + id;
	}

}
