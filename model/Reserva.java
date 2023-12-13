package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Reserva {

    private LocalTime horaDeEntradaDoHospede;
    private LocalDate dataChegadaDoHospede;
    private LocalTime horaDeSaidaDoHospede;
    private LocalDate dataSaidaDoHospede;
    private Hospede hospedePrincipal;
    private Acomodacao acomodacaoDesejada;
    private Boleto boleto;
    private ArrayList<ItensDeConsumo> consumidos;
    private Hospede acompanhante;
    private boolean temAcompanhante;
    private double taxaDeMulta;

    public Reserva(LocalDate dataChegadaDoHospede, LocalTime horaDeEntradaDoHospede, LocalTime horaDeSaidaDoHospede,
                   LocalDate dataSaidaDoHospede,
                   Hospede hospedePrincipal, Acomodacao acomodacaoDesejada) {
        setDataChegadaDoHospede(getDataChegadaDoHospede());
        setHospedePrincipal(hospedePrincipal);
        setAcomodacaoDesejada(acomodacaoDesejada);
        setDataSaidaDoHospede(dataSaidaDoHospede);
        setHoraDeEntradaDoHospede(horaDeEntradaDoHospede);
        setHoraDeSaidaDoHospede(horaDeSaidaDoHospede);
        setTemAcompanhante(false);
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
        this.acompanhante = hospede;
        setTemAcompanhante(true);
    }

    public LocalTime getHoraDeEntradaDoHospede() {
        return horaDeEntradaDoHospede;
    }

    public void setHoraDeEntradaDoHospede(LocalTime horaDeEntradaDoHospede) {
        this.horaDeEntradaDoHospede = horaDeEntradaDoHospede;
    }

    public LocalTime getHoraDeSaidaDoHospede() {
        return horaDeSaidaDoHospede;
    }

    public void setHoraDeSaidaDoHospede(LocalTime horaDeSaidaDoHospede) {
        this.horaDeSaidaDoHospede = horaDeSaidaDoHospede;
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
    public Hospede getAcompanhantes(){
        return this.acompanhante;
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
    public boolean temAcompanhante(){
        return temAcompanhante;
    }
    public void setTemAcompanhante(Boolean resposta){
        this.temAcompanhante = resposta;
    }


}
