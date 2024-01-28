package com.ranjit.ems.service;

import com.ranjit.ems.dto.EmpployeeDto;
import com.ranjit.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmpployeeDto createEmploye(EmpployeeDto empployeeDto);
    EmpployeeDto getEmployeeById(Long employeeId);

    List<EmpployeeDto> getAllEmployee();
    EmpployeeDto updateEmployee(Long employeeId,EmpployeeDto updatedempployee);
     void deleteEmployee(Long employeeId);
}
