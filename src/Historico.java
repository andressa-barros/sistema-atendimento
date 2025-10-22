public class Historico extends Elemento {
    //Classe que será usada na pilha, que representa a solicitação de serviço

    private String id;
    private String descricao;
    private String dataHora;

    //construtor
    public Historico(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
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

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    //O método toString() formata o texto mostrado na tela
    @Override
    public String toString() {
        return this.id + " - " + this.descricao + " - " + this.dataHora;
    }
}
