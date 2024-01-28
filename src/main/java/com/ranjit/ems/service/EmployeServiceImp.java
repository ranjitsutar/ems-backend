package com.ranjit.ems.service;

import com.ranjit.ems.dto.EmpployeeDto;
import com.ranjit.ems.entity.Employee;
import com.ranjit.ems.exception.ResourceNotFoundException;
import com.ranjit.ems.mapper.EmployeeMapper;
import com.ranjit.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImp implements  EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmpployeeDto createEmploye(EmpployeeDto empployeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(empployeeDto);
        Employee saveEmployee=employeeRepository.save(employee);

        return EmployeeMapper.mapToEmpployeeDto(saveEmployee);
    }

    @Override
    public EmpployeeDto getEmployeeById(Long employeeId) {
        Employee empployee= employeeRepository.findById(employeeId).
                orElseThrow( ()-> new ResourceNotFoundException(
                        "Employee Not Exists with given id : " + employeeId  ));
        return  EmployeeMapper.mapToEmpployeeDto(empployee);    }


}
