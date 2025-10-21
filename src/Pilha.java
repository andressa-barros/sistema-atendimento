public class Pilha {

    private Node topo;

    public Pilha() {
        topo = null;
    }

    public boolean vazia() {
        return topo == null;
    }

    //método de inserção no topo da pilha - LIFO
    public void insere(Elemento elemento) {

        //cria um novo nó com o novo elemento
        Node novoNo = new Node(elemento);

        if (vazia()) {
            topo = novoNo;
        } else {
            //se a pilha não estiver vazia o novo nó será o novo topo da pilha
            novoNo.setProximo(topo);
            topo = novoNo;
        }
    }

    //método de remoção da pilha - remove sempre o que está no topo - LIFO
    public void remove() {
        if (vazia()) {
            System.out.println("PILHA VAZIA!");
            return;
        }

        //parte que remove
        Elemento removido = topo.getElemento();
        topo = topo.getProximo();

        System.out.println("Solicitação removida: " + removido);
    }

    //método de impressão da pilha
    public void imprime() {
        if (vazia()) {
            System.out.println("PILHA VAZIA!");
            return;
        }

        Node atual = topo;
        while (atual != null) {
            System.out.println("[ " + atual.getElemento() + " ]");
            if (atual.getProximo() != null) {
                System.out.println("↓");
            }
            atual = atual.getProximo();
        }
    }
}
