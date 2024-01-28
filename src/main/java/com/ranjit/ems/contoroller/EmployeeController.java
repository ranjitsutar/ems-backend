package com.ranjit.ems.contoroller;

import com.ranjit.ems.dto.EmpployeeDto;
import com.ranjit.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
@GetMapping("/{id}")
    public ResponseEntity<EmpployeeDto> getEmployeeById( @PathVariable("id") Long employeeId){

        EmpployeeDto empployeeDto=employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(empployeeDto);


    }


}
