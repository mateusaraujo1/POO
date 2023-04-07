package aula11;
public final class Bolsista extends Aluno{
    //classe ou método final não tem filhos e não pode ser sobrepostos, respectivamente
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa renovada do " + this.nome);
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + "é bolsista! pagamento facilitado");
    } 
}
