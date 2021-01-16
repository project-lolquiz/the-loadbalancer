package com.lolquiz.lb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LolquizLbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LolquizLbApplication.class, args);
	}

}
