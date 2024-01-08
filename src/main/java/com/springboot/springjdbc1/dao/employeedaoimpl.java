package com.springboot.springjdbc1.dao;

import com.springboot.springjdbc1.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class employeedaoimpl implements Employeedao {
    private static final String SQL_SELECT_QUERY = "select  eid,ename,eage,eaddress from employees";
    @Autowired
    private DataSource dataSource;
    @Override
    public  List<Employee> findAllEmployees() throws SQLException {
        System.out.println("DataSource Name ::"+dataSource.getClass().getName());
        List<Employee> employeeList = null;
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_QUERY)){
            ResultSet  resultSet =preparedStatement.executeQuery();
            employeeList = new ArrayList<>();
            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setEid(resultSet.getInt(1));
                employee.setEname(resultSet.getString(2));
                employee.setEage(resultSet.getInt(3));
                employee.setEaddress(resultSet.getString(4));
                employeeList.add(employee);
            }

        }
        return employeeList;
    }
}
