package com.metu.sm703;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectorService {
	
	@RequestMapping("/collect/first/{first}/second/{second}")
	public long collect(@PathVariable String first, @PathVariable String second) {
		long number1 = 0l;
		long number2 = 0l;
		try {
		    number1 = Long.parseLong(first);
		    number2 = Long.parseLong(second);

		} catch (NumberFormatException ex) {
		    System.out.println("Not a valid number!");
		    throw new NumberFormatException();
		}
		
		return number1 + number2;
	}
	
	@RequestMapping("/collectfloat/first/{first}/second/{second}")
	public float collect(@PathVariable float first, @PathVariable float second) {
		
		return first + second;
	}
	
	@RequestMapping("/collectstring/first/{first}/second/{second}")
	public String collectstring(@PathVariable String first, @PathVariable String second) {
		
		return first + " " + second;
	}
}
