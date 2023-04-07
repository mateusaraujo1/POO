package tarefa;

import java.util.ArrayList;

public class Pacote {
    private String nome;
    private ArrayList<Canal> canais = new ArrayList<Canal>();

    public Pacote() {
    }
    
    public Pacote(String nome) {
        this.nome = nome;
    }
    
    
    public void adicionaCanal(Canal c) {
        canais.add(c);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Canal> getCanais() {
        return canais;
    }

    public void setCanais(ArrayList<Canal> canais) {
        this.canais = canais;
    }
    
    public void mostrarPacotes() {
        System.out.println("======== " + this.getNome() + " =========");
        for (int i = 0; i < canais.size(); i++) {
            canais.get(i).mostrarProgramacoes();
        }
    }
}
