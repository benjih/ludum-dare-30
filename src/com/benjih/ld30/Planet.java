package com.benjih.ld30;

public class Planet {
	
	private PlanetType planetType;
	private String name;
	private Sprite sprite;

	public Planet(PlanetType planetType, String name) {
		this.planetType = planetType;
		this.name = name;
		
		this.sprite = new Sprite(0, 0, GameRes.PLANET.getResourceAddress() + "1-" + planetType.getTypeInt() + "-1.png");
	}
	
	public void update() throws Exception {
		sprite.render();
	}
}