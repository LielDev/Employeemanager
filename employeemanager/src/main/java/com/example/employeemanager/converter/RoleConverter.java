package com.example.employeemanager.converter;

import com.example.employeemanager.dto.RoleDTO;
import com.example.employeemanager.model.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter extends AbstractConverter<Role, RoleDTO> {
    @Override
    public Role toEntity(RoleDTO roleDTO) {
        Role role = null;
        if(roleDTO != null){
            role = new Role(role.getId(), role.getType(), role.getDescription());
        }
        return role;
    }

    @Override
    public RoleDTO toDTO(Role role) {
        RoleDTO roleDTO = null;
        if(role != null){
            roleDTO = new RoleDTO(roleDTO.getId(), roleDTO.getType(), role.getDescription());
        }
        return roleDTO;
    }
}
