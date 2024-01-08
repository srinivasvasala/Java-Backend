package com.springboot.springjdbc1;

import com.springboot.springjdbc1.Model.Employee;
import com.springboot.springjdbc1.dao.Employeedao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class Springjdbc1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext  applicationContext = SpringApplication.run(Springjdbc1Application.class, args);
        Employeedao dao = applicationContext.getBean(Employeedao.class);
        try {
            List<Employee> employeeList = dao.findAllEmployees();
            employeeList.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
       /* ((ConfigurableApplicationContext).applicationContext).close();*/
    }

}
