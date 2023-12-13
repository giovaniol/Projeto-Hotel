package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario extends Pessoa{
    private double salario;
    private LocalDate dataDeNascimento;

    public Funcionario(String nome, String endereco, String cidade,
                       String estado, String telefone, double salario,
                       LocalDate dataDeNascimento) {
        super(nome, endereco, cidade, estado, telefone);
        setsalario(salario);
        setDataDeNascimento(dataDeNascimento);
    }

    public boolean limpeza(){
        return true;
    }

    public void setsalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void detalharFuncionario(){
        System.out.println("---------Funcionario----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Data de nascimento: " + getDataDeNascimento());
        System.out.println("Salario: " + getSalario());
        System.out.println("------------------------------");
    }
}
