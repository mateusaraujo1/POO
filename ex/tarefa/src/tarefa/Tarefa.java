package tarefa;
public class Tarefa {
    public static void main(String[] args) {
        Cliente c = new Cliente("Mateus", "123456789", 40028922);
        //c.mostrarCliente();
        
        Programacao p1 = new Programacao("TV Globinho", "10:00", "12:00");
        Programacao p2 = new Programacao("Lagoa Azul", "14:00", "16:00");
        Programacao p3 = new Programacao("Jornal Nacional", "18:00", "21:00");
        //p1.mostrarProgramacao();
        Programacao p4 = new Programacao("Bom dia e Cia", "8:00", "12:00");
        Programacao p5 = new Programacao("Casos de Família", "12:00", "14:00");
        Programacao p6 = new Programacao("SBT Brasil", "18:00", "21:00");
        //p1.mostrarProgramacao();
        
        Canal c1 = new Canal("Globo");
        c1.addProgramacao(p1);
        c1.addProgramacao(p2);
        c1.addProgramacao(p3);
        //c1.mostrarProgramacoes();
        
        Canal c2 = new Canal("SBT");
        c2.addProgramacao(p4);
        c2.addProgramacao(p5);
        c2.addProgramacao(p6);
        //c2.mostrarProgramacoes();
        
        Pacote pct1 = new Pacote("Sky");
        pct1.adicionaCanal(c1);
        pct1.adicionaCanal(c2);
        pct1.mostrarPacotes();
    }
}
