package aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Calopsita dançando");
        v[1] = new Video("Caramelo dançando");
        v[2] = new Video("Corvo cantando");
        
        System.out.println(v[0].toString());
    }
}
