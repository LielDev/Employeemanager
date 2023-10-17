package com.example.employeemanager.converter;

import com.example.employeemanager.dto.OfficeDTO;
import com.example.employeemanager.model.Office;
import org.springframework.stereotype.Component;

@Component
public class OfficeConverter extends AbstractConverter<Office, OfficeDTO>{
    @Override
    public Office toEntity(OfficeDTO officeDTO) {
        Office office = null;
        if(officeDTO !=null){
            office = new Office(office.getId(), office.getStreet(), office.getCity(), office.getCap());
        }
        return office;
    }

    @Override
    public OfficeDTO toDTO(Office office) {
        OfficeDTO officeDTO = null;
        if(office != null) {
            officeDTO = new OfficeDTO(officeDTO.getId(), officeDTO.getStreet(), officeDTO.getCity(), officeDTO.getCap());
        }
        return officeDTO;
    }
}
