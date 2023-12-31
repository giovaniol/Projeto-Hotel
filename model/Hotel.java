package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Hospede> hospedesNoHotel;
    private ArrayList<Funcionario> funcionariosNoHotel;
    private ArrayList<Acomodacao> acomodacoesDoHotel;
    private ArrayList<Reserva> reservas;
    private ArrayList<ItensDeConsumo> itensDeConsumos;

    public Hotel() {
        // Dados Mockados - Hospedes
        Hospede hospede1 = new Hospede("João", "Rua 1", "Cidade 1", "Estado 1", "Telefone 1",
                "Brasil", "Email 1", "Documento 1", TipoDocumento.CPF, "Mãe 1",
                "Pai 1", LocalDate.of(1990, 1, 1),
                123456789, 123, LocalDate.of(2020, 1, 1));
        Hospede hospede2 = new Hospede("Maria", "Rua 2", "Cidade 2", "Estado 2", "Telefone 2",
                "Brasil", "Email 2", "Documento 2", TipoDocumento.CPF, "Mãe 2",
                "Pai 2", LocalDate.of(1990, 1, 1),
                123456789, 123, LocalDate.of(2020, 1, 1));
        Hospede hospede3 = new Hospede("José", "Rua 3", "Cidade 3", "Estado 3", "Telefone 3",
                "Brasil", "Email 3", "Documento 3", TipoDocumento.CPF, "Mãe 3",
                "Pai 3", LocalDate.of(1990, 1, 1),
                123456789, 123, LocalDate.of(2020, 1, 1));

        hospedesNoHotel = new ArrayList<>();

        // Adicionando os hospedes mockados
        hospedesNoHotel.add(hospede1);
        hospedesNoHotel.add(hospede2);
        hospedesNoHotel.add(hospede3);


        // Dados Mokados - Funcionários
        Funcionario funcionario1 = new Funcionario("Fernando", "Avenida 1", "Araraquara", "São Paulo", "(16) 99999-9999", 2100, LocalDate.of(1993, 4, 5));
        Funcionario funcionario2 = new Funcionario("Gabriel", "Avenida 2", "São Luis", "Maranhão", "(98) 88888-8888", 1500, LocalDate.of(1990, 8, 21));

        funcionariosNoHotel = new ArrayList<>();

        // Adicionando funcionários mockados
        funcionariosNoHotel.add(funcionario1);
        funcionariosNoHotel.add(funcionario2);

        itensDeConsumos = new ArrayList<>();
        acomodacoesDoHotel = new ArrayList<>();

        // Dados Mockados - Acomodações
        Acomodacao acomodacao1 = new Acomodacao(101, 1, TipoAcomodacao.COMUM, 100.0);
        Acomodacao acomodacao2 = new Acomodacao(102, 1, TipoAcomodacao.SUITE, 200.0);
        Acomodacao acomodacao3 = new Acomodacao(201, 2, TipoAcomodacao.COMUM, 300.0);

        acomodacoesDoHotel.add(acomodacao1);
        acomodacoesDoHotel.add(acomodacao2);
        acomodacoesDoHotel.add(acomodacao3);

        reservas = new ArrayList<>();

        // Dados Mockados - Reservas
        Reserva reserva1 = new Reserva(
                LocalDate.of(2023, 1, 10),
                LocalTime.of(14, 0),
                LocalTime.of(12, 0),
                LocalDate.of(2023, 1, 15),
                hospede1,
                acomodacao1
        );

        Reserva reserva2 = new Reserva(
                LocalDate.of(2023, 2, 5),
                LocalTime.of(12, 0),
                LocalTime.of(10, 0),
                LocalDate.of(2023, 2, 10),
                hospede2,
                acomodacao2
        );

        reservas.add(reserva1);
        reservas.add(reserva2);
    }

    public void adicionaHospede(Hospede hospede) {
        hospedesNoHotel.add(hospede);
    }

    public void ajusteHospede(String numeroDocumento, String novoEmail) {
        for (Hospede h : hospedesNoHotel) {
            if (h.getDocumento().getNumero().equalsIgnoreCase(numeroDocumento.trim())) {
                h.setEmail(novoEmail);
                System.out.println("Informações do hóspede atualizadas.");
                return;
            }
        }
        System.out.println("Hóspede não encontrado.");
    }

    public void removeHospede(String nome) {
        Hospede hospedeARemover = null;
        for (Hospede h : hospedesNoHotel) {
            if (h.getNome().equalsIgnoreCase(nome.trim())) {
                hospedeARemover = h;
                break;
            }
        }
        if (hospedeARemover != null) {
            hospedesNoHotel.remove(hospedeARemover);
        } else {
            System.out.println("Hóspede não encontrado.");
        }
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.funcionariosNoHotel.add(funcionario);
    }

    public void removeFuncionario(String nome) {
        Funcionario funcionarioARemover = null;
        for(Funcionario f : funcionariosNoHotel){
            if(f.getNome().equalsIgnoreCase(nome.trim())){
                funcionarioARemover = f;
                break;
            }
        }

        if(funcionarioARemover != null){
            funcionariosNoHotel.remove(funcionarioARemover);
        }else{
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void ajusteFuncionario(double salario,double novoSalario,String nome) {
        for(Funcionario h: funcionariosNoHotel){
            if(h.getSalario() == salario && h.getNome()== nome){
                h.setSalario(novoSalario);
                System.out.println("Informações do funcionario atualizadas.");
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }

    public void adicionaAcomodacao(Acomodacao acomodacao) {
        this.acomodacoesDoHotel.add(acomodacao);

    }

    public void removeAcomodacao(int numeroDaAcomodacao) {
        this.acomodacoesDoHotel.removeIf(numero -> numero.getNumeroDaAcomodacao() == numeroDaAcomodacao);

    }

    /**
     * Verifica a disponibilidade de reserva para um período específico.
     *
     * @param dataChegada Data de chegada desejada para a reserva.
     * @param dataSaida   Data de saída desejada para a reserva.
     * @return true se o período estiver disponível para reserva, false caso contrário.
     */
    public boolean verificarDisponibilidadeDeReserva(LocalDate dataChegada, LocalDate dataSaida) {
        for (Reserva r : reservas) {
            if ((dataChegada.isAfter(r.getDataChegadaDoHospede()) && dataChegada.isBefore(r.getDataSaidaDoHospede()))
                    || (dataSaida.isAfter(r.getDataChegadaDoHospede()) && dataSaida.isBefore(r.getDataSaidaDoHospede()))) {
                return false;
            }
            if (dataChegada.isBefore(r.getDataChegadaDoHospede()) && dataSaida.isAfter(r.getDataSaidaDoHospede())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Realiza uma nova reserva se o período estiver disponível.
     *
     * @param novaReserva A nova reserva a ser efetuada.
     */
    public void fazerReserva(Reserva novaReserva) {
        if (verificarDisponibilidadeDeReserva(novaReserva.getDataChegadaDoHospede(), novaReserva.getDataSaidaDoHospede())) {
            this.adicionarReserva(novaReserva);
        } else {
            System.out.println("Não foi possível fazer a reserva. Período já reservado.");
        }
    }

    /**
     * Adiciona uma reserva à lista de reservas.
     *
     * @param reserva A reserva a ser adicionada.
     */
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    /**
     * Realiza o ajuste de uma reserva para novas datas, se o período estiver disponível.
     *
     * @param reserva         A reserva a ser ajustada.
     * @param novaDataChegada A nova data de chegada desejada.
     * @param novaDataSaida   A nova data de saída desejada.
     */
    public void ajusteReserva(Reserva reserva, LocalDate novaDataChegada, LocalDate novaDataSaida) {
        if (verificarDisponibilidadeDeReserva(novaDataChegada, novaDataSaida)) {
            reserva.setDataChegadaDoHospede(novaDataChegada);
            reserva.setDataSaidaDoHospede(novaDataSaida);
            System.out.println("Reserva ajustada com sucesso.");
        } else {
            System.out.println("Não foi possível ajustar a reserva. Período já reservado.");
        }
    }

    /**
     * Realiza o check-out de um hóspede, removendo a reserva da lista de reservas.
     *
     * @param reserva A reserva para a qual o check-out será realizado.
     */
    public void checkOutDoHotel(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Check-out realizado com sucesso.");
    }

    public boolean verificarPossibilidadeDeReserva() {

        return false;
    }

    public void relatarHospedes() {
        for (Hospede alguem : hospedesNoHotel) {
            alguem.detalhesHospede();
        }
    }

    public void getHospedes() {
        for (Hospede alguem : hospedesNoHotel) {
            System.out.println("Nome do Hospede: " + alguem.getNome());
        }
    }

    public void relatorioDeHospede() {
        System.out.println("---------Relatório-----------");
        for (Reserva r : reservas) {
            System.out.println("Hospede Principal: " + r.getHospedePrincipal().getNome());
            if (r.temAcompanhante()) {
                System.out.println("Acompanhantes: " + r.getAcompanhantes().getNome());
            }
            System.out.println("Data de Entrada: " + r.getDataChegadaDoHospede());
            System.out.println("Data de Saída: " + r.getDataSaidaDoHospede());
            System.out.println("Número da acomodação: " + r.getAcomodacaoDesejada().getNumeroDaAcomodacao());

        }
        System.out.println("-----------------------------");
    }

    public void relatorioDatasDeReserva(){
        LocalDate data = LocalDate.now();
        for (Reserva r: reservas) {
            if(r.getDataChegadaDoHospede().equals(data)){
                System.out.println("Hospede Principal: " +r.getHospedePrincipal().getNome());
                System.out.println("Telefone para Contato: " + r.getHospedePrincipal().getTelefone());
                System.out.println("Tipo de Acomodação Escolhida: " + r.getAcomodacaoDesejada().getCodigoTipoAcomodacao());
                System.out.println("Data Prevista Para a Saída: " + r.getDataSaidaDoHospede());
            }
        }
    }
    public void relatorioDeSaida(){
        for (Reserva r: reservas) {
            System.out.println("Hospede: " +r.getHospedePrincipal().getNome());
            System.out.println(r.getHospedePrincipal().getDocumento().getTipo() + ": " + r.getHospedePrincipal().getDocumento().getNumero());
            System.out.println("Data de Entrada: " + r.getDataChegadaDoHospede());
            System.out.println("Hora da Entrada: " + r.getHoraDeEntradaDoHospede());
            System.out.println("Data Prevista Para a Saída: " + r.getDataSaidaDoHospede());
            System.out.println("Hora Prevista Para a Saída: " + r.getHoraDeSaidaDoHospede());
            System.out.println("Total de Diárias: " + ChronoUnit.DAYS.between(r.getDataChegadaDoHospede(), r.getDataSaidaDoHospede()));
            System.out.println("Valor total da Diária " + r.getAcomodacaoDesejada().getValorDaDiaria());
            System.out.println("Valor do consumo dos hospedes: " );
            System.out.println("Valor Total a Pagar: " + r.calcularTotalAPagar());
            System.out.println("Pagamento em: " + r.getHospedePrincipal().getCartaoDoHospede().toString());
            System.out.println("\n________________________________");
            System.out.println("       ASSINATURA DO HÓSPEDE");

        }
    }

    public void relatorioDeFuncionarios() {
        System.out.println("--------- Relatório de Funcionários ----------");
        for (Funcionario funcionario : funcionariosNoHotel) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cidade: " + funcionario.getCidade());
            System.out.println("Estado: " + funcionario.getEstado());
            System.out.println("Endereço: " + funcionario.getEndereco());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Data de Nascimento: " + funcionario.getDataDeNascimento());
            System.out.println("--------------------------------------------");
        }
    }
}
