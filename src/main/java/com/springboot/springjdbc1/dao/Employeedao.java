package com.springboot.springjdbc1.dao;

import com.springboot.springjdbc1.Model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface Employeedao {
public List<Employee> findAllEmployees() throws SQLException;
}
