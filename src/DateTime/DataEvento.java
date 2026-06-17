package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEvento {
    static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2026, 03, 20);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data evento: " + dataEvento.format(formato));
        System.out.println("Data de hoje: " + dataAtual.format(formato));

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("Esse evento já ocorreu");
        } else {
            System.out.println("Esse evento ainda não ocorreu");
        }
    }
}
