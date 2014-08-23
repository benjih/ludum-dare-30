package com.benjih.ld30;

public class FullscreenSprite {
	
	private GameDisplay display;
	private GameRes gameResource;
	
	public FullscreenSprite (GameDisplay display, GameRes gameResource) {
		this.display = display;
		this.gameResource = gameResource;
	}
	
	public void run () throws Exception {
		boolean running = true;
		
		Sprite splash = new Sprite(0, 0, gameResource.getResourceAddress());
		long start = display.getTime();
		
		while (running) {
			display.blit();
			
			splash.render();
			
			display.closeIfRequested();
			
			display.update();
			
			if (display.getTime() >= start + 3) {
				running = false;
			}
			
		}
		
	}
	
}