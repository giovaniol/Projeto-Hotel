package model;

import java.time.LocalDate;


public class Hospede extends Pessoa{
private final int SENHA = 1000;
private String pais;
private String email;
private Documento documento;
private String nomeDoPai;
private String nomeDaMae;
private LocalDate dataNascimento;
private CartaoDeCredito cartaoDoHospede;

    public Hospede(String nome, String endereco, String cidade, String estado, String telefone,
                   String pais, String email, String documento, TipoDocumento tipo, String nomeDaMae
            , String nomeDoPai, LocalDate dataNascimento,
                   long numeroDoCartao, int cvv, LocalDate dataDeValidadeDoCartao) {
        super(nome, endereco, cidade, estado, telefone);
        setPais(pais);
        setEmail(email);
        setDocumento(new Documento(documento, tipo));
        setNomeDoPai(nomeDoPai);
        setNomeDaMae(nomeDaMae);
        setDataNascimento(dataNascimento);
        setCartaoDoHospede(new CartaoDeCredito(numeroDoCartao, cvv, dataDeValidadeDoCartao));
    }

    public void detalhesHospede() {
        System.out.println("----------Hospede------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Email: " + getEmail());
        System.out.println("País: " + getPais());
        System.out.println("Nome do pai: " + getNomeDoPai());
        System.out.println("Nome da mae: " + getNomeDaMae());
        System.out.println("------------------------------");
    }

    public String getPais() {
        return pais;
    }
    public String getEmail() {
        return email;
    }

    public Documento getDocumento() {
        return documento;
    }
    public String getNomeDoPai() {
        return nomeDoPai;
    }
    public String getNomeDaMae() {
        return nomeDaMae;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public CartaoDeCredito getCartaoDoHospede() {
        return cartaoDoHospede;
    }

    public int getSENHA() {
        return SENHA;
    }

    private void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    private void setPais(String pais) {
        this.pais = pais;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    private void setDocumento(Documento documento) {
        this.documento = documento;
    }
    private void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }
    private void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    private void setCartaoDoHospede(CartaoDeCredito cartaoDoHospede) {
        this.cartaoDoHospede = cartaoDoHospede;
    }


}