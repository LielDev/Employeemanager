package com.example.employeemanager.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OfficeDTO {
    private long id;


    private String street;
    private String city;
    private String cap;
}
