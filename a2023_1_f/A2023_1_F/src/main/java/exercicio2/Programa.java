/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author placi
 */
public class Programa {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1,"jose","1212");
        Canal hbo1 = new Canal("HBO1");
        Canal hbo2 = new Canal("HBO2");
        Canal hbo3 = new Canal("HBO3");
        Canal hbo4 = new Canal("HBO4");
        Canal hbo5 = new Canal("HBO5");
        Canal g= new Canal("Globo");
        Canal s = new Canal("SBT");
        Canal sptv1 = new Canal("Sportv 1");
        Canal sptv2 = new Canal("Sportv 2");
        Canal sptv3 = new Canal("Sportv 3");
        hbo1.adicinarProgramacao("filme 1", "12","14");
        hbo1.adicinarProgramacao("filme 2", "14","16");
        hbo1.adicinarProgramacao("filme 3", "16","18");
        hbo1.adicinarProgramacao("filme 4", "18","20");
        s.adicinarProgramacao("SS", "14", "24");
        Pacote basico = new Pacote("basico");
        basico.adicionarCanal(g);
        basico.adicionarCanal(s);
        Pacote inter = new Pacote("Intermediario");
        inter.adicionarCanal(s);
        inter.adicionarCanal(g);
        inter.adicionarCanal(sptv1);
        inter.adicionarCanal(hbo1);
        c1.setPacote(inter);
        inter.imprimir();
        hbo1.imprimir();
        inter.removerCanal(s);
        inter.imprimir();
        hbo1.removerProgramacao(1);
        hbo1.imprimir();
        hbo1.removerProgramacao("14");
        hbo1.imprimir();

        Impressora imp = new Impressora();
        imp.imprimirCabecalho(new UVA());
        imp.imprimirRodape(new UECE());

       






        

    }
}
