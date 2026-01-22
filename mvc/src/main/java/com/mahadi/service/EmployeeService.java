package com.mahadi.service;

import com.mahadi.common.ICommonService;
import com.mahadi.dao.EmployeeDAO;
import com.mahadi.model.Employee;

import java.util.List;

public class EmployeeService implements ICommonService<Employee> {
    EmployeeDAO edao = new EmployeeDAO();
    @Override
    public void sendData(List<Employee> list) {
        Employee employee = new Employee(list.get(0).toString(), list.get(1).toString());
        edao.send(employee);
    }
}
