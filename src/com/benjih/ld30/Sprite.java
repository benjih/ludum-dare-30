package com.benjih.ld30;

import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import com.benjih.ld30.GLObject;

public class Sprite implements GLObject {

	private int x, y, xEdge, yEdge;
	private Texture resource;
	private boolean hide = false;
	
	public Sprite (int x, int y, String resource) {
		this.x = x;
		this.y = y;
		try {
			this.resource = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(resource));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		this.xEdge =  x + this.resource.getTextureWidth();
		this.yEdge = y + this.resource.getTextureHeight();
		System.out.println(xEdge + " " + yEdge);
	}
	
	public void render () {
		if (!hide) {
			new Color(255, 255, 255).bind();
			
			GL11.glEnable(GL11.GL_TEXTURE_2D); 
			resource.bind();
			GL11.glBegin(GL11.GL_QUADS);
			
			GL11.glTexCoord2f(0, 0);
			GL11.glVertex2f(x, y);
			
			GL11.glTexCoord2f(1, 0);
			GL11.glVertex2f(x + resource.getTextureWidth(), y);
			
			GL11.glTexCoord2f(1, 1);
			GL11.glVertex2f(x + resource.getTextureWidth(), y + resource.getTextureHeight());
			
			GL11.glTexCoord2f(0, 1);
			GL11.glVertex2f(x, y + resource.getTextureHeight());
			
			GL11.glEnd();
			GL11.glDisable(GL11.GL_TEXTURE_2D); 
		}
	}
	
	public int getX () {
		return x;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public int getY () {
		return y;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	public void hide () {
		this.hide = true;
	}
	
}