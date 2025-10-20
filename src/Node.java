public class Node {
    private Elemento elemento;
    private Node proximo;

    public Node(Elemento elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Elemento getElemento(){
        return elemento;
    }

    public void setElemento(Elemento elemento){
        this.elemento = elemento;
    }

    public Node getProximo(){
        return proximo;
    }

    public void setProximo(Node proximo){
        this.proximo = proximo;
    }
}
