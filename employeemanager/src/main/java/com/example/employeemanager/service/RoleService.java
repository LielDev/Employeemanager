package com.example.employeemanager.service;

import com.example.employeemanager.converter.RoleConverter;
import com.example.employeemanager.dto.RoleDTO;
import com.example.employeemanager.model.Role;
import com.example.employeemanager.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService extends AbstractService<Role, RoleDTO> {
    @Autowired
    private RoleConverter converter;

    @Autowired
    private RoleRepository repository;

    public Role updateRole(Long id, RoleDTO roleDto) {
        Optional<Role> existingRole = repository.findById(id);

        if (existingRole.isPresent()) {
            Role role = existingRole.get();
            // Mettez à jour les propriétés du rôle avec les valeurs du DTO
            role.setType(roleDto.getType());
            role.setDescription(roleDto.getDescription());

            // Enregistrez la mise à jour dans la base de données
            return repository.save(role);
        } else {
            return null; // Renvoyez null si le rôle n'existe pas
        }
    }
}
