package com.example.employeemanager.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {

    private Long id;


    private String name;
    private String lastname;
    private Date birthday;
    private Date hiringDate;
    private int contractDuration;
    private String phoneNumber;
    private String email;

}
