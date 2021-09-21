package com.example.railwaymanagementsystem.Controller;

import com.example.railwaymanagementsystem.Model.District;
import com.example.railwaymanagementsystem.Model.Station;
import com.example.railwaymanagementsystem.Service.DistrictService;
import com.example.railwaymanagementsystem.Service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictController {
    @Autowired
    DistrictService districtService;
    @GetMapping("/get_district_list")
    public List<District> get_station_list(){
        return districtService.get_district_list();
    }
    @PostMapping("/save_district")
    public District save_train(@RequestBody District district){
        return districtService.save_district(district);
    }
}
