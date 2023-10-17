package com.example.employeemanager.service;

import com.example.employeemanager.converter.OfficeConverter;
import com.example.employeemanager.dto.OfficeDTO;
import com.example.employeemanager.dto.RoleDTO;
import com.example.employeemanager.model.Office;
import com.example.employeemanager.model.Role;
import com.example.employeemanager.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OfficeService extends AbstractService<Office, OfficeDTO>{
    @Autowired
    private OfficeConverter converter;

    @Autowired
    private OfficeRepository repository;


        public Office update(Long id, OfficeDTO officeDto) throws ChangeSetPersister.NotFoundException {
            Optional<Office> existingOffice = repository.findById(id);

            if (existingOffice.isPresent()) {
                Office office = existingOffice.get();
                office.setStreet(officeDto.getStreet());
                office.setCity(officeDto.getCity());
                office.setCap(officeDto.getCap());

                return repository.save(office);
            } else {
                throw new ChangeSetPersister.NotFoundException(); // Gestisce le exception non trovate
            }
        }
    }








