package tarefa;
public class Programacao {
    private String nome;
    private String inicio;
    private String fim;
    
    public Programacao() {
    }

    public Programacao(String nome, String inicio, String fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }
    
    public void mostrarProgramacao() {
        System.out.println("--- " + this.getNome() + " ---");
        System.out.println("Início: " + this.getInicio() + "\nFim: " + this.getFim());
    }
}
