package com.example.SpringDataCache.controller;



import com.example.SpringDataCache.dao.EmployeeDao;
import com.example.SpringDataCache.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/getEmp")
    public List<Employees> getAllEmployees(){

        return employeeDao.getEmployees();
    }

    @PostMapping("/saveEmp")
    public String saveEmp(@RequestBody Employees employees){

         employeeDao.saveEmployee(employees);
        return "Employee inserted successfully";
    }

}
