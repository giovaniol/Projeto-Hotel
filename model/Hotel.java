package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private ArrayList<Hospede> hospedesNoHotel;
    private ArrayList<Funcionario> funcionario;

    private ArrayList<Acomodacao> acomodacoesDoHotel;
    private ArrayList<Reserva> reserva;
    private ArrayList<ItensDeConsumo> itensDeConsumos;
    public Hotel() {

        funcionario = new ArrayList<>();
        acomodacoesDoHotel = new ArrayList<>();
        reserva = new ArrayList<>();
    }

    public void adicionaHospede(){

    }
    public void ajusteHospede(){

    }
    public void removeHospede(){

    }
    public void adicionaItem(){

    }
    public void ajusteItem(){

    }
    public void removeItem(){

    }

    public void adicionaFuncionario(Funcionario funcionario){
        this.funcionario.add(funcionario);
        System.out.println("Funcionário contratado com sucesso!");

    }
    public void removeFuncionario(String nome){
        this.funcionario.removeIf(alguem -> alguem.getNome().trim().equalsIgnoreCase(nome.trim()));
    }
    public void ajusteFuncionario(){

    }
    public void adicionaAcomodacao(Acomodacao acomodacao){
        this.acomodacoesDoHotel.add(acomodacao);

    }
    public void ajusteAcomodacao(){

    }
    public void removeAcomodacao(int numeroDaAcomodacao){
        this.acomodacoesDoHotel.removeIf(numero -> numero.getNumeroDaAcomodacao() == numeroDaAcomodacao);

    }
    public void adicionarReserna(){

    }

    public void ajusteReserva(){

    }
    public void removeReserva(){

    }
    public void checkInDoHotel(Reserva reserva){

    }
    public void checkOutDoHotel(Reserva reserva){
    }
    public boolean verificarPossibilidadeDeReserva(){
        return false;
    }







}
