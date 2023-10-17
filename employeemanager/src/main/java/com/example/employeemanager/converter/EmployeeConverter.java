package com.example.employeemanager.converter;

import com.example.employeemanager.dto.EmployeeDTO;
import com.example.employeemanager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter extends AbstractConverter<Employee, EmployeeDTO>{


    @Override
    public Employee toEntity(EmployeeDTO employeeDTO) {
       Employee employee = null;
       if(employeeDTO!=null){
           employee = new Employee(employee.getId(), employee.getName(), employee.getLastname(), employee.getBirthday(),
                   employee.getHiringDate(), employee.getContractDuration(), employee.getPhoneNumber(), employee.getEmail());
       }
        return employee;
    }

    @Override
    public EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = null;
        if(employee!= null){
            employeeDTO = new EmployeeDTO(employeeDTO.getId(), employeeDTO.getName(), employeeDTO.getLastname(), employeeDTO.getBirthday(),
                    employeeDTO.getHiringDate(), employee.getContractDuration(), employeeDTO.getPhoneNumber(), employeeDTO.getEmail());
        }
        return employeeDTO;
    }
}
