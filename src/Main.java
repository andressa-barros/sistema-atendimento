public class Main {
    public static void main(String[] args) {

        //Cria uma pilha
        Pilha pilha = new Pilha();
        //método para preencher a pilha com varias solicitações
        preencherPilha(pilha);

        //Exibe a pilha de solicitações
        System.out.println("-------------------------");
        System.out.println("HISTÓRICO DE SOLICITAÇÕES");
        System.out.println("-------------------------");
        pilha.imprime();

        //Remove a solicitação mais recente
        System.out.println("\nRemovendo a solicitação mais recente...");
        pilha.remove();

        //Exibe a pilha de solicitações novamente após a remoção da solicitação
        System.out.println("\nPilha atualizada:");
        pilha.imprime();

        //Insere nova solicitação na pilha de solicitações e imprime novamente a pilha de solicitações
        System.out.println("\nInserindo nova solicitação...");
        pilha.insere(new Historico("REQ011", "Troca de equipamento", "2025-06-23 14:30"));
        pilha.imprime();

        //Cria uma fila
        Fila fila = new Fila();
        //Método para preencher a fila com vários clientes
        preencherFila(fila);

        //Exibe a fila de clientes
        System.out.println("\n-------------------------");
        System.out.println("FILA DE ATENDIMENTOS");
        System.out.println("-------------------------");
        fila.imprimir();

        //Atende os dois primeiros clientes da fila
        System.out.println("\nAtendendo os primeiros clientes...");
        fila.atenderCliente();
        fila.atenderCliente();

        //Exibe novamente a fila após os atendimentos
        System.out.println("\nFila atualizada:");
        fila.imprimir();

        //Adicionando dois novos clientes no final da fila
        System.out.println("\nAdicionando novos clientes...");
        fila.adicionarCliente(new Atendimento("CLI011", "Andressa Barros", "Cancelamento do pedido"));
        fila.adicionarCliente(new Atendimento("CLI012", "José Silva", "Renovação de assinatura"));

        //Exibe novamente a fila após a adição dos novos clientes
        System.out.println("\nNova fila:");
        fila.imprimir();
    }

    // Métodos de preenchimento
    public static void preencherFila(Fila f) {
        f.adicionarCliente(new Atendimento("CLI013", "Maria Oliveira", "Solicitação de segunda via de fatura"));
        f.adicionarCliente(new Atendimento("CLI014", "Carlos Souza", "Atualização de endereço"));
        f.adicionarCliente(new Atendimento("CLI015", "Ana Pereira", "Cancelamento de serviço"));
        f.adicionarCliente(new Atendimento("CLI016", "Ricardo Lima", "Reclamação sobre cobrança indevida"));
    }

    public static void preencherPilha(Pilha p) {
        p.insere(new Historico("REQ012", "Instalação de novo roteador", "2025-06-24 09:15"));
        p.insere(new Historico("REQ013", "Atualização de firmware", "2025-06-25 10:45"));
        p.insere(new Historico("REQ014", "Reparo em cabo de rede", "2025-06-26 13:20"));
        p.insere(new Historico("REQ015", "Substituição de modem", "2025-06-27 16:10"));
    }
}
