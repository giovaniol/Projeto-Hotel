package model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 * A classe Boleto representa um boleto com informações como data de vencimento,
 * valor e código de barras.
 *
 * O código de barras é utilizado para extrair a data de vencimento e o valor do boleto.
 *
 * @author Giovani
 */
public class Boleto {
    /** A data de vencimento do boleto */
    private LocalDate dataVencimento;

    /** O valor do boleto */
    private double valorBoleto;

    /** O código de barras do boleto */
    private long codigoDeBarras;

    /**
     * Constrói um objeto Boleto com base no código de barras fornecido.
     *
     * @param codigoDeBarras O código de barras do boleto.
     */
    public Boleto(long codigoDeBarras){
        setCodigoDeBarras(codigoDeBarras);
        extrairData();
        extrairValor();
    }
    /**
     * Obtém a data de vencimento do boleto.
     *
     * @return A data de vencimento do boleto.
     */
    public LocalDate getDataVencimento(){

        return dataVencimento;
    }
    /**
     * Obtém a representação formatada da data de vencimento do boleto.
     *
     * @return A data de vencimento formatada.
     */
    public  String getVencimento(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return  dataVencimento.format(formatter);
    }
    /**
     * Calcula o número de dias de atraso do boleto em relação à data atual.
     *
     * @return O número de dias de atraso.
     */
    public long diasAtraso(){
        LocalDate agora = LocalDate.now();
        if(dataVencimento.isAfter(agora) || dataVencimento.equals(agora)){
            return 0;
        }else {
            return ChronoUnit.DAYS.between(dataVencimento, agora);
        }
    }
    /**
     * Exibe detalhes do boleto, incluindo código de barras, valor, data de vencimento
     * e quantidade de dias de atraso.
     */
    public void detalhesBoleto(Boleto boleto){
        System.out.println("###########################");
        System.out.println("Barras: " + codigoDeBarras);
        System.out.println("Boleto: ");
        System.out.println("Valor: R$" + valorBoleto);
        System.out.println("Vencimento: " + boleto.getDataVencimento());
        System.out.println("Vencimento: " + boleto.getVencimento());
        System.out.println("------------");
        System.out.println("Hoje: " + LocalDate.now());
        System.out.println("Vencido à " + boleto.diasAtraso() + " dias");
        System.out.println("###########################");


    }
    private void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    private void extrairData(){
        int dias;
        dias = (int) (codigoDeBarras / Math.pow(10,10));
        LocalDate dataBase = LocalDate.of(1997, Month.OCTOBER, 7);
        dataVencimento = dataBase.plusDays(dias);
    }
    private void extrairValor() {
        valorBoleto = (codigoDeBarras % Math.pow(10, 10)) / 100;
    }

}
