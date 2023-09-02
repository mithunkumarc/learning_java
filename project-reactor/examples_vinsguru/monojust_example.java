package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Mono<Integer> mono = Mono.just(1);
		System.out.println(mono);
		mono.subscribe(i -> System.out.println("result : "+ i));
	}
}

/*
MonoJust
result : 1
*/
