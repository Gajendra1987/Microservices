package com.zuulproxy.application.zuulproxydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulproxyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulproxyDemoApplication.class, args);
	}
}
