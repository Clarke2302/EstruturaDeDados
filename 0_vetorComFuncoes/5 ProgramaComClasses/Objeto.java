import java.util.Random;
import java.util.Scanner;


public class Objeto{


    static int [] arr = new int[5]; //criando array

    public Objeto(){

    }


    //Métodos

    //-------------------ver se está em ordem--------------------------------------
    int ordem =0;


    //---------------2----------------------------------
    public void menuDois( Scanner nome){
        System.out.println("Digite um valor:");
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) { //se houver ZERO no arr é considerando vazio

                arr[i] = nome.nextInt();
            }
        }
        System.out.println("A Array foi preenchida!");
    }
    //--------------------3----------------------------------
    // inserir conteúdo no arr a partir da geração de valores aleatórios - NÃO ORDENADOS.

    public  void menuTres() {
        Random aleatorio = new Random();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = aleatorio.nextInt(1,10000);
            }
        }
        System.out.println("A Array foi preenchida!");
    }
    //-------------------------4------------------------------------
    public  void menuQuatro(Scanner teclado){
        System.out.printf("Qual valor deseja apagar? ");
        int apagaValor=teclado.nextInt();
        int apagar=0;
        int pos = -1;

        for(int j=0; j<arr.length; j++){
            if(apagaValor==arr[j]){
                arr[j]=0;
                apagar++;
                pos=j;
            }
        }
        if(apagar!=0){
            System.out.println("Apagamos o valor na posição "+pos);
        }else{
            System.out.println("Esse valor não existe na array! ");
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

    public  void menuCinco(Scanner teclado){
        int j=0;
        int pos=-1;
        int anotar=0;
        System.out.print("Qual valor deseja consultar? ");
        int consultaValor=teclado.nextInt();


        for(j=0;j<arr.length; j++){

            if(consultaValor==arr[j]){
                anotar++;
                pos=j;
            }
        }
        if(anotar!=0){
            System.out.println("\n"+"Esse valor está na posição "+pos+" da array."+"\n");
            System.out.println("Volte ao menu, digite 9: ");
        }else{
            System.out.println("\n"+"Esse valor não existe na array!"+"\n");
            System.out.println("Volte ao menu, digite 9: ");
        }
        int tecll = teclado.nextInt();

        if(tecll == 9){
        contaBusca++;
        }
    }

    //-----------6----------------------
    public  void menuSeis(){
        int contaVazios = 0;
        int conta=0;
        for(int j=0; j<arr.length; j++) {

            if(arr[j]>0) {
                conta++;
            }
            if (arr[j] == 0) {
                contaVazios++;
            }
        }
        System.out.println(" ");
        System.out.println("Temos "+conta+" valores válidos nesse array.");
        System.out.println("Temos " + contaVazios + " números vazios válidos nesse array.");
        System.out.println(" ");
        System.out.println("Ir para o menu, Digite: 9 ");


    }


    //-----------7---------------------
    public  void menuSete(){

        int contaMaior=0;
        int maior=arr[0];
        int j=0;
        while(j<arr.length) {
            if(arr[j]>maior) {
                maior = arr[j];
            }else if(maior==arr[j]) {
                contaMaior++;
            }else if (contaMaior==arr.length) {
                System.out.println("Não existe maior valor nesse array, pois todos são iguais.");
                //i++;
            }
            j++;

        }
        System.out.println("O maior valor desse array é "+maior+" e sua posição é no "+j+" lugar.");
        System.out.println(" ");

    }

    //----------8---------------------
    public  void menuOito(){

        int contaMenor=0;
        int menor=arr[0];
        int j=0;
        while(j<arr.length) {
            if(arr[j]<menor) {
                menor=arr[j];
            }else if(menor==arr[j]) {
                contaMenor++;
            }else if(contaMenor==arr.length) {
                System.out.println("Não existe menor valor nesse array, pois todos são iguais.");
            }
            j++;

        }
        System.out.println("O menor valor desse array é "+menor+" e sua posição é no "+j+" lugar.");
        System.out.println(" ");

    }
    static int contaBi = 0;
    //----------------------9-----------------------
    public  void menuNove(Scanner tec){ //binaria iterativa

        if(ordem!=0){
            System.out.print ("Digite o valor a ser consultado:");
            int x = tec.nextInt();
            int inicio = 0;
            int fim = arr.length-1;
            int achou =0;
            int ncomparacoes = 0;
            contaBi++;

            if (x<arr[inicio] || x>arr[fim]){
                System.out.println("O número " + x + " não encontra-se na array.");
                ncomparacoes++;
            }else{
                while (inicio <=fim){
                    int meio = (inicio+fim)/2;
                    ncomparacoes++;
                    if (x==arr[meio]) {
                        System.out.println("O número pesquisado " + x + " encontra-se na posição " + meio+ " da array.");
                        achou++;
                        inicio = arr.length;
                    }
                    else if (x> arr[meio]){
                        inicio = meio +1;
                    }
                    else if (x< arr[meio]){
                        fim = meio -1;

                    }
                }
                if (achou == 0){
                    System.out.println("O número " + x + " não encontra-se na array.");
                    ncomparacoes++;
                }
            }
        }else{
            System.out.println("Essa Array não está ordenada, digite qualquer opção de Ordenar no Menu!!!");
        }
    }
    static int contaRecursiva = 0;
    static Scanner tec;


    //---------------------10----------------------------

    public int menuDez( int inicio, int fim, int valor) { //binaria recursiva


        int meio = (inicio + fim) / 2; //calcula o meio
        int naoAchou = 0;

        contaRecursiva++;
        if (valor == arr[meio]) {//o elemento foi encontrado
            return meio;
        }
        if (valor > arr[meio] && valor <= arr[fim]) {

            inicio = meio + 1;//a busca continuará no subarray à direira
        }

        if (valor < arr[meio]) {
            fim = meio - 1;//a busca continuará no subarray à esquerda

        }
        if (inicio > fim) {
            return -1;
        } else {
            return menuDez( inicio, fim, valor);
        }

    }





    //----------------------11------------------------
    public void ordenarBubble(){

        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j< arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) { //Se o arr[1] é maior que o arr[2]
                    //trocar elementos de lugar

                    int temp =  arr[j]; //variavel temporaria
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        ordem++;
    }


    //-------------------------12-------------------------
    public void ordenarSelection(){ //funcionando
        int tamanho = arr.length;
        for(int i=0; i<tamanho-1; i++){

            int minimo = arr[i];
            int indice = i;
            for(int j=i+1; j<tamanho;j++){
                if(arr[j]<minimo){
                    minimo= arr[j];
                    indice = j;
                }
            }
            swapSelection(arr,i,indice);

        }
        ordem++;
    }

    private void swapSelection(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //-----------------------13------------------------------------
    public void ordenarInsertion(){ //funcionando
        for(int j=1;j<arr.length;j++){
            int chave = arr[j];
            int i= j-1;
            while((i>-1)&&(arr[i]>chave)){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=chave;
        }
        ordem++;
    }

    //----------------------------14------------------------------------
    public void ordenarQuick( int inicio, int fim){ //funcionando
        if(inicio >= fim){
            return;
        }

        int pivot = arr[fim];

        int leftPointer = inicio;
        int rightPointer = fim;

        while(leftPointer<rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swapQuick( leftPointer, rightPointer);
        }
        swapQuick( leftPointer, fim);

        ordenarQuick( inicio, leftPointer-1);
        ordenarQuick( leftPointer+1, fim);

    }

    public void swapQuick( int indice1, int indice2){
        int temp = arr[indice1];
        arr[indice1] = arr[indice2];
        arr[indice2]=temp;
    }
    //-----------15--------------------
    public void menuQuinze(){

        System.out.println(" ");
        for(int j=0; j<arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println(" ");
    }
    //--------------16--------------
    public void menuDezesseis () {
        System.out.println("Tivemos " + contaBusca + " buscas sequenciais nesse array.");
        System.out.println("Temos " + contaBi + " buscas iterativas nesse array." + "\n");
        System.out.println("Temos "+ contaRecursiva+" buscas recursivas nesse array."+"\n");

    }

    //-----------0-------------------
    public void menuSair(){
        System.out.println("Saindo do programa......");

    }

}
