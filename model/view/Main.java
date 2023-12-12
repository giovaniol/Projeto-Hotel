package model.view;

import model.Acomodacao;
import model.Hospede;
import model.Reserva;
import model.TipoDocumento;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Hospede lelem = new Hospede("Lelem", "Imaculada Conceição", "Araraquaro",
                "São Paulo", "(12) 940028922", 1234, "Angola", "elenzitcha@gmail.com", "123456", TipoDocumento.CPF,
                "Maria", "Paulo", LocalDate.now(), 1111111111, 4444, LocalDate.now());
        Acomodacao acomodacao1 = new Acomodacao();

        Reserva reserva1 = new Reserva(LocalDate.now(), LocalDate.of(1968, Month.OCTOBER, 12), lelem, acomodacao1);



    }
}
