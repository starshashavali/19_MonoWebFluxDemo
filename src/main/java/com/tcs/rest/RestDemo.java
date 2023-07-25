package com.tcs.rest;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
public class RestDemo {
	@GetMapping("/single")
	public Mono<String>singleResponce(){
		return Mono.just("hello world...");
	}
	@GetMapping("/multiple")
	public Flux<Integer>multipleResponses(){
		return Flux.range(1, 10);
	}

}
