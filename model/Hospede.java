package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hospede extends Pessoa{

private String pais;
private String email;
private Documento documento;
private String nomeDoPai;
private String nomeDaMae;
private LocalDate dataNascimento;
private CartaoDeCredito cartaoDoHospede;





    public Hospede(String nome, String endereco, String cidade, String estado, String telefone,
                   String pais, String email, String documento, TipoDocumento tipo, String nomeDaMae
            , String nomeDoPai, LocalDate dataNascimento) {
        super(nome, endereco, cidade, estado, telefone);
        this.pais = pais;
        this.email = email;
        this.documento = new Documento(documento, tipo);
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.dataNascimento = dataNascimento;
    }
}
