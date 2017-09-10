package com.mastercard.virtualservice;
 


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class VirtalserviceApi {
 
    private static final Logger LOG = Logger.getLogger(VirtalserviceApi.class);
 
    @RequestMapping(value = "/testservice", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public String testServices() {
    	LOG.info("Inside test method");
        return " Testservice is running!";
    }
 
    public static void main( String[] args ) {
        SpringApplication.run(VirtalserviceApi.class, args);
    }
    
   
    		
   
 
}
