package br.com.modelo.wsmodeloauth.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class HelloWorldRestController {

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<String> teste(){		
		return new ResponseEntity<String>("Teste",HttpStatus.OK);
	}
}
