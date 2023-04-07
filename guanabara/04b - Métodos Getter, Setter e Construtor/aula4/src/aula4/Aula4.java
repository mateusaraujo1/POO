package aula4;
public class Aula4 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Vermelha", 0.4f);
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();
        
        System.out.println("\n---------------\n");
        
        Caneta c2 = new Caneta("Xiaomi", "Amarelo", 0.7f);
        c2.status();
    }
}
