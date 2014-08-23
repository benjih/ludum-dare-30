package com.benjih.ld30;

public enum PlanetType {
	TERRAN(1, 7); 
	
	private int typeInt, population;
	
	private PlanetType(int typeInt, int population) {
		this.typeInt = typeInt;
		this.population = population;
	}
	
	public int getTypeInt() {
		return typeInt;
	}
}