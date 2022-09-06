package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/sample")
@Slf4j
public class SampleController {

	@Autowired
	private SampleRepository sampleRepository;

	@GetMapping("/{id}")
	public Sample getSample(@PathVariable Long id) {

		log.info("getSample method called id : {} ," + id);
		Sample sample = sampleRepository.findById(id).get();
		log.info("Response : {} , " + sample);

		return sample;
	}

	@PostMapping("/")
	public Sample postSample(@RequestBody Sample sample) {
		log.info("postSample method called : {}, " + sample);

		Sample insertResponse = sampleRepository.save(sample);
		log.info("Response : {}, " + insertResponse);

		return insertResponse;
	}

}
