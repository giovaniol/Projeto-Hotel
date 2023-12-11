package model;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private int senha;


    public Pessoa(String nome, String endereco, String cidade, String estado, String telefone, int senha) {

        setNome(nome);
        setEndereco(endereco);
        setCidade(cidade);
        setEstado(estado);
        setTelefone(telefone);
        setSenha(senha);
    }
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


