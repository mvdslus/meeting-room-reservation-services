package com.github.mvdslus.mrrs.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.mvdslus.mrrs.Room;

public class RoomTest {

    @Test
    public void createBasicRoom() throws Exception {
        String name = "Berlin";
        String location = "03.02";
        int capacity = 12;
        Room room = new Room(name, location, capacity);
        
       assertEquals(room.getName(), name);
       assertEquals(room.getLocation(), location);
       assertEquals(room.getCapacity(), capacity);
    }

    
    @Test
    /*
     * It should ot be possible to create a room with e negative capacity
     */
    public void createRoomWithNegativeCapicity() throws Exception{
    	String name= " Negative";
    	String location = " 99.99";
    	int capacity = -3; 
    	Room room = new Room(name, location, capacity);
    	assertEquals(room.getCapacity(), capacity);
    	
    }
}
