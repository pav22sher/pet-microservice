package com.example.userservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tmp_user")
public class User {
    @Id
    @Column(name = "user_id")
    private String id;
    @Column(name="user_name")
    private String name;
    @Column(name="user_email")
    private String email;
    @Column(name="user_about")
    private String about;
    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
