public class menuFuncoes {


    public void imprimeMenu(){ //Imprime o menu e Voltar ao menu
        System.out.println("-------Menu--------");
        System.out.println("Para criar um vetor vazio, digite: 1");
        System.out.println("Inserir valor no vetor, digite: 2");
        System.out.println("Apagar um valor do vetor, digite: 3");
        System.out.println("Consultar valor, digite: 4");
        System.out.println("Contar valores positivos no vetor, digite: 5");
        System.out.println("Qual o maior valor, digite: 6");
        System.out.println("Qual o menor valor, digite: 7");
        System.out.println("Mostrar todos os valores armazenados, digite: 8");
        System.out.println("Sair do programa, digite: 0");
        System.out.println(" ");
        System.out.printf("Digite: ");


    }
    //-----------1----------------

    public void menuUm(){  // criar vetor
        System.out.println(" ");
        System.out.println("Criamos um vetor vazio");
        System.out.println(" ");
        System.out.println("Deseja zerar o vetor, digite: 2");
        System.out.println("Voltar ao menu, digite: 9");
        System.out.println(" ");
        System.out.printf("Digite: ");

    }

    public void menuUmZera(){//zerar TUDO
        for(int j=0; j<array.length; j++ ){
            array[j]=0;
        }
        System.out.println(" ");
        System.out.println("Zeramos o vetor");
        System.out.println(" ");
        System.out.println(" ");

    }
    //------------2----------------

    public void menuDois(){ //Inserir valor
        int j=0;
        while(j<array.length){
            System.out.printf("Qual será o valor ? ");
            int insereValor=teclado.nextInt();

            if(array[j]==0){
                array[j]=insereValor;

                System.out.println(" ");
                System.out.println("Inserir outro valor, Digite: 3");
                System.out.println("Voltar para o menu, Digite: 9");
                System.out.println(" ");
                int tec=teclado.nextInt();

                if(tec==3) {//adicionar outro valor
                    j++;
                }
                if(tec==9){ //voltar ao menu
                    break;

                }

            }
        }
    }
    //------------3-----------------

    public void menuTres(){
        System.out.printf("Qual valor deseja apagar? ");
        int apagaValor=teclado.nextInt();
        int apagar=0;
        int pos = -1;

        for(int j=0; j<array.length; j++){
            if(apagaValor==array[j]){
                array[j]=0;
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

    //------------4----------------

    public void menuQuatro(){
        int j=0;
        int pos=-1;
        int anotar=0;
        System.out.print("Qual valor deseja consultar? ");
        int consultaValor=teclado.nextInt();


        for(j=0;j<array.length; j++){

            if(consultaValor==array[j]){
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
        //imprimeMenu();
    }

    //-----------5----------------------
    public void menuCinco(){

        int conta=0;
        for(int j=0; j<array.length; j++) {

            if(array[j]>0) {
                conta++;
            }
        }
        System.out.println(" ");
        System.out.println("Temos "+conta+" valores válidos nesse vetor.");
        System.out.println(" ");
        System.out.println("Ir para o menu, Digite: 9 ");


    }

    //-----------6---------------------
    public void menuSeis(){

        int contaMaior=0;
        int maior=array[0];
        int j=0;
        while(j<array.length) {
            if(array[j]>maior) {
                maior = array[j];
            }else if(maior==array[j]) {
                contaMaior++;
            }else if (contaMaior==array.length) {
                System.out.println("Não existe maior valor nesse array, pois todos são iguais.");
                //i++;
            }
            j++;

        }
        System.out.println("O maior valor desse array é "+maior+" e sua posição é no "+j+" lugar.");
        System.out.println(" ");

    }

    //----------7---------------------
    public void menuSete(){

        int contaMenor=0;
        int menor=array[0];
        int j=0;
        while(j<array.length) {
            if(array[j]<menor) {
                menor=array[j];
            }else if(menor==array[j]) {
                contaMenor++;
            }else if(contaMenor==array.length) {
                System.out.println("Não existe menor valor nesse array, pois todos são iguais.");
            }
            j++;

        }
        System.out.println("O menor valor desse array é "+menor+" e sua posição é no "+j+" lugar.");
        System.out.println(" ");

    }
    //-----------8--------------------
    public void menuOito(){

        System.out.println(" ");
        for(int j=0; j<array.length; j++) {
            System.out.println(array[j]);
        }
        System.out.println(" ");


    }

    //-----------0-------------------
    public void menuSair(){
        System.out.println("Saindo do programa......");

    }


}

