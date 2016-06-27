package com.github.mvdslus.mrrs;

import java.util.Set;

public class Room {
	String name;
	String location;
	int capacity;
	Set<Facility> facilities;
	
	public Room(String name, String loc, int cap){
		this.name=name;
		this.capacity = cap;
		this.location = loc;
	}
	

	public Room(String name, String location, int capacity, Set<Facility> facilities) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.capacity = capacity;
		this.location = location;
		this.facilities = facilities;
	}


	public String getName() {
		return name;
	}

	public void setName(String roomName) {
		this.name = roomName;
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
	
	public Set<Facility> getFacilities(){
		return this.facilities;
	}
	
}
