public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        preencherPilha(pilha);

        System.out.println("-------------------------");
        System.out.println("Histórico de Solicitações");
        System.out.println("-------------------------");
        pilha.imprime();

        System.out.println("\nRemoção de solicitações da pilha...");
        System.out.println("Solicitação removida: ");
        pilha.remove();
        System.out.println("\nPilha atualizada...");
        pilha.imprime();

        System.out.println("\nInserindo nova solicitação...");
        pilha.insere(new Historico( "REQ011", "Troca de equipamento", "2025-06-23 14:30"));
        pilha.imprime();

        Fila fila = new Fila();
        preencherFila(fila);
        System.out.println("\n-------------------------");
        System.out.println("Fila de Atendimentos");
        System.out.println("-------------------------");
        fila.imprimir();

        System.out.println("\nAtendendo clientes...\n");
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();

        System.out.println("\nFila atualizada...\n");
        fila.imprimir();
        System.out.println("\nAdicionando clientes na fila...\n");

        fila.adicionarCliente(new Atendimento("CLI011", "Andressa Barros", "Cancelamento do pedido"));
        fila.adicionarCliente(new Atendimento("CLI012", "José Silva", "Renovação de assinatura"));

        System.out.println("\nNova Fila...\n");
        fila.imprimir();


    }

    public static void preencherFila(Fila f){
        f.adicionarCliente(new Atendimento("CLI013", "Maria Oliveira", "Solicitação de segunda via de fatura"));
        f.adicionarCliente(new Atendimento("CLI014", "Carlos Souza", "Atualização de endereço"));
        f.adicionarCliente(new Atendimento("CLI015", "Ana Pereira", "Cancelamento de serviço"));
        f.adicionarCliente(new Atendimento("CLI016", "Ricardo Lima", "Reclamação sobre cobrança indevida"));
        f.adicionarCliente(new Atendimento("CLI017", "Fernanda Costa", "Dúvida sobre plano contratado"));
        f.adicionarCliente(new Atendimento("CLI018", "João Santos", "Alteração de titularidade"));
        f.adicionarCliente(new Atendimento("CLI019", "Patrícia Almeida", "Solicitação de visita técnica"));
        f.adicionarCliente(new Atendimento("CLI020", "Rafael Gomes", "Renovação de contrato corporativo"));
        f.adicionarCliente(new Atendimento("CLI021", "Camila Fernandes", "Pedido de upgrade de plano"));
        f.adicionarCliente(new Atendimento("CLI022", "Bruno Rocha", "Problema de conexão"));
        f.adicionarCliente(new Atendimento("CLI023", "Juliana Martins", "Solicitação de desbloqueio de conta"));
        f.adicionarCliente(new Atendimento("CLI024", "André Ribeiro", "Consulta sobre histórico de pagamentos"));
        f.adicionarCliente(new Atendimento("CLI025", "Larissa Nogueira", "Agendamento de instalação"));
        f.adicionarCliente(new Atendimento("CLI026", "Gustavo Carvalho", "Alteração de forma de pagamento"));
        f.adicionarCliente(new Atendimento("CLI027", "Beatriz Mendes", "Solicitação de cancelamento por mudança de endereço"));

    }

    public static void preencherPilha(Pilha p){
        p.insere(new Historico("REQ012", "Instalação de novo roteador", "2025-06-24 09:15"));
        p.insere(new Historico("REQ013", "Atualização de firmware", "2025-06-25 10:45"));
        p.insere(new Historico("REQ014", "Reparo em cabo de rede", "2025-06-26 13:20"));
        p.insere(new Historico("REQ015", "Substituição de modem", "2025-06-27 16:10"));
        p.insere(new Historico("REQ016", "Teste de velocidade de conexão", "2025-06-28 08:55"));
        p.insere(new Historico("REQ017", "Ajuste de configuração Wi-Fi", "2025-06-29 11:40"));
        p.insere(new Historico("REQ018", "Visita técnica agendada", "2025-07-01 15:25"));
        p.insere(new Historico("REQ019", "Troca de antena receptora", "2025-07-02 10:00"));
        p.insere(new Historico("REQ020", "Reparo de sinal instável", "2025-07-03 17:35"));
        p.insere(new Historico("REQ021", "Reinicialização remota de equipamento", "2025-07-04 12:10"));
        p.insere(new Historico("REQ022", "Verificação de segurança de rede", "2025-07-05 09:50"));
        p.insere(new Historico("REQ023", "Manutenção preventiva", "2025-07-06 14:45"));
        p.insere(new Historico("REQ024", "Limpeza de equipamento interno", "2025-07-07 13:30"));
        p.insere(new Historico("REQ025", "Substituição de fonte de energia", "2025-07-08 11:20"));
        p.insere(new Historico("REQ026", "Ajuste de parâmetros de conexão", "2025-07-09 16:55"));

    }




}