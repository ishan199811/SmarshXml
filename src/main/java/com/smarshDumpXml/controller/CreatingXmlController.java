package com.smarshDumpXml.controller;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smarshDumpXml.service.SmarshXmlService;

@RestController
public class CreatingXmlController {
	
	@Autowired
	SmarshXmlService smarshXmlService;
	  @GetMapping("/json-data")
	    public ResponseEntity<?> getJsonData() throws IOException, ParseException {
	        return smarshXmlService.getApiRequest();
	    }
	    

}
