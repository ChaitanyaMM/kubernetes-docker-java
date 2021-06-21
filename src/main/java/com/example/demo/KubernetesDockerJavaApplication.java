package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesDockerJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesDockerJavaApplication.class, args);
	}

	@GetMapping("/sample")
	public String checkStatus() {

		return "k8's sample is running !";
	}

}
