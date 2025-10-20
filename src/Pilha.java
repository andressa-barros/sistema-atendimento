public class Pilha {
    private Node topo;

    public Pilha() {
        topo = null;
    }

    public boolean vazia(){
        return topo == null;
    }

    public void insere(Elemento elemento){
        //criamos o novo nó
        Node novoNo = new Node(elemento);

        //Se a lista estiver vazia insere o novo nó
        if (vazia()){
            topo = novoNo;
        }

        else{
            //pegamos o primeiro no atual = topo
            Node primeiro = topo;
            //definimos o proximo do no novo nó como o antigo topo
            novoNo.setProximo(primeiro);
            //definimos o novo topo sendo o novo nó criado
            topo = novoNo;
        }
    }

    public void remove(){
        if(vazia()){
            System.out.println("PILHA VAZIA!");
            return ;
        }
        //Pega o proximo no
        Node proximo = topo.getProximo();

        //Só um print pra mostrar o valor que foi removido
        System.out.println("Valor removido: " + topo.getElemento());

        //Removemos o valor definido o novo topo
        topo = proximo;
    }

    public void imprime(){
        if(vazia()){
            System.out.println("PILHA VAZIA!");
            return ;
        }
        Node atual = topo;
        while(atual != null){
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }




}
