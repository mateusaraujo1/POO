package tarefa;

import java.util.ArrayList;

public class Canal {
    private String nome;
    private ArrayList<Programacao> programacoes = new ArrayList<Programacao>();
    
    public Canal() {
    }
    
    public Canal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Programacao> getProgramacoes() {
        return programacoes;
    }

    public void setProgramacoes(ArrayList<Programacao> programacoes) {
        this.programacoes = programacoes;
    }
    
    public void addProgramacao(Programacao p) {
        programacoes.add(p);
    }
    
    public void mostrarProgramacoes() {
        System.out.println("===== " + this.getNome() + " ======");
        for (int i = 0; i < programacoes.size(); i++) {
            System.out.println("--- PROGRAMAÇÃO " + i + " ---");
            programacoes.get(i).mostrarProgramacao();
            System.out.println("");
        }
    }
}
