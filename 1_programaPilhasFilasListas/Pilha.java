class Pilha {
    Nodo topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (topo == null) {
            topo = novoNodo;
        } else {
            novoNodo.proximo = topo;
            topo = novoNodo;
        }
    }

    public void pop() {
        if (topo != null) {
            topo = topo.proximo;
        }
    }
}