package model;

import java.time.LocalDate;

public class CartaoDeCredito {

    private long numeroDoCartao;
    private int cvvDoCartao;
    private LocalDate dataDeValidadeDoCartao;



    public CartaoDeCredito(long numeroDoCartao, int cvvDoCartao, LocalDate dataDeValidadeDoCartao) {
        setNumeroDoCartao(numeroDoCartao);
        setCvvDoCartao(cvvDoCartao);
        setDataDeValidadeDoCartao(dataDeValidadeDoCartao);
    }

    public long getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(long numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public int getCvvDoCartao() {
        return cvvDoCartao;
    }

    public void setCvvDoCartao(int cvvDoCartao) {
        this.cvvDoCartao = cvvDoCartao;
    }

    public LocalDate getDataDeValidadeDoCartao() {
        return dataDeValidadeDoCartao;
    }

    public void setDataDeValidadeDoCartao(LocalDate dataDeValidadeDoCartao) {
        this.dataDeValidadeDoCartao = dataDeValidadeDoCartao;
    }
}
