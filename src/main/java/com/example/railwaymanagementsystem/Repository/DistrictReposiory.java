package com.example.railwaymanagementsystem.Repository;

import com.example.railwaymanagementsystem.Model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictReposiory extends JpaRepository<District,Long> {
}
