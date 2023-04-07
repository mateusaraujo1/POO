package exemplobanco;

public class exemploBanco {
    public static void main(String[] args) {
        Banco b1 = new Banco("Mateus", "poupança");
        b1.abrirConta();
        b1.depositar(100);
        b1.sacar(30);
        b1.statusConta();
    }
}
