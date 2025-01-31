package com.idld.cinema.service.service.impl;

import com.idld.cinema.service.model.cinema;
import com.idld.cinema.service.payload.dto.CinemaDTO;
import com.idld.cinema.service.payload.dto.UserDTO;
import com.idld.cinema.service.service.cinemaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServieImpl implements cinemaService {
    @Override
    public cinema createCinema(CinemaDTO cinema, UserDTO user) {
        return null;
    }

    @Override
    public cinema updateCinema(CinemaDTO cinema, UserDTO user, Long cinemaId) {
        return null;
    }

    @Override
    public List<cinema> getAllCinemas() {
        return null;
    }

    @Override
    public cinema getCinemaById(Long cinemaId) {
        return null;
    }

    @Override
    public cinema getCinemaByOwnerId(Long ownerId) {
        return null;
    }

    @Override
    public List<cinema> searchCinemaByCity(String city) {
        return null;
    }
}
