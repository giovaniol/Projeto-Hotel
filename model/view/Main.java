package model.view;

import model.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        int senha = scanner.nextInt();

        // Crie um objeto Funcionario
        Funcionario funcionario = new Funcionario("NomeFuncionario", "Endereco", "Cidade",
                "Estado", "Telefone", 5000, LocalDate.of(1990, 1, 1));

        // Crie um objeto Hospede
        Hospede hospede = new Hospede("NomeHospede", "Endereco", "Cidade",
                "Estado", "Telefone", "Pais", "email@example.com", "123456",
                TipoDocumento.CPF, "NomeMae", "NomePai", LocalDate.of(1995, 2, 2),
                1234567890, 123, LocalDate.of(2025, 1, 1));

        // Passe os objetos Funcionario, Hospede e senha para o construtor do Menu
        Menu menu = new Menu(funcionario, hospede, senha);

        // Chame o método exibirMenu para iniciar o menu
        menu.exibirMenu();
    }
}
