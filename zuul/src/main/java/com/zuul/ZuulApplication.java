package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.filter.MyZuulFilter;

/**
 * @Description:
 * @author: zhaoxuefeng
 * @date: 2018年7月23日 下午2:15:36
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
	public MyZuulFilter getZuulFilter() {
		return new MyZuulFilter();
	}
}
