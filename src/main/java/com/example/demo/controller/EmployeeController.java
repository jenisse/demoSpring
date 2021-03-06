/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

/**
 *
 * @author TOSHIBA
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    //@CrossOrigin(origins = "http://localhost:4200") //uncomment when using with angularcli
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/show-employee/{id}", method = RequestMethod.GET)
    //@CrossOrigin(origins = "http://localhost:4200") //uncomment when using with angularcli
    public Employee getEmployee(@PathVariable("id") long id) {
        return employeeService.getEmployeeById(id);
    }
    
    @RequestMapping(value = "/new-employee", method = RequestMethod.POST)
    //@CrossOrigin(origins = "http://localhost:4200") //uncomment when using with angularcli
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee ) {
        employeeService.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    
    //Actually this has to be a logic deletion but.. later in a new fix
    @RequestMapping(value="/delete-employee/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:4200") //uncomment when using with angularcli
    public void deleteEmployee(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);
    }
    
    @RequestMapping(value = "/edit-employee", method = RequestMethod.PUT)
    //@CrossOrigin(origins = "http://localhost:4200") //uncomment when using with angularcli
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee ) {
        employeeService.updateEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
