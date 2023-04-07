package aula11;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga do aluno " + this.nome);
    } // consigo acessar atributos da classe mãe, já q é do tipo protected

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
