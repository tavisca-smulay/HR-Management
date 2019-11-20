package com.hrms.dao;

import java.sql.*;

public class DBHelper {
    DBConnector dbConnector = new DBConnector();
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private Connection connection = null;

    public boolean insertToPAFormTAble(String query, int empID, double rating, String remarks){
        connection = dbConnector.connectToDB();
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, empID);
            preparedStatement.setDouble(2, rating);
            preparedStatement.setString(3, remarks);
            int rowCount = preparedStatement.executeUpdate(query);
            if(rowCount!=0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateToPAFormTable(String query){
        connection = dbConnector.connectToDB();
        try {
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate(query);
            if(rowCount!=0) return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void viewProfile(String query){
        connection = dbConnector.connectToDB();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            resultSet.next();
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
            System.out.println(resultSet.getString(5));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProfile(String query) {
        connection = dbConnector.connectToDB();
        try {
            statement = connection.createStatement();
            int rowCount = statement.executeUpdate(query);
            if(rowCount!=0) System.out.println("Updated Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertEmployeeData(int empID, String empName, String deptName, String skills, String role) {
        connection = dbConnector.connectToDB();
        try {
            preparedStatement = connection.prepareStatement("insert into employee values (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, empID);
            preparedStatement.setString(2, empName);
            preparedStatement.setString(3, deptName);
            preparedStatement.setString(4, skills);
            preparedStatement.setString(5, role);
            int rowCount = preparedStatement.executeUpdate();
            if(rowCount!=0) System.out.println("Employee Added");;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
