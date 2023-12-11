package model;

import java.util.ArrayList;

public class Hospede extends Pessoa{

private String pais;
private String email;
private Documento documento;
private String nomeDoPai;
private String nomeDaMae;
private String dataNascimento;
private ArrayList<Hospede> acompanhantes;

    public Hospede(String pais, String email,
                   Documento documento, String nomeDoPai,
                   String nomeDaMae, String dataNascimento,
                   ArrayList<Hospede> acompanhantes) {
        this.pais = pais;
        this.email = email;
        this.documento = documento;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.dataNascimento = dataNascimento;
        acompanhantes = new ArrayList<>();
    }




}
