package com.benjih.ld30;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class GameDisplay {

	private long lastFrame;
	
	public GameDisplay() {
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.setFullscreen(false);
			Display.setTitle("Game");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public void init() {
		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);       
		 
		GL11.glViewport(0,0,800,600);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		 
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 600, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		lastFrame = getTime();
		generateDelta();
	}
	
	public void blit() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	}
	
	public void update() {
		GL11.glDisable(GL11.GL_BLEND);
		Display.update();
		Display.sync(60);
	}
	
	public int generateDelta() {
		long time = getTime();
		return (int) (time - lastFrame);
	}
	
	public long getTime() {
		return Sys.getTime() / Sys.getTimerResolution();
	}
	
	public void end() {
		Display.destroy();
		System.exit(0);
	}
	
	public void closeIfRequested() {
		if(Display.isCloseRequested()) {
			end();
		}
	}	
}