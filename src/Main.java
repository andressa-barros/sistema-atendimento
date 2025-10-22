import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Cria uma pilha para guardar o histórico das solicitações
        Pilha pilha = new Pilha();

        // Cria uma fila para organizar os clientes que vão ser atendidos
        Fila fila = new Fila();

        // Lê os dados dos arquivos e coloca na pilha e na fila
        carregarHistorico("src/arquivos/historico.txt", pilha);
        carregarFila("src/arquivos/filadeatendimento.txt", fila);

        // Mostra tudo que está na pilha (histórico)
        System.out.println("-------------------------");
        System.out.println("HISTÓRICO DE SOLICITAÇÕES");
        System.out.println("-------------------------");
        pilha.imprime();

        //  Remoção na pilha
        System.out.println("\nRemovendo a solicitação mais recente...");
        pilha.remove();

        // Exibe após a remoção
        System.out.println("\nPilha atualizada:");
        pilha.imprime();

        // Mostra tudo que está na fila (clientes esperando)
        System.out.println("\n-------------------------");
        System.out.println("FILA DE ATENDIMENTOS");
        System.out.println("-------------------------");
        fila.imprimir();

        // Atende dois clientes da fila (para testar a remoção)
        System.out.println("\nAtendendo os primeiros clientes...");
        fila.atenderCliente();
        fila.atenderCliente();

        // Mostra como ficou a fila depois dos atendimentos
        System.out.println("\nFila atualizada:");
        fila.imprimir();
    }

    // ---------------------------------------------------------------
    // Lê o arquivo de histórico e adiciona os dados dentro da pilha
    // ---------------------------------------------------------------
    public static void carregarHistorico(String caminho, Pilha pilha) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;

            // Lê o arquivo linha por linha
            while ((linha = br.readLine()) != null) {
                linha = linha.trim(); // tira espaços extras

                // Procura linhas que começam com "new Elemento"
                if (linha.startsWith("new Elemento")) {

                    // Divide o texto em partes, separando pelo símbolo de aspas "
                    String[] partes = linha.split("\"");

                    // Pega os dados que estão entre as aspas
                    if (partes.length >= 7) {
                        String id = partes[1];          // Ex: "REQ001"
                        String descricao = partes[3];   // Ex: "Instalação de software"
                        String dataHora = partes[5];    // Ex: "2024-08-20 10:30"

                        // Cria um novo histórico com os dados lidos
                        Historico h = new Historico(id, descricao, dataHora);

                        // Coloca esse histórico dentro da pilha
                        pilha.insere(h);
                    }
                }
            }

            System.out.println("Histórico carregado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de histórico: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // Lê o arquivo da fila e adiciona os clientes dentro da fila
    // ---------------------------------------------------------------
    public static void carregarFila(String caminho, Fila fila) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;

            // Lê o arquivo linha por linha
            while ((linha = br.readLine()) != null) {
                linha = linha.trim();

                // Procura linhas com "new Elemento"
                if (linha.startsWith("new Elemento")) {

                    // Divide o texto nas partes que estão entre aspas
                    String[] partes = linha.split("\"");

                    if (partes.length >= 7) {
                        String id = partes[1];                   // Ex: "CLI001"
                        String cliente = partes[3];              // Ex: "Maria Silva"
                        String descricaoAtendimento = partes[5]; // Ex: "Dúvida sobre produto"

                        // Cria um novo atendimento com os dados lidos
                        Atendimento a = new Atendimento(id, cliente, descricaoAtendimento);

                        // Coloca o cliente no fim da fila
                        fila.adicionarCliente(a);
                    }
                }
            }

            System.out.println("Fila carregada com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo da fila: " + e.getMessage());
        }
    }
}
