package POO;

public class Produto {
     String nome;
     int quantidade;
     double preco;

    public void ExibirInformacoes () {
        System.out.println("nome do produto: " + nome);
        System.out.println("quantidade: " + quantidade);
        System.out.printf("Preço:  %.2f", preco);
    }

}
