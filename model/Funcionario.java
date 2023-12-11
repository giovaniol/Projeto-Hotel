package model;

public class Funcionario extends Pessoa{
    private Reserva reserva;

    public Funcionario(String nome, String endereco, String cidade,
                       String estado, String telefone, int senha) {
        super(nome, endereco, cidade, estado, telefone, senha);
    }

    public boolean limpeza(){

        return true;
    }
}
