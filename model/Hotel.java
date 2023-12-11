package model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Hospede> hospedesNoHotel;
    private ArrayList<Funcionario> funcionario;
    private Boleto boleto;
    private ArrayList<Acomodacao> acomodacoesDoHotel;
    private ArrayList<Reserva> reserva;

    public Hotel() {

        funcionario = new ArrayList<>();
        acomodacoesDoHotel = new ArrayList<>();
        reserva = new ArrayList<>();
    }

    private void adicionaFuncionario(Funcionario funcionario){
        this.funcionario.add(funcionario);
        System.out.println("Funcionário contratado com sucesso!");

    }
    private void removeFuncionario(String nome){
        this.funcionario.removeIf(alguem -> alguem.getNome().trim().equalsIgnoreCase(nome.trim()));
    }
    private void ajusteFuncionario(){

    }
    private void adicionaAcomodacao(Acomodacao acomodacao){
        this.acomodacoesDoHotel.add(acomodacao);

    }
    private void ajusteAcomodacao(){

    }
    private void removeAcomodacao(int numeroDaAcomodacao){
        this.acomodacoesDoHotel.removeIf(numero -> numero.getNumeroDaAcomodacao() == numeroDaAcomodacao);

    }







}
