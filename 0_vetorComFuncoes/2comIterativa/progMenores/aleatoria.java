import java.util.Random;
public class aleatoria {
public static void main(String[] args) {
      Random rd = new Random(); // criando um objeto aleatorio
    int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
        
        int number = rd.nextInt(10000);
            if(number>0){
        arr[i] = number + 1; // colocando os numeros randoms na array
            }
        System.out.println("\n"+arr[i]+"\n"); // printando cada elemento da array
        }
    }
}
