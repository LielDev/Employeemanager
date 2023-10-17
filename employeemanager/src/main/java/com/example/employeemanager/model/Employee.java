package com.example.employeemanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, updatable = false, unique = true)
    private String name;
    private String lastname;
    private Date birthday;
    private Date hiringDate;
    private int contractDuration;// assumiamo la durata del contratto in mese
    private String phoneNumber;
    private String email;

}
