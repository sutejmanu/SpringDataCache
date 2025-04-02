package com.example.SpringDataCache.dao;

import com.example.SpringDataCache.model.Employees;
import com.example.SpringDataCache.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    @Cacheable(value = "allEmployees")
    public List<Employees> getEmployees() {

        return employeeRepository.findAll();
    }

    @CacheEvict(value = "allEmployees" , allEntries = true)
    public void saveEmployee(Employees employees) {

        employeeRepository.save(employees);
    }
}
