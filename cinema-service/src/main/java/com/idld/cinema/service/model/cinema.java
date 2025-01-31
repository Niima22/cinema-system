package com.idld.cinema.service.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
public class cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ElementCollection
    private List<String> images; // Stores image URLs for the cinema

    @Column(nullable = false )
    private String address;

    @Column(nullable = false )
    private String phoneNumber;

    @Column(nullable = false )
    private String email;

    @Column(nullable = false )
    private String city;

    @Column(nullable = false)
    private boolean isOpen;

    @Column(nullable = false)
    private boolean active;

    @Column(nullable = false)
    private Long ownerId; // Links to user who owns the cinema (if applicable)

    @Column(nullable = false)
    private LocalTime openTime;

    @Column(nullable = false)
    private LocalTime closeTime;

}
