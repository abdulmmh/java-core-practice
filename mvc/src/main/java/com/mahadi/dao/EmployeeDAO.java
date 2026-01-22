package com.mahadi.dao;

import com.mahadi.model.Employee;

public class EmployeeDAO implements IDAO<Employee> {
    @Override
    public void send(Employee employee) {
        System.out.println( "Name : " + employee.geteName() +
                " Address : " + employee.geteAddress());
    }
}
