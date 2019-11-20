package com.hrms.service;

import com.hrms.businessLogic.ReviewerBL;

public class ReviewerService extends EmployeeService {
    private ReviewerBL reviewerBL;
    public boolean editPAForm(int empID, String remark){
        return reviewerBL.editPAForm(empID, remark);
    }

    public void seeSummaryReport(String departmentName){
        reviewerBL.seeReportSummary(departmentName);
    }
}
