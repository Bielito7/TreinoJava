package POO;

import java.util.Scanner;

public class Colaborador {
    String nome;
    String cargo;
    int nivelDeAcesso;

    public void alterarDados(int novoNivel, String novoCargo) {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de Acesso: " + nivelDeAcesso);

        nivelDeAcesso = novoNivel;
        cargo = novoCargo;

        System.out.println("--- COLABORADOR ATUALIZADO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de Acesso : " + nivelDeAcesso);
    }
}
