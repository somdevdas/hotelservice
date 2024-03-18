package com.hotel.services;

import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {

	//Create
	Hotel create(Hotel hotel);
	
	//Get All Hotels
	List<Hotel> getAll();
	
	//Get single hotel
	Hotel get(String id);
}
