package testes;
import java.util.Random;
import java.util.Scanner;
public class sort { //funções ordenar
    
    public void menuOito(int [] vetor){ //mostrar valores

        System.out.println(" ");
        for(int j=0; j<vetor.length; j++) {
            System.out.println(vetor[j]);
        }
        System.out.println(" ");


    }
    //---------------2----------------------------------
    public static void inserirValores(int [] vetor, Scanner nome){
        System.out.println("Digite um valor:");
        for(int i=0; i<vetor.length; i++){
            if(vetor[i]==0) { //se houver ZERO no vetor é considerando vazio
                
                vetor[i] = nome.nextInt();
            }
        }
    }
//--------------------3----------------------------------
    // inserir conteúdo no vetor a partir da geração de valores aleatórios - NÃO ORDENADOS.
    public static void inserirAleatorios(int [] vetor) {
        Random aleatorio = new Random();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                vetor[i] = aleatorio.nextInt();
            }
        }
    }
//-------------------ver se está em ordem--------------------------------------
    static int ordem =0;
    public static void ordenado(){

        if(ordem == 0){
            System.out.println("O vetor não está ordenado!!!");
        }else{
            System.out.println("O vetor está em ordem, pode continuar a busca!");
        }
    }

    //----------------------9------------------------
    public static void ordenarBubble(int[]vetor){
        
        //int temp = 0; //variavel temporaria
        boolean swappedSomething = true;

        while(swappedSomething){
            swappedSomething = false;
            for(int i=1; i<vetor.length-1; i++){
                
                if(vetor[i]>vetor[i+1]){ //Se o vetor[1] é maior que o vetor[2]
                    //trocar elementos de lugar
                    swappedSomething=true;
                    int temp = 0;
                    temp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] =temp;
                }
                
                if(vetor[vetor.length-2]>vetor[vetor.length-1]){ //Se o vetor[4] é maior que o vetor[5] //ex: 6 // 6 & 3
                    
                    //trocar elementos de lugar
                    int temp = 0;

                    temp = vetor[vetor.length-2]; //tempo = vetor[4] 6
                    vetor[vetor.length-2]=vetor[vetor.length-1]; //vetor[4] = vetor[5] 3
                    vetor[vetor.length-1]=temp; //vetor[5] = tempo  3 & 6

                }
            }
        }
        ordem++;
        }
        
    
//-------------------------10-------------------------
    public static void ordenarSelection(int [] vetor){ //funcionando
        int tamanho = vetor.length;
        for(int i=0; i<tamanho-1; i++){

            int minimo = vetor[i];
            int indice = i;
            for(int j=i+1; j<tamanho;j++){
                if(vetor[j]<minimo){
                    minimo= vetor[j];
                    indice = j;
                }
            }
            swapSelection(vetor,i,indice);
            
        }
        ordem++;
    }

    private static void swapSelection(int[] vetor, int a, int b) {
        int temp = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = temp;
    }
//-----------------------11------------------------------------
    public static void ordenarInsertion(int[]vetor){ //funcionando
        for(int j=1;j<vetor.length;j++){
            int chave = vetor[j];
            int i= j-1;
            while((i>-1)&&(vetor[i]>chave)){
                vetor[i+1]=vetor[i];
                i--;
            }
            vetor[i+1]=chave;
        }
        ordem++;
    }

//----------------------------12------------------------------------
    public static void ordenarQuick(int[]vetor, int inicio, int fim){ //funcionando
        if(inicio >= fim){
            return;
        }

        int pivot = vetor[fim];

        int leftPointer = inicio;
        int rightPointer = fim;

        while(leftPointer<rightPointer){
            while(vetor[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(vetor[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swapQuick(vetor, leftPointer, rightPointer);
        }
        swapQuick(vetor, leftPointer, fim);

        ordenarQuick(vetor, inicio, leftPointer-1);
        ordenarQuick(vetor, leftPointer+1, fim);

    }

    public static void swapQuick(int [] vetor, int indice1, int indice2){
        int temp = vetor[indice1];
        vetor[indice1] = vetor[indice2];
        vetor[indice2]=temp;
    }
//--------------------------------------------------------------------------


        
    }
