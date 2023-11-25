class No {
    int valor;
    No esquerda, direita;

    public No(int item) {
        valor = item;
        esquerda = direita = null;
    }
}

public class Main {
    No raiz;

    public Main() {
        raiz = null;
    }

    private No inserir(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserir(no.direita, valor);
        }

        return no;
    }

    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    
    private void percorrerEmOrdem(No no) {
        if (no != null) {
            percorrerEmOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            percorrerEmOrdem(no.direita);
        }
    }
  
    public void percorrerEmOrdem() {
        percorrerEmOrdem(raiz);
    }

    public static void main(String[] args) {
        Main arvore = new Main();

        
        int[] valores = {94,102,50,3,32,98,500,0,2};
        for (int valor : valores) {
            arvore.inserir(valor);
        }
       
        System.out.println("Percorrendo a árvore em ordem:");
        arvore.percorrerEmOrdem();
    }
}
