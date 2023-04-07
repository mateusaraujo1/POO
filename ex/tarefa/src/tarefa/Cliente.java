package tarefa;
public class Cliente extends Pessoa{
    private int codigo;

    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mostrarCliente() {
        System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\ncódigo: " + this.getCodigo());
    }
}
