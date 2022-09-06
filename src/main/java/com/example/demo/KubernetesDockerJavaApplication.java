package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class KubernetesDockerJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesDockerJavaApplication.class, args);
	}

	@GetMapping("/sample")
	public String checkStatus() {
		
		log.info("ks8 logs ,"+"k8's sample is running !");

		return "k8's sample is running !";
	}

}
