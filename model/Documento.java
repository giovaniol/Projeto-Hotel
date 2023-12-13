package model;

/**
 * A classe Documento representa um documento com número e tipo.
 * Exemplo de uso: new Documento("123456789", TipoDocumento.CPF).
 *
 * @author Seu Nome
 *
 * @see TipoDocumento
 */
public class Documento {
    private String numero;
    private TipoDocumento tipo;

    /**
     * Constrói um objeto Documento com o número e tipo especificados.
     *
     * @param numero O número do documento.
     * @param tipo   O tipo de documento.
     * @throws IllegalArgumentException Se o número do documento for nulo ou vazio.
     */
    public Documento(String numero, TipoDocumento tipo) {
        setNumero(numero);
        setTipo(tipo);

    }

    /**
     * Obtém o número do documento.
     *
     * @return O número do documento.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Obtém o tipo de documento.
     *
     * @return O tipo de documento.
     */
    public TipoDocumento getTipo() {
        return tipo;
    }

    private void setNumero(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Número do documento não pode ser nulo ou vazio.");
        }
        this.numero = numero;
    }

    private void setTipo(TipoDocumento tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de documento não pode ser nulo.");
        }
        this.tipo = tipo;
    }
}
