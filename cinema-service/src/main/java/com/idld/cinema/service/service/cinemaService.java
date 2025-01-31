package com.idld.cinema.service.service;

import com.idld.cinema.service.model.cinema;
import com.idld.cinema.service.payload.dto.CinemaDTO;
import com.idld.cinema.service.payload.dto.UserDTO;

import java.util.List;

public interface cinemaService {
 cinema createCinema(CinemaDTO cinema, UserDTO user );
 cinema updateCinema(CinemaDTO cinema, UserDTO user,Long cinemaId );
 List<cinema> getAllCinemas();
 cinema getCinemaById(Long cinemaId );
 cinema getCinemaByOwnerId(Long ownerId );
 List<cinema> searchCinemaByCity(String city);



}

