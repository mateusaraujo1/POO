package aula3;

public class Aula3 {
   
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //posso mexer nesse atributo protegido pois
        //está dentro de uma classe que utiliza a 
        //classe caneta
        c1.tampar();
        //tampar() está dentro da classe
        //do atributo privado
        c1.rabiscar();
        c1.status();
        
    }
} 