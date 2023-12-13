package model;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * A classe Funcionario representa um funcionário em um sistema, estendendo a classe Pessoa.
 * Contém informações específicas de um funcionário, como salário e data de nascimento.
 *
 *
 * @see Pessoa
 */
public class Funcionario extends Pessoa {

    /**
     * A senha padrão para funcionários.
     */
    private final int SENHA = 2000;

    /**
     * O salário do funcionário.
     */
    private double salario;

    /**
     * A data de nascimento do funcionário.
     */
    private LocalDate dataDeNascimento;

    /**
     * Constrói um objeto Funcionario com as informações especificadas.
     *
     * @param nome               O nome do funcionário.
     * @param endereco           O endereço do funcionário.
     * @param cidade             A cidade onde o funcionário reside.
     * @param estado             O estado onde o funcionário está localizado.
     * @param telefone           O número de telefone do funcionário.
     * @param salario            O salário do funcionário.
     * @param dataDeNascimento   A data de nascimento do funcionário.
     */
    public Funcionario(String nome, String endereco, String cidade,
                       String estado, String telefone, double salario,
                       LocalDate dataDeNascimento) {
        super(nome, endereco, cidade, estado, telefone);
        setSalario(salario);
        setDataDeNascimento(dataDeNascimento);
    }

    /**
     * Realiza a atividade de limpeza do funcionário.
     *
     * @return true se a atividade foi concluída com sucesso.
     */
    public boolean limpeza() {
        return true;
    }

    /**
     * Obtém o salário do funcionário.
     *
     * @return O salário do funcionário.
     */
    public double getSalario() {
        return this.salario;
    }

    /**
     * Obtém a data de nascimento do funcionário.
     *
     * @return A data de nascimento do funcionário.
     */
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * Define o salário do funcionário.
     *
     * @param salario O salário a ser definido para o funcionário.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Define a data de nascimento do funcionário.
     *
     * @param dataDeNascimento A data de nascimento a ser definida para o funcionário.
     */
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    /**
     * Exibe detalhes sobre o funcionário.
     */
    public void detalharFuncionario() {
        System.out.println("---------Funcionário----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Data de nascimento: " + getDataDeNascimento());
        System.out.println("Salário: " + getSalario());
        System.out.println("------------------------------");
    }
}