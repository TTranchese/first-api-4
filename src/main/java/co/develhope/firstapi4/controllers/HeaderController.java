package co.develhope.firstapi4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;

@RestController
public class HeaderController {
	@GetMapping("/headers")
	public String returnHeaders(@RequestHeader(HttpHeaders.REFERES)){

	}
}