package com.github.mvdslus.mrrs;

public class Room {
	String name;
	String location;
	int capacity;
	
	public Room(String name, String loc, int cap){
		this.name=name;
		this.capacity = cap;
		this.location = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String roomName) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String roomLocation) {
		this.location = roomLocation;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int roomCapacity) {
		this.capacity = roomCapacity;
	}
	
}
