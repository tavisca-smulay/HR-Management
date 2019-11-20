package com.hrms.businessLogic;

import com.hrms.dao.DBHelper;
import com.hrms.model.Employee;

import java.util.Scanner;

public class HRBL extends EmployeeBL{

    public void addEmployee() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter emp id");
        int empID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter emp name");
        String empName = sc.nextLine();
        System.out.println("Enter emp Department Name");
        String deptName = sc.nextLine();
        System.out.println("Enter emp Skills");
        String skills = sc.nextLine();
        System.out.println("Enter emp Role");
        String role = sc.nextLine();
        Employee employee = new Employee(empID,empName,deptName,skills,role);
        DBHelper dbHelper = new DBHelper();
        dbHelper.insertEmployeeData(empID,empName,deptName,skills,role);
    }

    public void deleteEmployee(){
        System.out.println("delete Employee");
    }

    public void seeHistory(){
        System.out.println("See History");
    }

    public void seeSummaryReport(String departmentName){
        System.out.println("Summary Report");
    }
}
