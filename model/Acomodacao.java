package model;

import java.util.ArrayList;



public class Acomodacao {
    private int numeroDaAcomodacao;
    private int andarDaAcomodacao;
    private ArrayList<Hospede> hospedes;
    private TipoAcomodacao codigoTipoAcomodacao;
    private double valorDaDiaria;

    public double getValorDaDiaria() {
        return valorDaDiaria;

    }

    public void setValorDaDiaria(double valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }

    public int getNumeroDaAcomodacao() {
        return numeroDaAcomodacao;
    }

    public void setNumeroDaAcomodacao(int numeroDaAcomodacao) {
        this.numeroDaAcomodacao = numeroDaAcomodacao;
    }

    public int getAndarDaAcomodacao() {
        return andarDaAcomodacao;
    }

    public void setAndarDaAcomodacao(int andarDaAcomodacao) {
        this.andarDaAcomodacao = andarDaAcomodacao;
    }

    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }

    public void setHospedes(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public TipoAcomodacao getCodigoTipoAcomodacao() {
        return codigoTipoAcomodacao;
    }

    public void setCodigoTipoAcomodacao(TipoAcomodacao codigoTipoAcomodacao) {
        this.codigoTipoAcomodacao = codigoTipoAcomodacao;
    }
}
