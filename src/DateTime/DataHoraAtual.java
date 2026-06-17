package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataHoraAtual {
    static void main(String[] args) {
        String tarefa = "enviar relatório semanal";

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data de criação: " + dataCriacao.format(formatoData));
        System.out.println("Hora de criação: " + horaCriacao.format(formatoHora));
    }
}
