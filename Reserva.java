import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
    private LocalDate dataChegadaDoHospede;
    private LocalDate horaChegadaDoHospede;
    private LocalDate dataSaidaDoHospede;
    private LocalDate horaSaidaDoHospede;
    private Hospede hospedePrincipal;
    private TipoAcomodacao acomodacaoDesejada;
    private ArrayList<String> nomeAcompanhantes;
    private ArrayList<Integer> idadeAcompanhantes;
    private double valorDiaria;
    private double taxaDeMulta;
    private int dadosDoCartaoDeCredito;

}
