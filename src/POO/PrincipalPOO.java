package POO;

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
    }
}
