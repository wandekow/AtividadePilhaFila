import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaArray pilha = new PilhaArray(5);
        FilaArray fila = new FilaArray(5);

        int opcaoPrincipal;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Testar Pilha");
            System.out.println("2 - Testar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    menuPilha(scanner, pilha);
                    break;
                case 2:
                    menuFila(scanner, fila);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcaoPrincipal != 0);

        scanner.close();
    }

    public static void menuPilha(Scanner scanner, PilhaArray pilha) {
        int opcao;
        do {
            System.out.println("\n===== MENU PILHA =====");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Ver topo");
            System.out.println("4 - Verificar se está vazia");
            System.out.println("5 - Verificar se está cheia");
            System.out.println("6 - Exibir pilha");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor: ");
                    int valorPush = scanner.nextInt();
                    pilha.push(valorPush);
                    break;
                case 2:
                    System.out.println("Removido: " + pilha.pop());
                    break;
                case 3:
                    System.out.println("Topo: " + pilha.peek());
                    break;
                case 4:
                    System.out.println(pilha.isEmpty() ? "Pilha vazia" : "Pilha não está vazia");
                    break;
                case 5:
                    System.out.println(pilha.isFull() ? "Pilha cheia" : "Pilha não está cheia");
                    break;
                case 6:
                    pilha.display();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void menuFila(Scanner scanner, FilaArray fila) {
        int opcao;
        do {
            System.out.println("\n===== MENU FILA =====");
            System.out.println("1 - Inserir na fila");
            System.out.println("2 - Remover da fila");
            System.out.println("3 - Ver primeiro elemento");
            System.out.println("4 - Verificar se está vazia");
            System.out.println("5 - Verificar se está cheia");
            System.out.println("6 - Exibir fila");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor: ");
                    int valorEnqueue = scanner.nextInt();
                    fila.enqueue(valorEnqueue);
                    break;
                case 2:
                    System.out.println("Removido: " + fila.dequeue());
                    break;
                case 3:
                    System.out.println("Primeiro elemento: " + fila.front());
                    break;
                case 4:
                    System.out.println(fila.isEmpty() ? "Fila vazia" : "Fila não está vazia");
                    break;
                case 5:
                    System.out.println(fila.isFull() ? "Fila cheia" : "Fila não está cheia");
                    break;
                case 6:
                    fila.display();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}