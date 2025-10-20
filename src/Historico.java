public class Historico extends Elemento{
    private String id;
    private String descricao;
    private  String dataHora;

    public Historico(String id, String descricao, String dataHora){
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    public  String getId(){
        return id;
    }

    public void setId(String id){
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

    @Override
    public String toString(){
        return this.getId() + " - " + this.getDescricao() + " - " + this.getDescricao();
    }

}
