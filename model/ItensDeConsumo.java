package model;

import java.time.LocalDate;
import java.util.List;

public class ItensDeConsumo {
    private LocalDate dataDeConsumo;
    private Funcionario funcionarioQueVendeu;
    private Acomodacao acomodacaoDoConsumo;
    private List<ItensDeConsumo> itensConsumidos;
}
