package com.cfgtest.services.cfgservicescloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CfgServicesCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfgServicesCloudConfigApplication.class, args);
	}

}
