package com.hashiconf.waypoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaypointController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Waypoint!";
	}

}