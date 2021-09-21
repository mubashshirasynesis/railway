package com.example.railwaymanagementsystem.Repository;

import com.example.railwaymanagementsystem.Model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station,Long> {
}
