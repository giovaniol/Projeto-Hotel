import java.time.*;
import java.time.format.DateTimeFormatter;

public class Boleto {
    private LocalDate dataVencimento;
    private double valorBoleto;
    private long codigoDeBarras;

    public Boleto(long codigoDeBarras){
        this.codigoDeBarras = codigoDeBarras;
        extrairData();
        extrairValor();
    }

    public LocalDate getDataVencimento(){
        return dataVencimento;
    }
    public  String getVencimento(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return  dataVencimento.format(formatter);
    }
    private void extrairData(){
        int dias;
        dias = (int) (codigoDeBarras / Math.pow(10,10));
        LocalDate dataBase = LocalDate.of(1997, Month.OCTOBER, 07);
        dataVencimento = dataBase.plusDays(dias);
    }
    private void extrairValor() {
        valorBoleto = (codigoDeBarras % Math.pow(10, 10)) / 100;
    }
}
