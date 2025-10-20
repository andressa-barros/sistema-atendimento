public class Atendimento extends Elemento{
    private String id;
    private String cliente;
    private String descricaoAtendimento;

    public Atendimento(String id, String cliente, String descricaoAtendimento){
        this.id = id;
        this.cliente = cliente;
        this.descricaoAtendimento = descricaoAtendimento;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescricaoAtendimento() {
        return descricaoAtendimento;
    }

    public void setDescricaoAtendimento(String descricaoAtendimento) {
        this.descricaoAtendimento = descricaoAtendimento;
    }

    @Override
    public String toString(){
        return this.getId() + " - " + this.getCliente() + " - " + this.getDescricaoAtendimento();
    }
}
