package com.benjih.ld30;

import com.benjih.ld30.FullscreenSprite;

public class Launcher {

	public static void main(String args[]) throws Exception {
		GameDisplay display = new GameDisplay();
		
		display.init();
		
		new FullscreenSprite(display, GameRes.SPLASH).run();
		new FullscreenSprite(display, GameRes.INSTRUCTIONS).run();
		
		while(true) {
			display.blit();
			display.closeIfRequested();
			display.update();
		}
	}
}