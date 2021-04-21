/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.api2;
import org.springframework.jdbc.core.JdbcTemplate;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
/**
 *
 * @author PICHAU
 */
public class TesteBanco {
        
    public static void main(String[] args) {
        
    
        Sistema sistema = new Sistema();
        
       
        /*String setor;*/
        Connection config = new Connection();
        JdbcTemplate con = new JdbcTemplate(config.getDataSource());
       
       //con.queryForList(String.format("insert into setor(nomeSetor) values ('%s');", sistema.getArquitetura()));
       //con.queryForList(String.format("insert into setor(nomeSetor) values ('%s');", sistema.getInicializado()));
       //con.queryForList(String.format("insert into setor(nomeSetor) values ('%s');", sistema.getTempoDeAtividade()));
    }
}
