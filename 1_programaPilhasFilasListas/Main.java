import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        Lista lista = new Lista();

        int escolha;

        do {
            System.out.println("================================"+"\n"
                                +"Escolha uma opção:"+"\n"
                                +"1 - Pilha"+"\n"
                                +"2 - Fila"+"\n"
                                +"3 - Lista"+"\n"
                                +"4 - Mostrar"+"\n"
                                +"0 - Sair"+"\n"+"\n"
                                +"Digite: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    menuPilha(pilha, scanner);
                    break;
                case 2:
                    menuFila(fila, scanner);
                    break;
                case 3:
                    menuLista(lista, scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }

    private static void menuPilha(Pilha pilha, Scanner scanner) {
        int escolha;

        do {

            System.out.println("\n"+"Escolha uma operação para a Pilha:"+"\n"
            +"1 - Push(Inserir valor)"+"\n"
            +"2 - Pop(Tirar valor)"+"\n"
            +"0 - Voltar ao menu principal"+"\n"+"\n"
            +"Digite: ");
            
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valorPush = scanner.nextInt();
                    pilha.push(valorPush);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (escolha != 0);
    }

    private static void menuFila(Fila fila, Scanner scanner) {
        int escolha;

        do {

            System.out.println("\n"+"Escolha uma operação para a Fila:"+"\n"
            +"1 - Enqueue ()"+"\n"
            +"2 - Dequeue()"+"\n"
            +"0 - Voltar ao menu principal"+"\n"+"\n"
            +"Digite: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valorEnqueue = scanner.nextInt();
                    fila.enqueue(valorEnqueue);
                    break;
                case 2:
                    fila.dequeue();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (escolha != 0);
    }

    private static void menuLista(Lista lista, Scanner scanner) {
        int escolha;

        do {

            System.out.println("\n"+"Escolha uma operação para a Lista:"+"\n"
            +"1 - Inserir no início da lista ()"+"\n"
            +"2 - Inserir no fim da lista()"+"\n"
            +"0 - Voltar ao menu principal"+"\n"+"\n"
            +"Digite: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor a ser inserido no início: ");
                    int valorInicio = scanner.nextInt();
                    lista.inserirInicio(valorInicio);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser inserido no fim: ");
                    int valorFim = scanner.nextInt();
                    lista.inserirFim(valorFim);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (escolha != 0);
    }
    
}
