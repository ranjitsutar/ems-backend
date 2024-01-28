package com.ranjit.ems.contoroller;

import com.ranjit.ems.dto.EmpployeeDto;
import com.ranjit.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Build Add Employee REST API
    @PostMapping("/save")
    public ResponseEntity<EmpployeeDto> createEmployee(@RequestBody EmpployeeDto empployeeDto){
       EmpployeeDto saveEmployee =employeeService.createEmploye(empployeeDto);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    // Build Get Employee REST API
@GetMapping("/{id}")
    public ResponseEntity<EmpployeeDto> getEmployeeById( @PathVariable("id") Long employeeId){

        EmpployeeDto empployeeDto=employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(empployeeDto);
    }

    // Build GE All Employee REST API

    @GetMapping("/alllEmployees")
    public  ResponseEntity<List<EmpployeeDto>> getAllEmploye(){

        List<EmpployeeDto> empployees= employeeService.getAllEmployee();
        return ResponseEntity.ok(empployees);



    }
}
