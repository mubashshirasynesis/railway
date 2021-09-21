package com.example.railwaymanagementsystem.Service;

import com.example.railwaymanagementsystem.Model.District;
import com.example.railwaymanagementsystem.Model.Station;
import com.example.railwaymanagementsystem.Repository.DistrictReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    DistrictReposiory districtReposiory;
    public List<District> get_district_list(){
        return districtReposiory.findAll();
    }
    public District save_district(District district){
        return districtReposiory.save(district);
    }
}
