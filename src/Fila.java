public class Fila {
    private Node inicio;
    private Node fim;

    public Fila(){
        inicio = null;
        fim = null;
    }

    public boolean vazia(){
        return inicio == null && fim == null;
    }

    public Node getInicio(){
        return inicio;
    }

    public void adicionarCliente(Elemento elemento){
        Node novoNo = new Node(elemento);
        if (vazia()){
            inicio = novoNo;
            fim = novoNo;
        }

        else{
            //ultimo aponta para o nó que foi criado
            fim.setProximo(novoNo);
            //agora o novo nó vai ser o último
            fim = novoNo;

        }
    }

    private Elemento remover(){
        if(vazia()){
            System.out.println("FILA VAZIA!");
            return null;
        }
        Elemento elemento = inicio.getElemento();
        inicio = inicio.getProximo();

        if (inicio == null){
            fim = null;
        }

        return elemento;
    }

    public void atenderCliente(){
        System.out.println("Atender cliente: " + remover());
    }
    public void imprimir(){
        if(vazia()){
            System.out.println("FILA VAZIA!");
            return;
        }
        Node atual = inicio;
        while(atual != null){
            System.out.println("[ " + atual.getElemento() + " ]");
            if(atual.getProximo() != null){
                System.out.println("->");
            }
            atual = atual.getProximo();
        }
    }
}
