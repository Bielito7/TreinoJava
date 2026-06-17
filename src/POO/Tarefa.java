package POO;

 public class Tarefa {
    String descricao;
    boolean concluida;

     public void descricaoTarefa() {
        System.out.println("Tarefa: " + descricao);
        if (concluida) {
            System.out.println("Status: Concluída ");
        } else {
            System.out.println("Status: Pendente ");
        }
    }
}
