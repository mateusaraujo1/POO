package tarefa2;
public class Impressora {
    public void imprimeCabecalho(UVA uva) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Universidade Estadual Vale do Acaraú");
    }
    public void imprimeCabecalho(UECE uece) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Universidade Estadual do Ceará");
    }
    
    public void imprimeRodape(UVA uva) {
        System.out.println("----------------------- UVA –---------------------------");
    }
    public void imprimeRodape(UECE uece) {
        System.out.println("---------------------- UECE –--------------------------");
    }
}
