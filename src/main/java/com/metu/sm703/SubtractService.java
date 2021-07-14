package com.metu.sm703;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtractService {

	@RequestMapping("/subtract/first/{first}/second/{second}")
	public long subtract(@PathVariable int first, @PathVariable int second) {
		
		
		return first -  second;
	}
	
}
