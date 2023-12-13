package model.view;

import model.*;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {
        Hospede lelem = new Hospede("Lelem", "Imaculada Conceição", "Araraquaro",
                "São Paulo", "(12) 940028922", "Angola", "elenzitcha@gmail.com", "123456", TipoDocumento.CPF,
                "Maria", "Paulo", LocalDate.now(), 1111111111, 4444, LocalDate.now());
        Hospede pedro = new Hospede("pedrinho", "Imaculada Conceição", "Araraquaro",
                "São Paulo", "(12) 940028922", "Angola", "elenzitcha@gmail.com", "123456", TipoDocumento.CPF,
                "Maria", "Paulo", LocalDate.now(), 1111111111, 4444, LocalDate.now());

        Acomodacao acomodacao1 = new Acomodacao(1, 1,TipoAcomodacao.SUITE, 1000);
        Reserva reserva1 = new Reserva(LocalDate.now(), LocalTime.now(),
         LocalTime.now(), LocalDate.now(), pedro, acomodacao1);
        reserva1.adicionarAcompanhantes(lelem);
        Hotel hotel = new Hotel();
        hotel.adicionarReserva(reserva1);
        hotel.adicionaHospede(lelem);
        hotel.adicionaHospede(pedro);


        hotel.relatorioDeHospede();
        hotel.relatorioDatasDeReserva();



    }
}
