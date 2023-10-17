package com.example.employeemanager.service;

import com.example.employeemanager.converter.EmployeeConverter;
import com.example.employeemanager.dto.EmployeeDTO;
import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService extends AbstractService<Employee, EmployeeDTO>{

    @Autowired
    private EmployeeConverter converter;

    @Autowired
    private EmployeeRepository repository;


/*
        public List<Employee> getEmployeesConFilter(String filter, String sort) {
            if (filter != null) {
                // Implémentez la logique de filtrage, par exemple, recherchez par nom ou d'autres critères
                repository.findByNomContaining(filter);
            }

            if (sort != null) {

                repository.findAll(Sort.by(Sort.Order.asc("nom")));
            }

            // Si ni le filtrage ni le tri ne sont spécifiés, récupérez tous les employés
            return repository.findAll();
        }
*/

        public Employee updateEmployee(Long id, EmployeeDTO employeeDto) {
            Optional<Employee> existingEmployee = repository.findById(id);

            if (existingEmployee.isPresent()) {
                Employee employee = existingEmployee.get();
                //Aggiornare le proprietà di Employee con i valori di DTO
                employee.setName(employeeDto.getName());
                employee.setLastname(employeeDto.getLastname());
                employee.setBirthday(employeeDto.getBirthday());
                employee.setHiringDate(employeeDto.getHiringDate());
                employee.setContractDuration(employeeDto.getContractDuration());
                employee.setPhoneNumber(employeeDto.getPhoneNumber());
                employee.setEmail(employeeDto.getEmail());


                return repository.save(employee);
            } else {
                return null; // Ritorna null se Employee non esiste
            }
        }
    }





