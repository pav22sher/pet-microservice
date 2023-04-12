package com.example.hotelservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tmp_hotel")
public class Hotel {
    @Id
    @Column(name = "hotel_id")
    private String id;
    @Column(name="hotel_name")
    private String name;
    @Column(name="hotel_location")
    private String location;
    @Column(name="hotel_about")
    private String about;
}
