package com.example.employeemanager.controller;

import com.example.employeemanager.dto.OfficeDTO;
import com.example.employeemanager.dto.RoleDTO;
import com.example.employeemanager.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService service;

    @GetMapping("/read/{id}")
    public RoleDTO read(long id) {
        return service.getById(id);
    }

    @GetMapping("/getall")
    public List<RoleDTO> getRoles(){
        return service.getAll();
    }

    @PostMapping("/insert")
    public RoleDTO createRole (@RequestBody RoleDTO dto) {
        service.create(dto);
        return dto;
    }


    @PutMapping("/update/{id}")
    public RoleDTO update(@RequestParam("id") long id,@RequestBody RoleDTO dto) throws ChangeSetPersister.NotFoundException {
        service.updateRole(id,dto);
        return dto;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@RequestParam("id") long id) {
        service.delete(id);
    }
}
