package com.example.railwaymanagementsystem.Model;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Train_Station_mapping_table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    Time time;

}
