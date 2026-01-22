package com.mahadi.controller;

import com.mahadi.model.Employee;
import com.mahadi.service.EmployeeService;

import java.util.*;

public class EmployeeController implements IController<Employee>{
    static EmployeeService employeeService = new EmployeeService();
    @Override
    public void create(Employee employee) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Initializing Program");
        System.out.println("...........");
        System.out.println("...........");
        System.out.print("Enter your name: ");
        String eName = sc.nextLine();
        System.out.print("Enter your address: ");
        String eAddress = sc.nextLine();

        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee(eName, eAddress);
        employees.add(employee);

        Map<String, Object> map = new HashMap<>();
        map.put("List", employees);

        List<Employee> employeeList = (List<Employee>) map.get("List");

        for (Employee list: employeeList){
            System.out.println("Name : " + list.geteName());
            System.out.println("Address: " + list.geteAddress());
        }
    }
}
