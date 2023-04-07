package aula2;

public class Caneta {
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;
        
        void status() {
            System.out.println("Cor: " + this.cor);
            System.out.println("Modelo:  " + this.modelo);
            System.out.println("Tampada? " + this.tampada);
            System.out.println("Ponta:  " + this.ponta);
            System.out.println("Carga:  " + this.carga);
        }
        
        void rabiscar() {
            if (this.tampada == true) {
                System.out.println("ERRO: Caneta tampada!");
            }
            else {
                System.out.println("Estou rabiscando...");
            }
        }
        
        void tampar() {
            this.tampada = true; /*THIS é uma referência ao objeto que o chamou,
            ele é substituído por c1 neste caso, pois o c1 é quem o chama*/
        }
        
        void destampar() {
            this.tampada = false;
        }
}