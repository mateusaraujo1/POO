package aula3;

public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        private boolean tampada;
        
        void status() {
            System.out.println("Cor: " + this.cor);
            System.out.println("Modelo:  " + this.modelo);
            System.out.println("Tampada: " + this.tampada);
            System.out.println("Ponta:  " + this.ponta);
            System.out.println("Carga:  " + this.carga);
        }
        
        public void rabiscar() {
            if (this.tampada == true) {
                System.out.println("ERRO: Caneta tampada!");
            }
            else {
                System.out.println("Estou rabiscando...");
            }
        }
        
        public void tampar() {
            this.tampada = true; /*THIS é uma referência ao objeto que o chamou,
            ele é substituído por c1 neste caso, pois o c1 é quem o chama*/
        }
        
        public void destampar() {
            this.tampada = false;
        }
}