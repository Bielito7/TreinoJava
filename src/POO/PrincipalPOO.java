package POO;

import java.util.ArrayList;
import java.util.List;

public class PrincipalPOO {
    static void main(String[] args) {
    Produto p = new Produto();
    p.nome = "Mouse gamer";
    p.preco = 200.00;
    p.quantidade = 5;
    p.ExibirInformacoes();

    Saldo s = new Saldo();
    s.nome = "Gabriel";
    s.saldo = 1350.500;
    s.ExibirSaldo();
    s.ZerarSaldo();
    s.ExibirSaldo();

    Aluno aluno = new Aluno();
    aluno.nome = "Gabriel";
    aluno.nota1 = 5.5;
    aluno.nota2 = 9.0;
    aluno.CalcularMedia();
    aluno.ResultadoAluno();

    Colaborador c = new Colaborador();
    c.nome = "Jorge";
    c.cargo = "Analista 1";
    c.nivelDeAcesso = 1;
    c.alterarDados(2,"Analista 2");

        Tarefa t1 = new Tarefa();
        t1.descricao = "Estudar Banco de Dados";
        t1.concluida = false;

        Tarefa t2 = new Tarefa();
        t2.descricao = "Fazer cursos GC";
        t2.concluida = true;

        List<Tarefa> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for(Tarefa t : lista) {
            t.descricaoTarefa();
        }

        Estoque item = new Estoque();
        item.quantidade = 10;
        item.nome = "Calças";
        item.vender(5);
        item.vender(6);
    }
}
