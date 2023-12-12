package model.view;

import model.*;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Hospede lelem = new Hospede("Lelem", "Imaculada Conceição", "Araraquaro",
                "São Paulo", "(12) 940028922", 1234, "Angola", "elenzitcha@gmail.com", "123456", TipoDocumento.CPF,
                "Maria", "Paulo", LocalDate.now(), 1111111111, 4444, LocalDate.now());
        Hospede pedro = new Hospede("pedrinho", "Imaculada Conceição", "Araraquaro",
                "São Paulo", "(12) 940028922", 1234, "Angola", "elenzitcha@gmail.com", "123456", TipoDocumento.CPF,
                "Maria", "Paulo", LocalDate.now(), 1111111111, 4444, LocalDate.now());


        Hotel hotel = new Hotel();
        hotel.adicionaHospede(lelem);
        hotel.adicionaHospede(pedro);
        hotel.relatorioDeHospedes();
        hotel.getHospedes();



    }
}
