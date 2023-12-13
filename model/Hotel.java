package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Hospede> hospedesNoHotel;
    private ArrayList<Funcionario> funcionario;
    private ArrayList<Acomodacao> acomodacoesDoHotel;
    private ArrayList<Reserva> reserva;
    private ArrayList<ItensDeConsumo> itensDeConsumos;

    public Hotel() {
        hospedesNoHotel = new ArrayList<>();
        funcionario = new ArrayList<>();
        itensDeConsumos = new ArrayList<>();
        acomodacoesDoHotel = new ArrayList<>();
        reserva = new ArrayList<>();
    }

    public void adicionaHospede(Hospede hospede) {
        hospedesNoHotel.add(hospede);

    }

    public void ajusteHospede() {

    }

    public void removeHospede(Hospede hospede) {
        hospedesNoHotel.remove(hospede);

    }

    public void adicionaItem() {

    }

    public void ajusteItem() {

    }

    public void removeItem() {

    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.funcionario.add(funcionario);


    }

    public void removeFuncionario(String nome) {
        this.funcionario.removeIf(alguem -> alguem.getNome().trim().equalsIgnoreCase(nome.trim()));
    }

    public void ajusteFuncionario() {

    }

    public void adicionaAcomodacao(Acomodacao acomodacao) {
        this.acomodacoesDoHotel.add(acomodacao);

    }

    public void ajusteAcomodacao() {

    }

    public void removeAcomodacao(int numeroDaAcomodacao) {
        this.acomodacoesDoHotel.removeIf(numero -> numero.getNumeroDaAcomodacao() == numeroDaAcomodacao);

    }

    public void adicionarReserva(Reserva reservinha) {
        reserva.add(reservinha);
    }

    public void ajusteReserva() {

    }

    public void removeReserva(Reserva reservinha) {
        reserva.remove(reservinha);
    }

    public void checkInDoHotel(Reserva reservinha) {
        reserva.add(reservinha);
    }

    public void checkOutDoHotel(Reserva reserva) {
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
        for (Reserva r : reserva) {
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
        for (Reserva r: reserva) {
            if(r.getDataChegadaDoHospede().equals(data)){
                System.out.println("Hospede Principal: " +r.getHospedePrincipal().getNome());
                System.out.println("Telefone para Contato: " + r.getHospedePrincipal().getTelefone());
                System.out.println("Tipo de Acomodação Escolhida: " + r.getAcomodacaoDesejada().getCodigoTipoAcomodacao());
                System.out.println("Data Prevista Para a Saída: " + r.getDataSaidaDoHospede());
            }
        }
    }
    public void relatorioDeSaida(){
        for (Reserva r: reserva) {
            System.out.println("Hospede: " +r.getHospedePrincipal().getNome());
            System.out.println(r.getHospedePrincipal().getDocumento().getTipo() + ": " + r.getHospedePrincipal().getDocumento().getNumero());
            System.out.println("Data de Entrada: " + r.getDataChegadaDoHospede());
            System.out.println("Hora da Entrada: " + r.getHoraDeEntradaDoHospede());
            System.out.println("Data Prevista Para a Saída: " + r.getDataSaidaDoHospede());
            System.out.println("Hora Prevista Para a Saída: " + r.getHoraDeSaidaDoHospede());
            System.out.println("Total de Diárias: " + ChronoUnit.DAYS.between(r.getDataChegadaDoHospede(), r.getDataSaidaDoHospede()));
            System.out.println("Valor total da Diária " + r.getAcomodacaoDesejada().getValorDaDiaria());
            System.out.println("Valor do consumo dos hospedes: " );
            //
            // ESPAÇO DE ITENS DE CONSUMO
            //
            //
            //
            System.out.println("Valor Total a Pagar: " + r.calcularTotalAPagar());
            System.out.println("Pagamento em: " + r.getHospedePrincipal().getCartaoDoHospede().toString());
            System.out.println("\n________________________________");
            System.out.println("       ASSINATURA DO HÓSPEDE");

        }
    }

}
