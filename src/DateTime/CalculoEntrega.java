package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculoEntrega {
    static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 20;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de entrega: " + dataEntrega.format(formato));

    }
}
