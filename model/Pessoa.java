package model;

/**
 * A classe abstrata Pessoa representa uma entidade genérica com informações básicas
 * como nome, endereço, cidade, estado e telefone. Esta classe serve como uma classe
 * base para Funcionário e Hóspede.
 * <p>
 *
 *
 * @author Giovani
 *
 * @see Hospede
 * @see Funcionario
 */
public abstract class Pessoa {

    /**
     * O nome da pessoa.
     */
    private String nome;

    /**
     * O endereço da pessoa.
     */
    private String endereco;

    /**
     * A cidade onde a pessoa reside.
     */
    private String cidade;

    /**
     * O estado onde a pessoa está localizada.
     */
    private String estado;

    /**
     * O número de telefone da pessoa.
     */
    private String telefone;

    /**
     * Constrói uma Pessoa com as informações especificadas.
     *
     * @param nome      O nome da pessoa.
     * @param endereco  O endereço da pessoa.
     * @param cidade    A cidade onde a pessoa reside.
     * @param estado    O estado onde a pessoa está localizada.
     * @param telefone  O número de telefone da pessoa.
     */
    public Pessoa(String nome, String endereco, String cidade, String estado, String telefone) {
        setNome(nome);
        setEndereco(endereco);
        setCidade(cidade);
        setEstado(estado);
        setTelefone(telefone);
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome O nome a ser definido para a pessoa.
     */
    private void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o endereço da pessoa.
     *
     * @return O endereço da pessoa.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da pessoa.
     *
     * @param endereco O endereço a ser definido para a pessoa.
     */
    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém a cidade onde a pessoa reside.
     *
     * @return A cidade onde a pessoa reside.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade onde a pessoa reside.
     *
     * @param cidade A cidade a ser definida para a pessoa.
     */
    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém o estado onde a pessoa está localizada.
     *
     * @return O estado onde a pessoa está localizada.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o estado onde a pessoa está localizada.
     *
     * @param estado O estado a ser definido para a pessoa.
     */
    private void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtém o número de telefone da pessoa.
     *
     * @return O número de telefone da pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o número de telefone da pessoa.
     *
     * @param telefone O número de telefone a ser definido para a pessoa.
     */
    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
