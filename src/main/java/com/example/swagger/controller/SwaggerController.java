package com.example.swagger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
public class SwaggerController {
	
	Logger logger = LoggerFactory.getLogger(SwaggerController.class);
	
	@GetMapping("/get")	
	@ApiOperation(value = "Get a product by id", notes = "Returns a product as per the id")
	public String getData(String id) {
		logger.debug("Hii Error");
		return "hello";
	}
	
	@GetMapping("/test")	
	@Tag(name = "Get a product by id", description = "Returns a product as per the id")
	public String getTestData() {
		return "hello Test";
	}

}
