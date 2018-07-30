/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

/**
 *
 * @author TOSHIBA
 */
@Service("employeeService")
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.getOne(id);
//        Employee emp=null;
//        try{
//            emp = employeeRepository.getOne(id);
//        } catch (Exception e){
//            
//        }
//        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    
    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

}
