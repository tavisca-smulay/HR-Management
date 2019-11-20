package com.hrms.main;
import com.hrms.businessLogic.EmployeeBL;
import com.hrms.businessLogic.HRBL;
import com.hrms.businessLogic.ReviewerBL;
import com.hrms.service.EmployeeService;
import com.hrms.service.RoleFactory;
import java.util.Scanner;

public class HRMSMain {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        Object role = RoleFactory.getRole();
        if(role instanceof HRBL){
            hrTask((HRBL)role);
        }
        else if(role instanceof ReviewerBL){
            reviewrTask((ReviewerBL)role);
        }
        else {
            employeeTask((EmployeeService) role);
        }
    }
    public static void hrTask(HRBL hr) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("1. Add Employee \n" +
                    "2. Remove Employee \n" +
                    "3. See History \n" +
                    "4 . Main menu \n"
            );
            n= sc.nextInt();
            switch (n){
                case  1:
                    hr.addEmployee();
                    break;
                case  2 :
                    hr.deleteEmployee(1);
                case 3:
                    hr.seeHistory();
                case 4:
                    mainMenu();
            }
        }while (n>0 && n<5);
    }
    public static void reviewrTask(ReviewerBL reviewer) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("1. Edit PA Form \n" +
                    "2. See Summary \n"+
                    "3 . Main menu \n"
            );
            n= sc.nextInt();
            sc.nextLine();
            switch (n){
                case  1:
                    reviewer.editPAForm(1,"good");
                    break;
                case  2 :
                    System.out.println("Enter Department : ");
                    String dept = sc.nextLine();
                    reviewer.seeReportSummary(dept);
                case 3:
                    mainMenu();
            }
        }while (n>0 && n<4);
    }

    public static void employeeTask(EmployeeService emp){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Employee Id");
        int id = sc.nextInt();
        boolean result = emp.validateEmployee(id);
        if(result) System.out.println("Valid Employee");
        else System.out.println("Employee doesn't exist");
    }
}