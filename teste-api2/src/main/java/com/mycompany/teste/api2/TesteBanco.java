/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.api2;
import org.springframework.jdbc.core.JdbcTemplate;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author PICHAU
 */
public class TesteBanco {
    public static void main(String[] args) {
        
        Connection config = new Connection();
        JdbcTemplate con = new JdbcTemplate(config.getDataSource());
        
        Looca looca = new Looca();
        Sistema sistema = looca.getSistema();
        Memoria memoria = looca.getMemoria();
        Processador processador = looca.getProcessador();
        DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
        
        String hostName = "TesteVM", processadorNome = processador.getNome();
        Double RAMTotal = Double.valueOf(memoria.getTotal());
        
        String maquinaStatement = "insert into maquina(hostName,processadorNome,RAMTotal) values(?,?,?);";
        
       con.update(maquinaStatement,hostName,processadorNome,RAMTotal);
       
//--------------------------------------------------------------------------------------------------
        LocalDate dataHora = LocalDate.now();
        String relatorioStatement = "insert into relatorioMaquina(dataHora,cpuMaquina,memoria,maquina_IPmaquina) values(?,?,?,?);";
        String discoStatement = "insert into discos(nomeDisco,discoTotal,fkMaquina) values(?,?,?);";
        Double cpuMaquina = Double.valueOf(processador.getFrequencia()),
                ramUso = Double.valueOf(memoria.getEmUso());
        Integer maquinaIp = 23;
        
        StringBuilder str = new StringBuilder();
        
       
        List<Disco> discos = grupoDeDiscos.getDiscos();
        System.out.println(grupoDeDiscos.getDiscos());
        for (Disco disco : discos) {
            
             
             //con.update(discoStatement,);
            }
        con.update(relatorioStatement,dataHora,cpuMaquina,ramUso,maquinaIp); 
//---------------------------------------------------------------------------------------        
        ProcessosGroup grupoDeProcessos = looca.getGrupoDeProcessos();
        List<Processo> processos = grupoDeProcessos.getProcessos();
        String processoStatement = "insert into processos(dataHora, nomeProcessos, cpuUso, memoriaUso, maquina_IPmaquina, PID) values (?,?,?,?,?,?);";
        for(Processo s : processos){
            //con.update(processoStatement, dataHora,s.getNome(),s.getUsoCpu(),s.getUsoMemoria(),23,s.getPid());
            }  
    }
    
}
