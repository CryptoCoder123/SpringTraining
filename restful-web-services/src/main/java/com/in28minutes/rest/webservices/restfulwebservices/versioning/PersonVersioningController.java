package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	

	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Haji Seferian");
	}
	
	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Haji", "Seferian"));
	}
	
	@GetMapping(value ="/person/param", params="version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Haji Seferian");
	}
	
	@GetMapping(value ="/person/param", params="version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Haji", "Seferian"));
	}
	
	@GetMapping(value ="/person/header", headers="X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Haji Seferian");
	}
	
	@GetMapping(value ="/person/header", headers="X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Haji", "Seferian"));
	}
	
	@GetMapping(value ="/person/produces", produces="application/mytype.tester.app-v1+json")
	public PersonV1 producesrV1() {
		return new PersonV1("Haji Seferian");
	}
	
	@GetMapping(value ="/person/produces", produces="application/mytype.tester.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2(new Name("Haji", "Seferian"));
	}
}
