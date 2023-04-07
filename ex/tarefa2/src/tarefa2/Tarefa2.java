package tarefa2;
public class Tarefa2 {
    public static void main(String[] args) {
        Impressora I = new Impressora();
        UVA uva = new UVA();
        UECE uece = new UECE();
        
        I.imprimeCabecalho(uece);
        I.imprimeRodape(uece);
        I.imprimeCabecalho(uva);
        I.imprimeRodape(uva);
    }
}
