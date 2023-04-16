package aula14;
public class Inscrito extends Pessoa{
    private String login;
    private int totalAssistido;

    public Inscrito(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    
    public void viuMaisUm() {
        
    }
}
