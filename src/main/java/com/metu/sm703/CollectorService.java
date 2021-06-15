package com.metu.sm703;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectorService {
	
	@RequestMapping("/collect/first/{first}/second/{second}")
	public long collect(@PathVariable long first, @PathVariable long second) {
		return first + second;
	}

}
