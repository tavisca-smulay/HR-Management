package com.hrms.service;

import com.hrms.businessLogic.HRBL;

public class HRService extends EmployeeService {
    private HRBL hrbl;
    public void addEmployee() {

    }

    public void deleteEmployee(int empID){
        hrbl.deleteEmployee(empID);
    }

    public void seeHistory(){

    }

    public void seeSummaryReport(String departmentName){
        hrbl.seeReportSummary(departmentName);
    }
}
