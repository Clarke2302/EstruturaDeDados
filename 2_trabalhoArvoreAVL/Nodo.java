public class Nodo {
        private int valor;
        private Nodo direita;
        private Nodo esquerda;
    
        public Nodo(int valor) {
            this.valor = valor;
            direita = null;
            esquerda = null;
        }
    
        public int getValor() {
            return valor;
        }
    
        public void setValor(int valor) {
            this.valor = valor;
        }
    
        public Nodo getDireita() {
            return direita;
        }
    
        public void setDireita(Nodo direita) {
            this.direita = direita;
        }
    
        public Nodo getEsquerda() {
            return esquerda;
        }
    
        public void setEsquerda(Nodo esquerda) {
            this.esquerda = esquerda;
        }
    }
    