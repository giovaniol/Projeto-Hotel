package model;

import java.time.LocalDate;

/**
 * A classe Hospede representa um hóspede em um sistema de hospedagem, estendendo a classe Pessoa.
 * Contém informações específicas de um hóspede, como país de origem, email, documento, nome do pai,
 * nome da mãe, data de nascimento e cartão de crédito.
 *
 * @author Giovani
 *
 * @see Pessoa
 * @see Documento
 * @see CartaoDeCredito
 */
public class Hospede extends Pessoa {

    /**
     * Constante para a senha padrão do hóspede.
     */
    private final int SENHA = 1000;

    /**
     * O país de origem do hóspede.
     */
    private String pais;

    /**
     * O endereço de email do hóspede.
     */
    private String email;

    /**
     * O documento do hóspede, contendo número e tipo.
     */
    private Documento documento;

    /**
     * O nome do pai do hóspede.
     */
    private String nomeDoPai;

    /**
     * O nome da mãe do hóspede.
     */
    private String nomeDaMae;

    /**
     * A data de nascimento do hóspede.
     */
    private LocalDate dataNascimento;

    /**
     * O cartão de crédito associado ao hóspede.
     */
    private CartaoDeCredito cartaoDoHospede;


    /**
     * Constrói um objeto Hospede com as informações especificadas.
     *
     * @param nome                       O nome do hóspede.
     * @param endereco                   O endereço do hóspede.
     * @param cidade                     A cidade onde o hóspede reside.
     * @param estado                     O estado onde o hóspede está localizado.
     * @param telefone                   O número de telefone do hóspede.
     * @param pais                       O país de origem do hóspede.
     * @param email                      O email do hóspede.
     * @param documento                  O número do documento do hóspede.
     * @param tipo                       O tipo de documento do hóspede.
     * @param nomeDaMae                  O nome da mãe do hóspede.
     * @param nomeDoPai                  O nome do pai do hóspede.
     * @param dataNascimento             A data de nascimento do hóspede.
     * @param numeroDoCartao             O número do cartão de crédito do hóspede.
     * @param cvv                        O código de segurança do cartão de crédito do hóspede.
     * @param dataDeValidadeDoCartao     A data de validade do cartão de crédito do hóspede.
     */
    public Hospede(String nome, String endereco, String cidade, String estado, String telefone,
                   String pais, String email, String documento, TipoDocumento tipo, String nomeDaMae,
                   String nomeDoPai, LocalDate dataNascimento,
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

    /**
     * Obtém o país de origem do hóspede.
     *
     * @return O país de origem do hóspede.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Obtém o email do hóspede.
     *
     * @return O email do hóspede.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Obtém o documento do hóspede.
     *
     * @return O documento do hóspede.
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Obtém o nome do pai do hóspede.
     *
     * @return O nome do pai do hóspede.
     */
    public String getNomeDoPai() {
        return nomeDoPai;
    }

    /**
     * Obtém o nome da mãe do hóspede.
     *
     * @return O nome da mãe do hóspede.
     */
    public String getNomeDaMae() {
        return nomeDaMae;
    }

    /**
     * Obtém a data de nascimento do hóspede.
     *
     * @return A data de nascimento do hóspede.
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Obtém o cartão de crédito do hóspede.
     *
     * @return O cartão de crédito do hóspede.
     */
    public CartaoDeCredito getCartaoDoHospede() {
        return cartaoDoHospede;
    }

    /**
     * Obtém a senha padrão do hóspede.
     *
     * @return A senha padrão do hóspede.
     */
    public int getSENHA() {
        return SENHA;
    }

    /**
     * Exibe detalhes sobre o hóspede.
     */
    public void detalhesHospede() {
        System.out.println("----------Hóspede------------");
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
        System.out.println("Nome da mãe: " + getNomeDaMae());
        System.out.println("------------------------------");
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCartaoDoHospede(CartaoDeCredito cartaoDoHospede) {
        this.cartaoDoHospede = cartaoDoHospede;
    }
}
