package com.example.railwaymanagementsystem.Service;

import com.example.railwaymanagementsystem.Model.Station;
import com.example.railwaymanagementsystem.Repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StationService {
    @Autowired
    StationRepository stationRepository;
    public List<Station> get_station_list(){
        return stationRepository.findAll();
    }
    public Station save_station(Station station){
        return stationRepository.save(station);
    }
}
