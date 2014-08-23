package com.benjih.ld30;

import com.benjih.ld30.FullscreenSprite;

public class Launcher {

	public static void main(String args[]) throws Exception {
		GameDisplay display = new GameDisplay();
		
		display.init();
		
		new FullscreenSprite(display, GameRes.SPLASH).run();
		new FullscreenSprite(display, GameRes.INSTRUCTIONS).run();
		Planet planet = new Planet(PlanetType.TERRAN, "Earth");
		while(true) {
			display.blit();
			planet.update();
			display.closeIfRequested();
			display.update();
		}
	}
}