/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;
import java.util.List;

import com.example.demo.model.Employee;
/**
 *
 * @author TOSHIBA
 */
public interface EmployeeService {
    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
    void deleteEmployee(long id);
    void updateEmployee(Employee employee);
}
