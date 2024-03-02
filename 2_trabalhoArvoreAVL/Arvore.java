public class Arvore {

    private Nodo raiz;

    public Arvore() { //construtor
        raiz = null;
    }

    public void limparArvore() { //limpar numeros da arvore
        raiz = null;
    }

    public Nodo getRaiz() { //pegar raiz
        return raiz;
    }

    //Método Adicionar

    public boolean adicionar(int valor) { //adicionar valor à raiz
        if (!contem(valor)) {
            raiz = adicionar(valor, raiz);
            return true;
        }
        return false;
    }

    private Nodo adicionar(int valor, Nodo nodoAtual) {
        if (nodoAtual == null) {
            return new Nodo(valor);
        }

        if (valor < nodoAtual.getValor()) {
            nodoAtual.setEsquerda(adicionar(valor, nodoAtual.getEsquerda()));
        } else if (valor > nodoAtual.getValor()) {
            nodoAtual.setDireita(adicionar(valor, nodoAtual.getDireita()));
        }

        return nodoAtual;
    }

    //Método Remover

    public boolean remover(int valor) {
        if (contem(valor)) {
            raiz = remover(valor, raiz);
            return true;
        }
        return false;
    }

    private Nodo remover(int valor, Nodo nodoAtual) {
        if (nodoAtual == null) {
            return null;
        }

        if (valor < nodoAtual.getValor()) {
            nodoAtual.setEsquerda(remover(valor, nodoAtual.getEsquerda()));
        } else if (valor > nodoAtual.getValor()) {
            nodoAtual.setDireita(remover(valor, nodoAtual.getDireita()));
        } else {
            if (nodoAtual.getEsquerda() == null) {
                return nodoAtual.getDireita();
            } else if (nodoAtual.getDireita() == null) {
                return nodoAtual.getEsquerda();
            }

            nodoAtual.setValor(encontrarMenorValor(nodoAtual.getDireita()));
            nodoAtual.setDireita(remover(nodoAtual.getValor(), nodoAtual.getDireita()));
        }

        return nodoAtual;
    }

    private int encontrarMenorValor(Nodo nodoAtual) {
        return nodoAtual.getEsquerda() == null ? nodoAtual.getValor() : encontrarMenorValor(nodoAtual.getEsquerda());
    }

    //Método Contém

    public boolean contem(int valor) { //ver se numero contém na árvore
        return contem(valor, raiz);
    }

    private boolean contem(int valor, Nodo nodoAtual) {
        if (nodoAtual == null) {
            return false;
        }

        if (valor == nodoAtual.getValor()) {
            return true;
        } else if (valor < nodoAtual.getValor()) {
            return contem(valor, nodoAtual.getEsquerda());
        } else {
            return contem(valor, nodoAtual.getDireita());
        }
    }

    public void mostrarEmOrdem(Nodo nodoAtual) { //mostrando valores em orSdem
        if (nodoAtual != null) {
            mostrarEmOrdem(nodoAtual.getEsquerda());
            System.out.print(nodoAtual.getValor() + " ");
            mostrarEmOrdem(nodoAtual.getDireita());
        }
    }

}