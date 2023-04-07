package aula4;

public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada; 
   
    public Caneta(String m, String c, float p) { //método construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    } // eu poderia criar sem parâmetros, aí toda caneta inicialmente seria azul, por exemplo

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    //Alt + Ins, para criar o construtor, getter e setter
}
