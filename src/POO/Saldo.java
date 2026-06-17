package POO;

public class Saldo {
    String nome;
    double saldo;

    public void ZerarSaldo() {
        saldo = 0;
        System.out.println(nome + " seu saldo foi zerado !!");
    }

    public void ExibirSaldo() {
        System.out.printf("\n Saldo atual: %.2f \n", saldo);
    }

}
