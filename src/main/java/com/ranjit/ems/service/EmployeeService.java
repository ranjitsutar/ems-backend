package com.ranjit.ems.service;

import com.ranjit.ems.dto.EmpployeeDto;
import com.ranjit.ems.entity.Employee;

public interface EmployeeService {
    EmpployeeDto createEmploye(EmpployeeDto empployeeDto);
    EmpployeeDto getEmployeeById(Long employeeId);
}
