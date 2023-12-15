package com.akritisingh.springboot.cruddemo.dao;

import com.akritisingh.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
