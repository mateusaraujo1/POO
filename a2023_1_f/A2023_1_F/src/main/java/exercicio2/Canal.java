/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.ArrayList;

/**
 *
 * @author placi
 */
public class Canal {
   private String nome;
   private ArrayList<Programacao> programacao = new ArrayList();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Canal() {
    }

    public Canal(String nome) {
        this.nome = nome;
    }




    public void adicinarProgramacao(String nome, String inicio, String fim){
        programacao.add(new Programacao(nome,inicio,fim));
    }
   
    public void removerProgramacao(int i){
       if (i <programacao.size())
         programacao.remove(i-1);

    }
    public void removerProgramacao(String s){
        for (Programacao p:programacao){
           if (s.equals(p.getInicio())){
               programacao.remove(p);
               break;
           }             
        }
    }

    public void imprimir(){
        System.out.println("Canal : "+ nome);
        for (Programacao p: programacao){
            System.out.println(p.getNome());
            System.out.println(p.getInicio());
            System.out.println(p.getFim());
        }
    }


        
}
