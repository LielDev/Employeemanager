package com.example.employeemanager.controller;

import com.example.employeemanager.dto.EmployeeDTO;
import com.example.employeemanager.dto.OfficeDTO;
import com.example.employeemanager.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/office")
public class OfficeController {
    @Autowired
    private OfficeService service;

    @GetMapping("/read/{id}")
    public OfficeDTO read(long id) {
        return service.getById(id);
    }

   @GetMapping("/getall")
    public List<OfficeDTO> getOffices(){
        return service.getAll();
   }

    @PostMapping("/insert")
    public OfficeDTO createOffice (@RequestBody OfficeDTO dto) {
        service.create(dto);
        return dto;
    }


    @PutMapping("/update/{id}")
    public OfficeDTO update(@RequestParam("id") long id,@RequestBody OfficeDTO dto) throws ChangeSetPersister.NotFoundException {
        service.update(id,dto);
        return dto;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@RequestParam("id") long id) {
        service.delete(id);
    }

}
