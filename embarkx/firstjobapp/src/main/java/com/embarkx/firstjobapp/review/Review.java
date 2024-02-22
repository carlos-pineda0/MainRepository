package com.embarkx.firstjobapp.review;


import com.embarkx.firstjobapp.company.Company;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Company company;

}
