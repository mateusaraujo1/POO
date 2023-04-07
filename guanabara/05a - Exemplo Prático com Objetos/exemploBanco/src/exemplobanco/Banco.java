package exemplobanco;

public class Banco {
    public int numConta;
    protected String tipo; //poupança ou corrente
    private String dono;
    private float saldo;
    private boolean status; //0 = fechado & 1 = aberto
    private int numContaMaisRecente = 0;
    
    public Banco(String d, String t){
        this.dono = d;
        this.tipo = t;
        this.status = false;
        this.saldo = 0.0f;
        this.numConta = numContaMaisRecente + 1;
        numContaMaisRecente++;
    }
    
    public void abrirConta() {
        if (!this.status) {
            this.status = true;
            
            if (this.tipo == "cp") 
                this.saldo += 150;
            else if (this.tipo == "cc")
                this.saldo += 50;
                
            System.out.println("Conta aberta com sucesso.");
        }
        else
            System.out.println("A conta já está aberta");
    }
    
    public void fecharConta() {
        if (this.status && this.saldo >= 0) {
            this.status = false;
            System.out.println("Conta fechada com sucesso.");
        }
        else if (this.status && this.saldo < 0)
            System.out.println("Você possui pendências a pagar");
        else
            System.out.println("A conta já está fechada.");
    }
    
    public void depositar(int deposito) {
        if (this.status) {
            this.saldo += deposito;
        }
        else
            System.out.println("Sua conta está fechada.");
    }
    
    public void sacar(int saque) {
        if (this.status && this.saldo >= saque) {
            this.saldo -= saque;
        }
        else if (this.status && this.saldo < saque)
            System.out.println("Saldo insuficiente.");
        else
            System.out.println("Sua conta está fechada.");
    }
    
    public void pagarMensal() {
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void statusConta() {
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Aberta: " + this.getStatus());
    }
}
