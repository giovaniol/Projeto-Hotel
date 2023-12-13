package model;

import java.time.LocalDate;

/**
 * A classe CartaoDeCredito representa as informações de um cartão de crédito,
 * incluindo número do cartão, CVV e data de validade.
 *
 */
public class CartaoDeCredito {

    /** Número do cartão de crédito */
    private long numeroDoCartao;

    /** Código de segurança do cartão (CVV) */
    private int cvvDoCartao;

    /** Data de validade do cartão de crédito */
    private LocalDate dataDeValidadeDoCartao;

    /**
     * Constrói um objeto CartaoDeCredito com as informações especificadas.
     *
     * @param numeroDoCartao           O número do cartão de crédito.
     * @param cvvDoCartao              O código de segurança do cartão (CVV).
     * @param dataDeValidadeDoCartao   A data de validade do cartão de crédito.
     */
    public CartaoDeCredito(long numeroDoCartao, int cvvDoCartao, LocalDate dataDeValidadeDoCartao) {
        setNumeroDoCartao(numeroDoCartao);
        setCvvDoCartao(cvvDoCartao);
        setDataDeValidadeDoCartao(dataDeValidadeDoCartao);
    }

    /**
     * Obtém o número do cartão de crédito.
     *
     * @return O número do cartão de crédito.
     */
    public long getNumeroDoCartao() {
        return numeroDoCartao;
    }

    /**
     * Define o número do cartão de crédito.
     *
     * @param numeroDoCartao O número do cartão de crédito.
     */
    public void setNumeroDoCartao(long numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    /**
     * Obtém o código de segurança do cartão (CVV).
     *
     * @return O código de segurança do cartão (CVV).
     */
    public int getCvvDoCartao() {
        return cvvDoCartao;
    }

    /**
     * Define o código de segurança do cartão (CVV).
     *
     * @param cvvDoCartao O código de segurança do cartão (CVV).
     */
    public void setCvvDoCartao(int cvvDoCartao) {
        this.cvvDoCartao = cvvDoCartao;
    }

    /**
     * Obtém a data de validade do cartão de crédito.
     *
     * @return A data de validade do cartão de crédito.
     */
    public LocalDate getDataDeValidadeDoCartao() {
        return dataDeValidadeDoCartao;
    }

    /**
     * Define a data de validade do cartão de crédito.
     *
     * @param dataDeValidadeDoCartao A data de validade do cartão de crédito.
     */
    public void setDataDeValidadeDoCartao(LocalDate dataDeValidadeDoCartao) {
        this.dataDeValidadeDoCartao = dataDeValidadeDoCartao;
    }

    /**
     * Retorna uma representação em string do objeto CartaoDeCredito.
     *
     * @return Uma string que representa o objeto CartaoDeCredito.
     */
    @Override
    public String toString() {
        return "Cartão de Crédito ";
    }
}
