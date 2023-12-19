package model;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

  private Hotel hotel = new Hotel();
  private Funcionario funcionario;
  private Hospede hospede;
  private int senha;

  public Menu(Funcionario funcionario, Hospede hospede, int senha) {
      this.funcionario = funcionario;
      this.hospede = hospede;
      this.senha = senha;
  }

    public void exibirMenu() {
        if (verificarSenha()) {
            int opcao;
            do {
                exibirOpcoesMenu();
                Scanner scanner = new Scanner(System.in);
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        hotel.relatorioDeHospede();
                        break;

                    case 2:
                        hotel.relatorioDatasDeReserva();
                        break;

                    case 3:
                        hotel.relatorioDeSaida();
                        break;

                    case 4:
                        cadastrarHospede();
                        break;

                    case 5:
                        hotel.relatorioDeFuncionarios();
                        break;

                    case 6:
                        cadastrarFuncionario();
                        break;

                    case 0:
                        System.out.println("Saindo do menu...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente");
                        break;
                  
                }
            } while (opcao != 0);
        } else {
            System.out.println("Acesso negado! Sua senha não permite acesso ao menu");
        }
    }

    private boolean verificarSenha() {
        return senha == funcionario.getSENHA() || senha == hospede.getSENHA();
    }

    private void exibirOpcoesMenu() {
        System.out.println("======= MENU =======");
        System.out.println("1. Consultar Reservas");
        System.out.println("2. Cadastrar Reservas");
        System.out.println("3. Consultar Hóspedes");
        System.out.println("4. Cadastrar Hóspedes");
        System.out.println("5. Consultar Funcionários");
        System.out.println("6. Cadastrar Funcionários");
        System.out.println("0. Sair");
    }

    private void cadastrarHospede() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= CADASTRAR HÓSPEDE =======");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        // Outras informações do hóspede...

        // Criar um novo objeto Hospede e adicionar ao hotel
        Hospede novoHospede = new Hospede("Lelem", "Imaculada Conceição", "Araraquaro",
        "São Paulo", "(12) 940028922", "Angola", "elenzitcha@gmail.com", "123456", TipoDocumento.CPF,
        "Maria", "Paulo", LocalDate.now(), 1111111111, 4444, LocalDate.now());

        hotel.adicionaHospede(novoHospede);

        System.out.println("Hóspede cadastrado com sucesso!");
    }

    private void cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= CADASTRAR FUNCIONÁRIO =======");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        // Outras informações do funcionário...

        // Criar um novo objeto Funcionario e adicionar ao hotel
        Funcionario novoFuncionario = new Funcionario("Larissa", "Avenida 3", "Ouro Preto", "Minas Gerais", "(31) 77777-7777", 5000, LocalDate.of(1970, 2, 16));
        hotel.adicionaFuncionario(novoFuncionario);

        System.out.println("Funcionário cadastrado com sucesso!");
    }
}
