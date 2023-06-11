package com.almas.spring.springboot.springboot_rest.service;


import com.almas.spring.springboot.springboot_rest.dao.EmployeeDAO;
import com.almas.spring.springboot.springboot_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int id) {
//        return employeeDAO.getEmployee(id);
//    }
//
//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDAO.saveEmployee(employee);
//    }
}
