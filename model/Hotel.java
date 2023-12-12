package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Hotel {
    private ArrayList<Hospede> hospedesNoHotel;
    private ArrayList<Funcionario> funcionario;
    private ArrayList<Acomodacao> acomodacoesDoHotel;
    private ArrayList<Reserva> reserva;
    private ArrayList<ItensDeConsumo> itensDeConsumos;
    public Hotel() {
        hospedesNoHotel = new ArrayList<>();
        funcionario = new ArrayList<>();
        itensDeConsumos = new ArrayList<>();
        acomodacoesDoHotel = new ArrayList<>();
        reserva = new ArrayList<>();
    }

    public void adicionaHospede(Hospede hospede){
        hospedesNoHotel.add(hospede);

    }
    public void ajusteHospede(){

    }
    public void removeHospede(Hospede hospede){
        hospedesNoHotel.remove(hospede);

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
    public void adicionarReserva(Reserva reservinha){
        reserva.add(reservinha);
    }

    public void ajusteReserva(){

    }

    public void removeReserva(Reserva reservinha){
        reserva.remove(reservinha);
    }
    public void checkInDoHotel(Reserva reservinha){
        reserva.add(reservinha);
    }
    public void checkOutDoHotel(Reserva reserva){
    }
    public boolean verificarPossibilidadeDeReserva(){

        return false;
    }

    public void relatorioDeHospedes() {
        for (Hospede alguem: hospedesNoHotel) {
            alguem.detalhesHospede();
        }
    }
    public void getHospedes(){
        for (Hospede alguem: hospedesNoHotel) {
            System.out.println("Nome do Hospede: " + alguem.getNome());
        }
    }



}
