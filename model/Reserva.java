package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Reserva {
    private LocalDate dataChegadaDoHospede;
    private LocalDate dataSaidaDoHospede;
    private Hospede hospedePrincipal;
    private Acomodacao acomodacaoDesejada;
    private Boleto boleto;
    private ArrayList<ItensDeConsumo> consumidos;
    private ArrayList<Hospede> acompanhantes;
    private double taxaDeMulta;

    public Reserva(LocalDate dataChegadaDoHospede, LocalDate dataSaidaDoHospede,
                   Hospede hospedePrincipal, Acomodacao acomodacaoDesejada) {
        setDataChegadaDoHospede(getDataChegadaDoHospede());
        setHospedePrincipal(hospedePrincipal);
        setAcomodacaoDesejada(acomodacaoDesejada);
        setDataSaidaDoHospede(dataSaidaDoHospede);
        acompanhantes = new ArrayList<>();
        consumidos = new ArrayList<>();
    }

    public double calculoDaEstadia(){
        double preco = 0.0;
        return preco + acomodacaoDesejada.getValorDaDiaria();
    }
    public double calcularConsumo(){
        double preco = 0.0;
        for (ItensDeConsumo itens: consumidos) {
            preco += itens.getPreco();
        }
        return preco;

    }
    public double calcularTotalAPagar(){
        double total = 0.0;
        total = calcularConsumo() + calculoDaEstadia();
        return total;
    }
    public void adicionarAcompanhantes(Hospede hospede){
        acompanhantes.add(hospede);
        System.out.println("Acompanhante adicionado.");
    }

    public LocalDate getDataChegadaDoHospede() {
        return dataChegadaDoHospede;
    }

    public void setDataChegadaDoHospede(LocalDate dataChegadaDoHospede) {
        this.dataChegadaDoHospede = dataChegadaDoHospede;
    }

    public LocalDate getDataSaidaDoHospede() {
        return dataSaidaDoHospede;
    }

    public void setDataSaidaDoHospede(LocalDate dataSaidaDoHospede) {
        this.dataSaidaDoHospede = dataSaidaDoHospede;
    }

    public double getTaxaDeMulta() {
        return taxaDeMulta;
    }

    public void setTaxaDeMulta(double taxaDeMulta) {
        this.taxaDeMulta = taxaDeMulta;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
    public void setHospedePrincipal(Hospede hospedePrincipal) {

        this.hospedePrincipal = hospedePrincipal;
    }
    public Hospede getHospedePrincipal() {
        return hospedePrincipal;
    }

    public void setAcomodacaoDesejada(Acomodacao acomodacaoDesejada) {
        this.acomodacaoDesejada = acomodacaoDesejada;
    }

    public Acomodacao getAcomodacaoDesejada() {
        return acomodacaoDesejada;
    }
}
