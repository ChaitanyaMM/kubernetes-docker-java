package com.example.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/ambassador")
public class AdopterController {
	
	//ambassador desing pattern call container-design-pattern application serice and gets the value
	 
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/")
	public  List<CannedData> callAmbassadorAPI() throws URISyntaxException, JsonMappingException, JsonProcessingException {
		
		final String baseUrl = "http://192.168.99.100:7777/ambassador/callback";
		URI uri = new URI(baseUrl);
		 
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
        List<CannedData> list = mapper.readValue(result.getBody(), new TypeReference<List<CannedData>>() {});

		return list;
	}

}
