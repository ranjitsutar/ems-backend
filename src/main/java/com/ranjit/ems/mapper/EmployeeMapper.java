package com.ranjit.ems.mapper;

import com.ranjit.ems.dto.EmpployeeDto;
import com.ranjit.ems.entity.Employee;

public class EmployeeMapper {

    public static EmpployeeDto mapToEmpployeeDto(Employee employee){
        return new EmpployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public  static Employee mapToEmployee(EmpployeeDto empployeeDto){

        return new Employee(
                empployeeDto.getId(),
                empployeeDto.getFirstName(),
                empployeeDto.getLastName(),
                empployeeDto.getEmail()
        );

    }
}
