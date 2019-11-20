package com.hrms.businessLogic;

import com.hrms.dao.DBHelper;

public class EmployeeBL {
    private DBHelper dbHelper = new DBHelper();
    public void viewProfile(int empID){
        String query = "select * from employee where empID = " + empID;
        dbHelper.viewProfile(query);
    }

    public void updateProfile(int empID, String columnToUpdate, String newColumnContent){
        String query ="update employee set" + columnToUpdate + "= " + newColumnContent + "where empID = " + empID;
        dbHelper.updateProfile(query);
    }

    public boolean fillPAForm(int empID, double rating, String remarks){
        String query = "insert into pa_form values (?, ?, ?)";
        return dbHelper.insertToPAFormTAble(query, empID, rating, remarks);
    }

    public boolean validateEmployee(int empID){
        return dbHelper.validateEmployee(empID);
    }
}
