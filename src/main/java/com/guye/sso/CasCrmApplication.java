package com.guye.sso;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient	//访问cas服务端的注解
public class CasCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasCrmApplication.class, args);
	}
}
