package POO;

public class Estoque {
    String nome;
    int quantidade;

    public void vender(int qtdVendida) {
        if (qtdVendida < quantidade) {
            quantidade = quantidade - qtdVendida;
            System.out.printf("\nVenda efetuada, quantidade restante de %s: %d\n", nome,quantidade);
        } else {
            System.out.println("ESTOQUE INSUFICIENTE !!");
        }
    }


}
