import java.util.Scanner;
public class menuRodar {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner (System.in);

        menuFuncoes mf = new menuFuncoes();

        System.out.println("====================================================================================");
        System.out.println("Digite um número de 1 a 8 para iniciar o sistema,"+"\n"+"ou 0 para sair do sistema!"+"\n");
        int tecla = teclado.nextInt();

        int i = 0;
        while(tecla!=0){
            System.out.println("Iniciando o sistema....."+"\n");
            while(i<10){

                mf.imprimeMenu();
                tecla = teclado.nextInt();
                System.out.println(" ");

                // criar vetor
                if(tecla==1){
                    mf.menuUm();
                    int tec = teclado.nextInt();


                    if(tec==9){ //Voltar ao menu
                        mf.imprimeMenu();
                        //i++;

                    }

                    if(tec==2){ //zerar TUDO
                        //i++;
                        mf.menuUmZera();

                    }
                }

                if(tecla==2){ //Inserir valor
                    //i++;
                    mf.menuDois();


                }


                if(tecla==3){//apagar um valor do vetor
                    //i++;
                    mf.menuTres();



                }

                if(tecla==4){ //consultar valor
                    //i++;
                    mf.menuQuatro();

                }

                if(tecla==5){ //Contagem de valores positivos no vetor
                    mf.menuCinco();
                    int tec=teclado.nextInt();

                    if(tec==9) {
                        //i++;
                        //mf.imprimeMenu();
                    }

                }

                if(tecla==6){ //Maior valor e posição
                    mf.menuSeis();
                }

                if(tecla==7){ //Menor valor e posição
                    mf.menuSete();
                }

                if(tecla==8){ //mostrar todos os valores armazenados no vetor
                    mf.menuOito();
                }
                if(tecla==0){ //sair do programa
                    mf.menuSair();
                    break;
                }
            }

        }
    }
}



