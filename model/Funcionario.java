package model;

public class Funcionario extends Pessoa{
    private Reserva reserva;

    public Funcionario(String nome, String endereco, String cidade, String estado, String telefone) {
        super(nome, endereco, cidade, estado, telefone);
    }

    public boolean limpeza(){

        return true;
    }
}
