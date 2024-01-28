package com.ranjit.ems.dto;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpployeeDto {

    private long id;
    private  String firstName;
    private  String lastName;
    private  String email;


}
