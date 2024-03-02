import java.util.Scanner;
    public class Main { //funções ordenar

        static int ordem = 0;

        //-----------1---------------------------------------

        public static void menuUm(){  // criar vetor
            System.out.println(" ");
            System.out.println("Criamos um vetor vazio");
            System.out.println(" ");
            System.out.println("Deseja zerar o vetor, digite: 2");
            System.out.println("Voltar ao menu, digite: 9");
            System.out.println(" ");
            System.out.printf("Digite: ");

        }

        public static void menuUmZera(){//zerar TUDO
            for(int j = 0; j< Objeto.arr.length; j++ ){
                Objeto.arr[j]=0;
            }
            System.out.println(" ");
            System.out.println("Zeramos o vetor");
            System.out.println(" ");
            System.out.println(" ");

            ordem = 0; //arrumar

        }
        public static void imprimeMenu(){ //Imprime o menu e Voltar ao menu
            System.out.println("-------Menu--------");
            System.out.println("Para criar um vetor vazio, digite: 1");
            System.out.println("Inserir valor digitado, digite: 2");
            System.out.println("Inserir valores aleatórios, digite 3");
            System.out.println("Apagar um valor do vetor, digite: 4");
            System.out.println("Consultar valor, digite: 5");
            System.out.println("Contar valores positivos no vetor, digite: 6");
            System.out.println("Qual o maior valor, digite: 7");
            System.out.println("Qual o menor valor, digite: 8");
            System.out.println("Busca Binária Iterativa, digite: 9");
            System.out.println("Busca Binária com Recursividade, digite: 10");
            System.out.println("Ordenar com Bubble Sort, digite: 11");
            System.out.println("Ordenar com Selection Sort, digite: 12");
            System.out.println("Ordenar com Insertion Sort, digite: 13");
            System.out.println("Ordenar com Quick Sort, digite: 14");
            System.out.println("Mostrar todos os valores armazenados, digite: 15");
            System.out.println("Quantas buscas foram realizadas, digite: 16");
            System.out.println("Sair do programa, digite: 0");
            System.out.println(" ");
            System.out.printf("Digite: ");
    
    
        }

    public static void main(String[] args) {
        Scanner teclado =  new Scanner (System.in);

        Objeto A = new Objeto();

        System.out.println("====================================================================================");
        System.out.println("Digite um número de 1 a 10 para iniciar o sistema,"+"\n"+"ou 0 para sair do sistema!"+"\n");
        int tecla = teclado.nextInt();

        int i = 0;
        while(tecla!=0){
            System.out.println("Iniciando o sistema....."+"\n");
            while(i<10){

                imprimeMenu();
                tecla = teclado.nextInt();
                System.out.println(" ");

                if(tecla>16 || tecla<0){
                    System.out.println("Voltando ao menu....");

                }

                // criar vetor
                if(tecla==1){
                    menuUm();
                    int tec = teclado.nextInt();

                    if(tec==9){ //Voltar ao menu
                        imprimeMenu();
                    }
                    if(tec==2){ //zerar TUDO
                        menuUmZera();
                        break;
                    }
                }

                if(tecla==2){ //Inserir valor digitado
                    A.menuDois(teclado);
                }


                if(tecla==3){//inserir valor aleatorio
                    //i++;
                    A.menuTres();
                }

                if(tecla==4){ //apagar valor
                    //i++;
                    A.menuQuatro( teclado);
                }

                if(tecla==5){ //Contagem de valores positivos no vetor
                    A.menuCinco(teclado);
                    int tec=teclado.nextInt();

                    if(tec==9) {
                        //i++;
                        //mf.imprimeMenu();
                    }

                }

                if(tecla==6){// contar valores positivos
                    A.menuSeis();
                }

                if(tecla==7){//maior valor
                    A.menuSete();
                }

                if(tecla==8){//menor valor
                    A.menuOito();
                }
                if(tecla==9){//busca binária iterativa
                    A.menuNove(teclado);
                }
                Scanner tec = new Scanner(System.in);
                if(tecla==10) { //busca binária recursiva

                    if (ordem != 0) {

                        System.out.print("Digite o valor a ser consultado:");
                        int valor = tec.nextInt();

                        int resultado = A.menuDez(0, Objeto.arr.length -1 ,valor);
                        //int resultado = A.menuDez(arr, 0, arr.length - 1, valor);

                        if (resultado >= 0) {
                            System.out.println("O número pesquisado " + valor + " encontra-se na posição " + resultado + " do vetor.");
                        } else {
                            System.out.println("O número não está no vetor.");
                        }

                    }
                }
                if(tecla==11){
                    long startTime = System.nanoTime();
                    A.ordenarBubble();
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) /1000; //microssegundos

                    System.out.println("Bubble Sort executado em "+duration+" microssegundos.");
                }

                if(tecla==12){
                    long startTime = System.nanoTime();
                    A.ordenarSelection();
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) /1000; //microssegundos

                    System.out.println("Selection Sort executado em "+duration+" microssegundos.");
                }

                if(tecla==13){
                    long startTime = System.nanoTime();
                    A.ordenarInsertion();
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) /1000; //microssegundos

                    System.out.println("Insertion Sort executado em "+duration+" microssegundos.");
                }

                if(tecla==14){
                    long startTime = System.nanoTime();
                    A.ordenarQuick( i, i);
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime) /1000; //microssegundos

                    System.out.println("Quick Sort executado em "+duration+" microssegundos.");
                }

                if(tecla==15){//Mostrar valores armazenados
                    A.menuQuinze();
                }

                if(tecla==16){//Consultar quantas buscas tiveram
                    A.menuDezesseis();
                }

                if(tecla==0){ //sair do programa
                    A.menuSair();
                    break;
                }
            }

        }
    
    }
            
        }
    
