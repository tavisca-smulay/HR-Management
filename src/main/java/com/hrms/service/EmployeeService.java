package com.hrms.service;

import com.hrms.businessLogic.EmployeeBL;

public class EmployeeService {
    EmployeeBL employeeBL = new EmployeeBL();

    public void viewProfile(int empID){
        employeeBL.viewProfile(empID);
    }

    public void updateProfile(int empID, String columnToUpdate, String newColumnContent){
        employeeBL.updateProfile(empID, columnToUpdate, newColumnContent);
    }

    public boolean fillPAForm(int empID, double rating, String remarks){
        return employeeBL.fillPAForm(empID, rating, remarks);
    }
}
