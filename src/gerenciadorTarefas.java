import java.util.Scanner;
import java.util.ArrayList;

public class gerenciadorTarefas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;

        System.out.println("GERENCIADOR DE TAREFAS 2026");

        do {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha: "); // menu

            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a tarefa: ");
                String novaTarefa = leitor.nextLine();
                tarefas.add(novaTarefa);
                System.out.println("Tarefa salva!"); // permite inserir uma tarefa
            } else if (opcao == 2) {
                System.out.println("\n Suas Tarefas");

                if (tarefas.isEmpty()) {
                    System.out.println("Sua lista está vazia no momento.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    } // salva as tarefas na lista de tarefas de fato
                }

            } else if (opcao == 3) {
                if (tarefas.isEmpty()) {
                    System.out.println("A lista está vazia, nada para remover.");
                } else {
                    System.out.println("Lista de Tarefas");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));

                        System.out.print("\nQual número deseja remover? ");
                        int idRemover = leitor.nextInt();
                        leitor.nextLine();

                        if (idRemover > 0 && idRemover <= tarefas.size()) {
                            String removida = tarefas.remove(idRemover - 1);
                            System.out.println("Tarefa '" + removida + "' removida!");
                        } else {
                            System.out.println("Número inválido."); // aqui ele remove uma das tarefas de fato
                        }
                    }
                }
            }
        } while (opcao != 4);

        System.out.println("Encerrando... Bom dia de trabalho!"); // se o usuário selecionar a opção 4 o programa encerra
    }
}
