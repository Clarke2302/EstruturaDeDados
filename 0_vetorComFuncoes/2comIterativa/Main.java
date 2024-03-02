import java.util.Random;
import java.util.Scanner;
    public class Main { //funções ordenar

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
            System.out.println("Mostrar todos os valores armazenados, digite: 10");
            System.out.println("Quantas buscas foram realizadas, digite: 11");
            System.out.println("Sair do programa, digite: 0");
            System.out.println(" ");
            System.out.printf("Digite: ");
    
    
        }
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
    
        public static void menuUmZera(int []vetor){//zerar TUDO
            for(int j=0; j<vetor.length; j++ ){
                vetor[j]=0;
            }
            System.out.println(" ");
            System.out.println("Zeramos o vetor");
            System.out.println(" ");
            System.out.println(" ");

            ordem = 0;
    
        }

        //---------------2----------------------------------
        public static void menuDois(int [] vetor, Scanner nome){
            System.out.println("Digite um valor:");
            for(int i=0; i<vetor.length; i++){
                if(vetor[i]==0) { //se houver ZERO no vetor é considerando vazio
                    
                    vetor[i] = nome.nextInt();
                }
            }
            System.out.println("O vetor foi preenchido!");
        }
    //--------------------3----------------------------------
        // inserir conteúdo no vetor a partir da geração de valores aleatórios - NÃO ORDENADOS.

        public static void menuTres(int [] vetor) {
            Random aleatorio = new Random();
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == 0) {
                    vetor[i] = aleatorio.nextInt(1,10000);
                }
            }
            System.out.println("O vetor foi preenchido!");
        }
