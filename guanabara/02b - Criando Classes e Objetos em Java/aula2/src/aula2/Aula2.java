package aula2;

public class Aula2 {
   
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Pic";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        
        c2.destampar();
        c2.rabiscar();
    }
}
