package DateTime;

import java.time.LocalTime;
import java.time.Duration;

        public class DiferencaHora {
            public static void main(String[] args) {
                LocalTime horarioInicio = LocalTime.of(13, 30, 0);   // Cria horários
                LocalTime horarioTermino = LocalTime.of(17, 45, 0);

                Duration duracao = Duration.between(horarioInicio, horarioTermino); // Calcula a diferença entre os horários

                System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");  // Obter horas e obter minutos
            }
        }

