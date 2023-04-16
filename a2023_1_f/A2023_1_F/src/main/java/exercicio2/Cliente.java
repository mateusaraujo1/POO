/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author placi
 */
public class Cliente  extends Pessoa{
    private int codigo;
    private Pacote pacote;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String cpf) {
        super(nome, cpf);
        this.codigo = codigo;
    }



    public Cliente(int codigo, String nome, String cpf, Pacote pacote ) {
        super(nome, cpf);
        this.codigo = codigo;
        this.pacote = pacote;
    }



    
    
}
