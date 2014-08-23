package com.benjih.ld30;

public enum SolarSystemPosition {
	POSITION_1(100, 10), POSITION_2(100, 100), POSITION_3(100, 200), POSITION_4(100, 300), POSITION_5(100,400);
	
	private int x, y;
	
	private SolarSystemPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
