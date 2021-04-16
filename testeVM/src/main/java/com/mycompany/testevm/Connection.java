/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testevm;


import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Connection {
    private JdbcTemplate jdbcTemplate;
    private BasicDataSource dataSource;
    
    public Connection() {
    dataSource = new BasicDataSource();
    dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    dataSource.setUrl("jdbc:sqlserver://bdcosplay.database.windows.net:1433;database=prepta;user=Joao.vitorvalera@bdcosplay;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
    dataSource.setUsername("Joao.vitorvalera");
    dataSource.setPassword("Pytuko43672440");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}

