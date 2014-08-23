package com.benjih.ld30;

public enum GameRes {
	SPLASH("res/splash.png"), INSTRUCTIONS("res/instructions.png"), PLANET("res/planet-");
	
	private String resourceAddress;
	
	private GameRes(String resourceAddress) {
		this.resourceAddress = resourceAddress;
	}
	
	public String getResourceAddress() {
		return resourceAddress;
	}
}
