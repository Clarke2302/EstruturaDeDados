import java.util.Scanner;
public class bi {


    public static void buscaIterativa (int []vetor ,  Scanner tec) {
        System.out.print ("Digite o valor a ser consultado:");
        int x = tec.nextInt();
        int inicio = 0;
        int fim = vetor.length-1;
        int achou =0;
        int ncomparacoes = 0;

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
    }
    

    
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);

        int arr [] = {1,7,9,4,3,2,8};

        buscaIterativa(arr, teclado);
        

    }
}

