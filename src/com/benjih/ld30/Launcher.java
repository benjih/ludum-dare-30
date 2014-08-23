package com.benjih.ld30;

import java.util.Arrays;

import com.benjih.ld30.FullscreenSprite;

public class Launcher {

	public static void main(String args[]) throws Exception {
		GameDisplay display = new GameDisplay();
		
		display.init();
		
		new FullscreenSprite(display, GameRes.SPLASH).run();
		new FullscreenSprite(display, GameRes.INSTRUCTIONS).run();
		Planet planet = new Planet(PlanetType.TERRAN, 1, SolarSystemPosition.POSITION_1, "Earth");
		Planet planet2 = new Planet(PlanetType.TERRAN, 2, SolarSystemPosition.POSITION_2, "Earth");
		Planet planet3 = new Planet(PlanetType.TERRAN, 3, SolarSystemPosition.POSITION_3, "Earth");
		Planet planet4 = new Planet(PlanetType.TERRAN, 4, SolarSystemPosition.POSITION_4, "Earth");
		
		SolarSystem sol = new SolarSystem(Arrays.asList(planet, planet2, planet3, planet4), "Earth");
		
		while(true) {
			display.blit();
			sol.update();
			display.closeIfRequested();
			display.update();
		}
	}
}