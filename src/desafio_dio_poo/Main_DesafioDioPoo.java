/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_dio_poo;
import desafio_dio_poo.Mentoria;
import desafio_dio_poo.Dev;

import java.time.LocalDate;

/**
 *
 * @author Edna
 */
public class Main_DesafioDioPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do curso em Java");
        curso1.setCargaHoraria(8);
        
         Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição do curso em JavaScript");
        curso2.setCargaHoraria(8);
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcampo java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp JavaScript Avançado");
        bootcamp2.setDescricao("Descrição do Bootcampo JavaScript Avançado");
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria);
        
        Dev desenvolvedor = new Dev();
        desenvolvedor.setNome("Edna");
        desenvolvedor.inscreverBootcamp(bootcamp);
        desenvolvedor.progredir();
        desenvolvedor.inscreverBootcamp(bootcamp);
        desenvolvedor.inscreverBootcamp(bootcamp);
       
        System.out.println(desenvolvedor.getNome()+ " \n"+ "Conteúdos Inscritos: "
                + desenvolvedor.getConteudosInscritos());
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Edna:" + desenvolvedor.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Edna:" + desenvolvedor.getConteudosConcluidos());
        System.out.println("XP:" + desenvolvedor.calcularTotalXP());
        
        System.out.println(" --------------------------------------- ");
        
        Dev desenvolvedor2 = new Dev();
        desenvolvedor.setNome("Maria Mingau");
        desenvolvedor2.inscreverBootcamp(bootcamp);
        desenvolvedor2.progredir();
        desenvolvedor2.inscreverBootcamp(bootcamp);
        System.out.println(desenvolvedor.getNome()+ " \n"+"Conteúdos Inscritos: "
                + desenvolvedor2.getConteudosInscritos());
        desenvolvedor2.progredir();
        desenvolvedor2.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria Mingau:" + desenvolvedor2.getConteudosInscritos());
        desenvolvedor2.progredir();
        desenvolvedor2.progredir();
        desenvolvedor2.progredir();
        desenvolvedor2.progredir();
        System.out.println("Conteúdos Concluidos Maria Mingau:" + desenvolvedor2.getConteudosConcluidos());
        System.out.println("XP:" + desenvolvedor2.calcularTotalXP());
        
        
        
        
        
    }
    
}
