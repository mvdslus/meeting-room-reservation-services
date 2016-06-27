package com.github.mvdslus.mrrs.domain;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.github.mvdslus.mrrs.Facility;
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
    
    @Test(expected = IllegalArgumentException.class)
    public void createBasicRoomNoLocation() throws Exception {
        String location = null;
        int capacity = 12;
        Room room = new Room(location, null, capacity);
        assertEquals(room.getCapacity(), null);
    }
    
    @Test
    public void createRoomWithFacilities() throws Exception {
        String name = "Moscow";
        String location = "02.04";
        int capacity = 10;
        Set<Facility> facilities = new TreeSet<>();
        
        facilities.add(new Facility("whiteboard"));
        facilities.add(new Facility("beamer"));
        Room room = new Room(name, location, capacity, facilities);
        
        assertEquals(room.getName(), name);
        assertEquals(room.getLocation(), location);
        assertEquals(room.getCapacity(), capacity);
        assertEquals(room.getFacilities(), facilities);
    }
    
    @Test
    public void compare() throws Exception {
        Facility whiteboard = new Facility("whiteboard");
        Facility beamer = new Facility("beamer");
        assertTrue(whiteboard.compareTo(beamer) > 0);
        assertTrue(beamer.compareTo(whiteboard) < 0);
    }
}
