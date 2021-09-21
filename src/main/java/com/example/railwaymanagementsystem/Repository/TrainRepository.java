package com.example.railwaymanagementsystem.Repository;

import com.example.railwaymanagementsystem.Model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Long>{
}
