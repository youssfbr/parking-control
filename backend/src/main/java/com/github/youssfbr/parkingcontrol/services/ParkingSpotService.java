package com.github.youssfbr.parkingcontrol.services;

import com.github.youssfbr.parkingcontrol.entities.ParkingSpot;
import com.github.youssfbr.parkingcontrol.repositories.IParkingSpotRepository;
import com.github.youssfbr.parkingcontrol.services.interfaces.IParkingSpotService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class ParkingSpotService implements IParkingSpotService {

    private final IParkingSpotRepository parkingSpotRepository;

    @Override
    @Transactional
    public ParkingSpot save(ParkingSpot parkingSpot) {

        return parkingSpotRepository.save(parkingSpot);
    }
}