//-------------------------4------------------------------------
        public static void menuQuatro(int vetor[], Scanner teclado){
            System.out.printf("Qual valor deseja apagar? ");
            int apagaValor=teclado.nextInt();
            int apagar=0;
            int pos = -1;
    
            for(int j=0; j<vetor.length; j++){
                if(apagaValor==vetor[j]){
                    vetor[j]=0;
                    apagar++;
                    pos=j;
                }
            }
            if(apagar!=0){
                System.out.println("Apagamos o valor na posição "+pos);
            }else{
                System.out.println("Esse valor não existe no vetor! ");
            }
    
    
            System.out.println(" ");
            System.out.println("Voltar ao menu, Digite: 9 ");
            int tec=teclado.nextInt();
            System.out.println(" ");
    
            if(tec==9){ //voltar ao menu
                //imprimeMenu();
            }
    
        }
    
        //------------5--------------------
        static int contaBusca = 0;

        public static void menuCinco(int vetor[], Scanner teclado){
            int j=0;
            int pos=-1;
            int anotar=0;
            System.out.print("Qual valor deseja consultar? ");
            int consultaValor=teclado.nextInt();
    
    
            for(j=0;j<vetor.length; j++){
    
                if(consultaValor==vetor[j]){
                    anotar++;
                    pos=j;
                }
            }
            if(anotar!=0){
                System.out.println(" ");
                System.out.println("Esse valor está na posição "+pos+" do vetor.");
                System.out.println(" ");
            }else{
                System.out.println(" ");
                System.out.println("Esse valor não existe no vetor!");
                System.out.println(" ");
    
            }
            contaBusca++;
        }
    
        //-----------6----------------------
        public static void menuSeis(int[] vetor){
            int contaVazios = 0;
            int conta=0;
            for(int j=0; j<vetor.length; j++) {
    
                if(vetor[j]>0) {
                    conta++;
                }
                if (vetor[j] == 0) {
                    contaVazios++;
                }
            }
            System.out.println(" ");
            System.out.println("Temos "+conta+" valores válidos nesse vetor.");
            System.out.println("Temos " + contaVazios + " números vazios válidos nesse vetor.");
            System.out.println(" ");
            System.out.println("Ir para o menu, Digite: 9 ");
    
    
        }
        
    
        //-----------7---------------------
        public static void menuSete(int[]vetor){
    
            int contaMaior=0;
            int maior=vetor[0];
            int j=0;
            while(j<vetor.length) {
                if(vetor[j]>maior) {
                    maior = vetor[j];
                }else if(maior==vetor[j]) {
                    contaMaior++;
                }else if (contaMaior==vetor.length) {
                    System.out.println("Não existe maior valor nesse array, pois todos são iguais.");
                    //i++;
                }
                j++;
    
            }
            System.out.println("O maior valor desse array é "+maior+" e sua posição é no "+j+" lugar.");
            System.out.println(" ");
    
        }
    
        //----------8---------------------
        public static void menuOito(int []vetor){
    
            int contaMenor=0;
            int menor=vetor[0];
            int j=0;
            while(j<vetor.length) {
                if(vetor[j]<menor) {
                    menor=vetor[j];
                }else if(menor==vetor[j]) {
                    contaMenor++;
                }else if(contaMenor==vetor.length) {
                    System.out.println("Não existe menor valor nesse array, pois todos são iguais.");
                }
                j++;
    
            }
            System.out.println("O menor valor desse array é "+menor+" e sua posição é no "+j+" lugar.");
            System.out.println(" ");
    
        }
        static int contaBi = 0;
    //----------------------9-----------------------
        public static void menuNove(int []vetor ,  Scanner tec){ //binaria iterativa

            if(ordem!=0){
                System.out.print ("Digite o valor a ser consultado:");
                int x = tec.nextInt();
                int inicio = 0;
                int fim = vetor.length-1;
                int achou =0;
                int ncomparacoes = 0;
                contaBi++;
        
                if (x<vetor[inicio] || x>vetor[fim]){
                    System.out.println("O número " + x + " não encontra-se no vetor.");
                    ncomparacoes++;
                }else{
                    while (inicio <=fim){
                        int meio = (inicio+fim)/2;
                        ncomparacoes++;
                        if (x==vetor[meio]) {
                            System.out.println("O número pesquisado " + x + " encontra-se na posição " + meio+ " do vetor.");
                            achou++;
                            inicio = vetor.length;
                        }
                        else if (x> vetor[meio]){
                            inicio = meio +1;
                        }
                        else if (x< vetor[meio]){
                            fim = meio -1;
        
                        }
                    }
                    if (achou == 0){
                        System.out.println("O número " + x + " não encontra-se no vetor.");
                        ncomparacoes++;
                    }
                }
            }else{
                System.out.println("Esse vetor não está ordenado, digite qualquer opção de Ordenar no Menu!!!");
            }
        }
    static int contaRecursiva = 0;
        static Scanner tec;

        //-------------------ver se está em ordem--------------------------------------
        static int ordem =0;

        //---------------------10----------------------------

    public static void menuDez(int []vetor){

        System.out.println(" ");
        for(int j=0; j<vetor.length; j++) {
            System.out.println(vetor[j]);
        }
        System.out.println(" ");
    }
    //--------------11--------------
    public static void menuOnze (int[]arr) {
        System.out.println("Tivemos " + contaBusca + " buscas sequenciais nesse vetor.");
        System.out.println("Temos " + contaBi + " buscas iterativas nesse vetor." + "\n");
        System.out.println("Temos "+ contaRecursiva+" buscas recursivas nesse vetor."+"\n");

    }

    //-----------0-------------------
    public static void menuSair(){
        System.out.println("Saindo do programa......");

    }

    public static void main(String[] args) {
        Scanner teclado =  new Scanner (System.in);

        
        int[] arr = new int[5];

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
                        menuUmZera(arr);
                        break;
                    }
                }

                if(tecla==2){ //Inserir valor digitado
                    menuDois(arr, teclado);
                }


                if(tecla==3){//inserir valor aleatorio
                    //i++;
                    menuTres(arr);
                }

                if(tecla==4){ //apagar valor
                    //i++;
                    menuQuatro(arr, teclado);
                }

                if(tecla==5){ //Contagem de valores positivos no vetor
                    menuCinco(arr,teclado);
                    int tec=teclado.nextInt();

                    if(tec==9) {
                        //i++;
                        //mf.imprimeMenu();
                    }

                }

                if(tecla==6){// contar valores positivos
                    menuSeis(arr);
                }

                if(tecla==7){//maior valor
                    menuSete(arr);
                }

                if(tecla==8){//menor valor
                    menuOito(arr);
                }
                if(tecla==9){//busca binária iterativa
                    menuNove(arr, teclado);
                }

                if(tecla==10){//Mostrar valores armazenados
                    menuDez(arr);
                }

                if(tecla==11){//Consultar quantas buscas tiveram
                    menuOnze(arr);
                }

                if(tecla==0){ //sair do programa
                    menuSair();
                    break;
                }
            }

        }
    
    }
            
        }
    
