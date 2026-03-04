import java.util.Scanner;
import java.util.ArrayList;

public class gerenciadorTarefas {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;

        System.out.println("GERENCIADOR DE TAREFAS 2026");

        do {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a tarefa: ");
                String novaTarefa = leitor.nextLine();
                tarefas.add(novaTarefa);
                System.out.println("Tarefa salva!");
            } else if (opcao == 2) {
                System.out.println("\n Suas Tarefas");

                if (tarefas.isEmpty()) {
                    System.out.println("Sua lista está vazia no momento.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i+1) + ". " + tarefas.get(i));
                    }
                }
            }
        } while (opcao != 3);

        System.out.println("Encerrando... Bom dia de trabalho!");
    }
}
