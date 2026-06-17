package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataLembrete {
    static void main(String[] args) {
        LocalDate dataPgto = LocalDate.of(2026,07,20);
        int antecipar = 5;
        LocalDate lembrete = dataPgto.minusDays(antecipar);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do lembrete: " + lembrete.format(formato));
    }
}
