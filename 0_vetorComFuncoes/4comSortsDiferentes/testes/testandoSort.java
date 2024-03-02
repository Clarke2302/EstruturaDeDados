package testes;
import java.util.Scanner;
public class testandoSort {
    public static void main(String[] args) {
        
        sort m1 = new sort();

        Scanner tec = new Scanner(System.in);

        int [] array = new int [6];

        m1.inserirValores(array,tec ); //inserindo val na array
        
        System.out.println("antes de ordenar");
        m1.menuOito(array); //mostrar antes de ordenar
        
        
        

        System.out.println("depois de ordenar");

        //m1.ordenarBubble(array);
        

        m1.menuOito(array); //mostrando depois de ordenar
        

        
        
    }
    
}
