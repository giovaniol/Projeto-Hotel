package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private LocalDate dataChegadaDoHospede;
    private LocalDate dataSaidaDoHospede;
    private Hospede hospedePrincipal;
    private Acomodacao acomodacaoDesejada;
    private List<ItensDeConsumo> consumidos;
    private List<Hospede> acompanhantes;
    private double taxaDeMulta;

    public Reserva(){
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
        total = calcularConsumo();
        total = calculoDaEstadia();
        return total;

    }

    public void setAcompanhantes(List<Hospede> acompanhantes) {
        this.acompanhantes.addAll(acompanhantes);
    }

    public void setAcomodacaoDesejada(Acomodacao acomodacaoDesejada) {
        this.acomodacaoDesejada = acomodacaoDesejada;
    }

    public void setDataChegadaDoHospede() {
        this.dataChegadaDoHospede = LocalDate.now();
    }
    public void setDataChegadaDoHospede(LocalDate dataChegadaDoHospede) {
        this.dataChegadaDoHospede = dataChegadaDoHospede;
    }

    public void setDataSaidaDoHospede() {
        dataSaidaDoHospede = LocalDate.now();

    }
    public void setDataSaidaDoHospede(LocalDate dataSaida) {
        this.dataSaidaDoHospede = dataSaida;

    }
}
