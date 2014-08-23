package com.benjih.ld30;

public class Planet {
	
	private PlanetType planetType;
	private String name;
	private Sprite sprite;

	public Planet(PlanetType planetType, int size, SolarSystemPosition position, String name) {
		this.planetType = planetType;
		this.name = name;
		
		this.sprite = new Sprite(position.getX(), position.getY(), GameRes.PLANET.getResourceAddress() + size + "-" + planetType.getTypeInt() + "-1.png");
	}
	
	public void update() throws Exception {
		sprite.render();
	}
}