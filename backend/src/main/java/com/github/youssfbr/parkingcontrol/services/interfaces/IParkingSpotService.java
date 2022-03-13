package com.github.youssfbr.parkingcontrol.services.interfaces;

import com.github.youssfbr.parkingcontrol.dtos.ParkingSpotDto;
import com.github.youssfbr.parkingcontrol.entities.ParkingSpot;

public interface IParkingSpotService {

    ParkingSpot save(ParkingSpot parkingSpot);
}
