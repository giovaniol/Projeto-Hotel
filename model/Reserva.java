package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Representa uma reserva feita por um hóspede em uma acomodação específica.
 */
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

    /**
     * Construtor da classe Reserva.
     *
     * @param dataChegadaDoHospede   Data de chegada do hóspede na acomodação.
     * @param horaDeEntradaDoHospede Hora de entrada do hóspede na acomodação.
     * @param horaDeSaidaDoHospede   Hora de saída do hóspede da acomodação.
     * @param dataSaidaDoHospede     Data de saída do hóspede da acomodação.
     * @param hospedePrincipal       O hóspede principal que fez a reserva.
     * @param acomodacaoDesejada     A acomodação desejada para a reserva.
     */
    public Reserva(LocalDate dataChegadaDoHospede, LocalTime horaDeEntradaDoHospede, LocalTime horaDeSaidaDoHospede,
                   LocalDate dataSaidaDoHospede,
                   Hospede hospedePrincipal, Acomodacao acomodacaoDesejada) {
        setDataChegadaDoHospede(dataChegadaDoHospede);
        setHospedePrincipal(hospedePrincipal);
        setAcomodacaoDesejada(acomodacaoDesejada);
        setDataSaidaDoHospede(dataSaidaDoHospede);
        setHoraDeEntradaDoHospede(horaDeEntradaDoHospede);
        setHoraDeSaidaDoHospede(horaDeSaidaDoHospede);
        setTemAcompanhante(false);
        consumidos = new ArrayList<>();
    }

    /**
     * Calcula o valor da estadia com base na acomodação escolhida.
     *
     * @return O valor total da estadia.
     */
    public double calculoDaEstadia(){
        double preco = 0.0;
        return preco + acomodacaoDesejada.getValorDaDiaria();
    }

    /**
     * Calcula o valor total do consumo adicional durante a estadia.
     *
     * @return O valor total do consumo adicional.
     */
    public double calcularConsumo(){
        double preco = 0.0;
        for (ItensDeConsumo itens: consumidos) {
            preco += itens.getPreco();
        }
        return preco;

    }

    /**
     * Calcula o valor total a pagar pela reserva (estadia + consumo adicional).
     *
     * @return O valor total a pagar pela reserva.
     */
    public double calcularTotalAPagar(){
        double total = 0.0;
        total = calcularConsumo() + calculoDaEstadia();
        return total;
    }
    /**
     * Adiciona um acompanhante à reserva.
     *
     * @param hospede O acompanhante a ser adicionado.
     */
    public void adicionarAcompanhantes(Hospede hospede){
        this.acompanhante = hospede;
        setTemAcompanhante(true);
    }

    /**
     * Obtém a hora de entrada do hóspede na acomodação.
     *
     * @return A hora de entrada do hóspede.
     */
    public LocalTime getHoraDeEntradaDoHospede() {
        return horaDeEntradaDoHospede;
    }

    /**
     * Define a hora de entrada do hóspede na acomodação.
     *
     * @param horaDeEntradaDoHospede A hora de entrada do hóspede.
     */
    public void setHoraDeEntradaDoHospede(LocalTime horaDeEntradaDoHospede) {
        this.horaDeEntradaDoHospede = horaDeEntradaDoHospede;
    }

    /**
     * Obtém a hora de saída do hóspede da acomodação.
     *
     * @return A hora de saída do hóspede.
     */
    public LocalTime getHoraDeSaidaDoHospede() {
        return horaDeSaidaDoHospede;
    }

    /**
     * Define a hora de saída do hóspede da acomodação.
     *
     * @param horaDeSaidaDoHospede A hora de saída do hóspede.
     */
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

    /**
     * Verifica se a reserva tem um acompanhante.
     *
     * @return Verdadeiro se houver um acompanhante, falso caso contrário.
     */
    public boolean temAcompanhante(){
        return temAcompanhante;
    }

    /**
     * Define se a reserva tem um acompanhante.
     *
     * @param resposta A resposta sobre a presença de um acompanhante.
     */
    public void setTemAcompanhante(Boolean resposta){
        this.temAcompanhante = resposta;
    }


}
