/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.api2;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;



/**
 *
 * @author PICHAU
 */
public class Connection {
    private JdbcTemplate jdbcTemplate;
    private BasicDataSource dataSource;
    
    public Connection() {
    dataSource = new BasicDataSource();
    dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    dataSource.setUrl("jdbc:sqlserver://prepta.database.windows.net:1433;database=Prepta;user=grupo1@prepta;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
    dataSource.setUsername("grupo1");
    dataSource.setPassword("#prepta2021");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
    
}