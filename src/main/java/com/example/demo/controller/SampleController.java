package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger log = LoggerFactory.getLogger(SampleController.class);

  	
	@Autowired
	private SampleRepository sampleRepository;

	@GetMapping("/{id}")
	public Sample getSample(@PathVariable Long id) {
        log.info("retrieve data :-> " + id);

		return sampleRepository.findById(id).get();
	}

	@PostMapping("/")
	public Sample postSample(@RequestBody Sample sample) {
        log.info("insert data :-> " + sample);

		return sampleRepository.save(sample);
	}

}
