package model;

public class Documento {
    private String numero;
    private TipoDocumento tipo;

    public Documento(String numero, TipoDocumento tipagem) {
        setNumero(numero);
        setTipo(tipagem);
    }

    public String getNumero() {
        return numero;
    }


    public TipoDocumento getTipo() {
        return tipo;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }
    private void setTipo(TipoDocumento tipagem) {
        this.tipo = tipagem;
    }
}
