public class Elemento {
    //Classe base genérica, usada como tipo para armazenar informações nas duas estruturas (fila e pilha)

    //id - identifica o elemento (cliente ou solicitação)
    private String id;
    //descricao - informações adicionais
    private String descricao;


    //Este construtor ajuda a permitir herança da classe Elemento para ser usada por outras classes
    public Elemento() {
    }

    //Cria o objeto com os dados direto
    public Elemento(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }


    //getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
