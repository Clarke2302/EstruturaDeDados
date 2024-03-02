class Fila {
    Nodo frente, tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    public void enqueue(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (tras == null) {
            frente = tras = novoNodo;
        } else {
            tras.proximo = novoNodo;
            tras = novoNodo;
        }
    }

    public void dequeue() {
        if (frente != null) {
            frente = frente.proximo;
            if (frente == null) {
                tras = null;
            }
        }
    }
}