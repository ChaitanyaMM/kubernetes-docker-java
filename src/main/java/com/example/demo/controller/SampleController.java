package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

	@Autowired
	private SampleRepository sampleRepository;

	@GetMapping("/{id}")
	public Sample getSample(@PathVariable Long id) {

		return sampleRepository.findById(id).get();
	}

	@PostMapping("/")
	public Sample postSample(@RequestBody Sample sample) {

		return sampleRepository.save(sample);
	}

}
