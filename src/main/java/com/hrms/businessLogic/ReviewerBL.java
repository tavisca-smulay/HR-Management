package com.hrms.businessLogic;

import com.hrms.dao.DBHelper;

public class ReviewerBL extends EmployeeBL{
    String query = null;
    private DBHelper dbHelper = null;

    public boolean editPAForm(int empID, String remark){
        query = "update pa_form set remarks = " + remark + "where empID = " + empID;
        return dbHelper.updateToPAFormTable(query);
    }

    public void seeReportSummary(String departmentName){
        System.out.println("Summary Report");
    }
}
