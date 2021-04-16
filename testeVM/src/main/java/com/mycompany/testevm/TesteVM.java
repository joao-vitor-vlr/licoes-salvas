/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testevm;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import java.util.List;
import java.util.Scanner;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 *
 * @author celia.taniwaki
 */
public class TesteVM {
    
    public static void main(String[] args) {
      
        Connection config = new Connection();
       
        JdbcTemplate con = new JdbcTemplate(config.getDataSource());
        
        Looca looca = new Looca();
        Processador processador = looca.getProcessador();
        
        System.out.println(processador.getId());
        Memoria memoria = looca.getMemoria();
        
        
        String insertStatement = "insert into maquina(idProcessador) values (?);";
        String memoriaStatement = "insert into memoria(MemoriaUso, MemoriaDisponivel, fkProcessador) values (?,?,?);";
        
        String nomeMaquina = "Maquina Teste";
        String idProcessador = processador.getId();
        Float RAMTotal = Float.valueOf(memoria.getTotal()/1000000000);
        Float MemoriaUso = Float.valueOf(memoria.getEmUso());
        Float MemoriaDisponivel = Float.valueOf(memoria.getDisponivel());
       
        con.update(insertStatement,idProcessador);
        con.update(memoriaStatement, MemoriaUso,MemoriaDisponivel, idProcessador);
        
         
    }
}
