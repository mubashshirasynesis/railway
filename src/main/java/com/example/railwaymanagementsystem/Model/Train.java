package com.example.railwaymanagementsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long no_of_seats;

    @Column(nullable = true,updatable = false)
    @CreatedDate
    private Date day;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "train")
    List<Train_Station_mapping_table> mapTable;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "train")
    List<Booking> booking;



}
