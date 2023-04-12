package com.example.hotelservice.service;

import com.example.hotelservice.model.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> get();
    Hotel getById(String hotelId);
    Hotel save(Hotel hotel);
}
