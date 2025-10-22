public class Node {

    //O nó irá armazenar o elemento e o ponteiro para o próximo elemento
    private Elemento elemento;
    private Node proximo;

    public Node(Elemento elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    //getters e setters
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
