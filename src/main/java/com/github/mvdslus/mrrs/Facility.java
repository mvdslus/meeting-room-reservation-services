package com.github.mvdslus.mrrs;

public class Facility {
	
	
	String facilityName;
	
	public Facility(String name){
		facilityName = name;
	}
	
	public String getName(){
		return facilityName;
	}
	
	public int compareTo(Facility other){
		int retVal = 0;
		if (this.facilityName.equals(other.getName())){
			retVal = 1;
		}
		return 0;
	}

}
