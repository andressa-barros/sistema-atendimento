public class Fila {
    //Implementação da Fila (FIFO) → o primeiro cliente a chegar é o primeiro a ser atendido

    //aponta para o primeiro da fila
    private Node inicio;
    //aponta para o último da fila
    private Node fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public boolean vazia() {
        return inicio == null && fim == null;
    }

    //método para adicionar novo cliente no fim na fila
    public void adicionarCliente(Elemento elemento) {
        Node novoNo = new Node(elemento);
        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    //método de remover - remove o primeiro
    private Elemento remover() {
        if (vazia()) {
            System.out.println("FILA VAZIA!");
            return null;
        }

        Elemento elemento = inicio.getElemento();
        inicio = inicio.getProximo();

        if (inicio == null) {
            fim = null;
        }

        return elemento;
    }

    //método de atender o cliente - utiliza o método de remover - irá atender o primeiro da fila
    public void atenderCliente() {
        Elemento atendido = remover();
        if (atendido != null) {
            System.out.println("Cliente atendido: " + atendido);
        }
    }

    //imprime a fila
    public void imprimir() {
        if (vazia()) {
            System.out.println("FILA VAZIA!");
            return;
        }

        Node atual = inicio;
        while (atual != null) {
            System.out.println("[ " + atual.getElemento() + " ]");
            if (atual.getProximo() != null) {
                System.out.println("->");
            }
            atual = atual.getProximo();
        }
    }
}
