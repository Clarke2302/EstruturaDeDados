import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Arvore lista = new Arvore();

        int tecla = 1;

        while(tecla!=0){

            showMenu();

            tecla = tec.nextInt();
            
            if(tecla==1){ //inserir valor
                System.out.print("\n"+"Digite um valor: ");
                    int valorDig = tec.nextInt();
                    if (lista.adicionar(valorDig)) {
                        System.out.println("\n"+"Valor foi adicionado com sucesso!");
                    } else {
                        System.out.println("\n"+"Valor já existe na árvore!!!");
                    }
            }
            
            if(tecla==2){ //apagar valor
                System.out.print("\n"+"Digite um valor: ");
                int valorDig = tec.nextInt();
                if (lista.remover(valorDig)) {
                    System.out.println("\n"+"Remocao concluída!");
                } else {
                    System.out.println("\n"+"Valor não encontrado!!!");
                }
            }

            if(tecla==3){ //mostrar em ordem
                System.out.print("\n"+"Árvore em ordem: ");
                    lista.mostrarEmOrdem(lista.getRaiz());
                    System.out.println();
            }
            if(tecla==4){ //verificar se valor está na árvore
                System.out.print("\n"+"Digite um valor para consultar: ");
                int valorDig = tec.nextInt();
                    if (lista.contem(valorDig)) {
                        System.out.println("\n"+"Valor está na árvore!");
                    } else {
                        System.out.println("\n"+"Valor não consta na árvore!!!");
                    }
            }
            if(tecla==5){ //limpar árvore
                lista.limparArvore();
                System.out.println("\n"+"A Árvore agora está vazia.");
            }
            if(tecla==0){
                System.out.println("\n"+"Você está saindo de nosso sistema! "+"\n"+"Volte Sempre! :) ");
                
            }
        }

    }
    //Funções

    public static void showMenu(){
        System.out.println("\n"+"=================Menu Árvore AVL====================="+"\n"
                            +"1 - Inserir valor: "+"\n"
                            +"2 - Apagar valor: "+"\n"
                            +"3 - Mostrar em ordem todos os valores da árvore: "+"\n"
                            +"4 - Verificar valor na árvore: "+"\n"
                            +"5 - Limpar toda a àrvore: "+"\n"
                            +"0 - Sair do Sistema: "+"\n"
                            +"====================================================="+"\n");
                            System.out.printf("Digite: ");
    }

}
