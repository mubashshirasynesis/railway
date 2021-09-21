package com.example.railwaymanagementsystem.Repository;

import com.example.railwaymanagementsystem.Model.Train_Station_mapping_table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainStationMappingRepository extends JpaRepository<Train_Station_mapping_table,Long> {
}
