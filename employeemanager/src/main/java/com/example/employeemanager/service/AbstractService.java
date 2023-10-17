package com.example.employeemanager.service;

import com.example.employeemanager.converter.Converter;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AbstractService <Entity,DTO> implements ServiceDTO<DTO>{

    @Autowired
    protected JpaRepository<Entity,Long> jpaRepository;

    @Autowired
    protected Converter<Entity,DTO> converter;

    public AbstractService(){

    }


    @Override
    public DTO getById(long id) {
        return converter.toDTO(jpaRepository.findById(id).get());
    }

    @Override
    public List<DTO> getAll() {
        return converter.toDTOList(jpaRepository.findAll());
    }

    @Override
    public DTO create(DTO dto) {
        return converter.toDTO(jpaRepository.save(converter.toEntity(dto)));
    }






    @Override
    public void delete(long id) {
        jpaRepository.deleteById(id);

    }
}
