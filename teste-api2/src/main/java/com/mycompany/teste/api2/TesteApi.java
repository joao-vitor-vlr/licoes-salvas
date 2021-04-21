/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.api2;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.util.List;

/**
 *
 * @author PICHAU
 */
public class TesteApi {

    
    public static void main(String[] args) {
        Looca looca = new Looca();
        Sistema sistema = looca.getSistema();
        sistema.getPermissao();
        sistema.getFabricante();
        sistema.getArquitetura();
        sistema.getInicializado();
        sistema.getSistemaOperacional();
        sistema.getTempoDeAtividade();
        System.out.println(sistema);
        System.out.println("-------------------------");
        
        Memoria memoriaUso = looca.getMemoria();
      
        memoriaUso.getEmUso();
        
        System.out.println(memoriaUso);
        System.out.println("-------------------------");
        
        
       
        
        Processador processador = looca.getProcessador();
        
        processador.getNome();
        
        System.out.println(processador.getNome());
        
        
        Memoria memoria = looca.getMemoria();
        
        memoria.getTotal();
        
        System.out.println(memoria);
        
        
        
        
        
    }
    
}
