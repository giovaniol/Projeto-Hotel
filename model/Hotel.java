package model;

import java.util.ArrayList;


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

    public void adicionaHospede(Hospede hospede){
        hospedesNoHotel.add(hospede);
        System.out.println("Hóspede incluído no hotel.");
    }
    public void ajusteHospede(){

    }
    public void removeHospede(Hospede hospede){
        hospedesNoHotel.remove(hospede);
        System.out.println("Hóspede removido do hotel");
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
        System.out.println("Reserva feita com êxito.");
    }

    public void ajusteReserva(){

    }
    public void removeReserva(Reserva reservinha){
        reserva.remove(reservinha);
    }
    public void checkInDoHotel(Reserva reserva){

    }
    public void checkOutDoHotel(Reserva reserva){
    }
    public boolean verificarPossibilidadeDeReserva(){

        return false;
    }







}
