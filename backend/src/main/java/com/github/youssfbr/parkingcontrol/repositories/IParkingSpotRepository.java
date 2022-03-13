package com.github.youssfbr.parkingcontrol.repositories;

import com.github.youssfbr.parkingcontrol.entities.ParkingSpot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {
}
