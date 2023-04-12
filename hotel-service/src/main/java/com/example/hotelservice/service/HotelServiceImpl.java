package com.example.hotelservice.service;

import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> get() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow();
    }

    @Override
    public Hotel save(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.saveAndFlush(hotel);
    }
}
