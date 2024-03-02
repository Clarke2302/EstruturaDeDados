class Lista {
    Nodo inicio, fim;

    public Lista() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserirInicio(int valor) {
        Nodo novoNo = new Nodo(valor);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirFim(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (fim == null) {
            inicio = fim = novoNodo;
        } else {
            novoNodo.anterior = fim;
            fim.proximo = novoNodo;
            fim = novoNodo;
        }
    }
}