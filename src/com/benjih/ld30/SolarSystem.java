package com.benjih.ld30;

import java.util.List;

public class SolarSystem {
	
	private List<Planet> planets;
	private String name;
	
	public SolarSystem(List<Planet> planets, String name) {
		this.planets = planets;
		this.name = name;
	}
	
	public void update() throws Exception {
		for(Planet planet : planets) {
			planet.update();
		}
	}

}