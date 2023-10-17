package com.example.employeemanager.controller;

import com.example.employeemanager.dto.EmployeeDTO;
import com.example.employeemanager.model.Employee;
import com.example.employeemanager.service.EmployeeService;
import com.example.employeemanager.service.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController<DTO> {
    @Autowired
    private EmployeeService service;

    @GetMapping("/read/{id}")
    public EmployeeDTO read(long id) {
        return service.getById(id);
    }

  //  @GetMapping("/employee?filter={filter}&sort={sort}")
   // public List<EmployeeDTO> getAll(){
      //  return service.getEmployeesConFilter();
  //  }

    @PostMapping("/insert")
    public EmployeeDTO createEmployee (@RequestBody EmployeeDTO dto) {
        service.create(dto);
        return dto;
    }


    @PutMapping("/update/{id}")
    public EmployeeDTO update(@RequestParam("id") long id,@RequestBody EmployeeDTO dto){
        service.updateEmployee(id,dto);
        return dto;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@RequestParam("id") long id) {
        service.delete(id);
    }



}
