package com.example.employeemanager.service;

import java.util.List;

public interface ServiceDTO<DTO> {

    public DTO getById(long id);
    public List<DTO> getAll();
    public  DTO create(DTO dto);

    public void delete(long id);

}
