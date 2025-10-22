# Sistema de Gerenciamento de Atendimento ao Cliente
### Disciplina: Resolução de Problemas Estruturados em Computação
### Turma: 4° U

**Docente:** Andrey Cabral Meira

**Discentes:**
* Fernanda Costa Moraes
* Andressa de Oliveira Barros
* Lissa Deguti
* Melissa Weiss Perussulo

---

# Projeto: Sistema de Gerenciamento de Atendimento ao Cliente

## Objetivo do Projeto

O presente trabalho tem como objetivo o desenvolvimento de um sistema de atendimento ao cliente em linguagem Java, utilizando o conceito de **lista encadeada** para implementar duas estruturas de dados: **pilha** e **fila**.


---

## Estrutura do Sistema

O projeto foi organizado em classes separadas, cada uma com uma função específica no gerenciamento dos dados e operações.

### 1. Classes Básicas

- **`Elemento.java`**: Representa o conteúdo armazenado em cada estrutura, contendo identificador, descrição e demais informações necessárias.
- **`Node.java`**: Define o nó da lista encadeada, que armazena um objeto do tipo `Elemento` e uma referência (`proximo`) ao próximo nó.

---

### 2. Pilha – Histórico de Solicitações

A classe **`Pilha.java`** implementa a estrutura de uma pilha segundo o princípio **LIFO** (*Last In, First Out*), onde o último elemento inserido é o primeiro a ser removido.  
Essa estrutura é responsável por registrar o **histórico de solicitações de serviço**.

**Principais métodos:**
- `insere()` – adiciona um novo elemento no topo da pilha.
- `remove()` – retira o elemento mais recente.
- `vazia()` – verifica se a pilha está vazia.
- `imprime()` – exibe todos os registros armazenados.

A classe **`Historico.java`** foi utilizada para representar os dados específicos de uma solicitação, contendo atributos como código, descrição e data/hora.

---

### 3. Fila – Ordem de Atendimento

A classe **`Fila.java`** implementa a estrutura de uma fila conforme o princípio **FIFO** (*First In, First Out*), onde o primeiro elemento inserido é o primeiro a ser atendido.  
Essa estrutura é responsável por controlar a **ordem de atendimento dos clientes**.

**Principais métodos:**
- `adicionarCliente()` – adiciona um cliente ao final da fila.
- `atenderCliente()` – remove o cliente que será atendido (início da fila).
- `vazia()` – verifica se a fila está vazia.
- `imprimir()` – exibe a sequência atual de atendimento.

A classe **`Atendimento.java`** representa cada cliente, contendo o identificador, o nome e o motivo do atendimento.

---

## Execução do Programa (`Main.java`)

A classe **`Main`** é responsável pela execução geral do sistema, realizando a leitura dos arquivos de texto e a simulação das operações da pilha e da fila.

**Etapas executadas:**

1. **Leitura dos arquivos**
    - `src/arquivos/historico.txt` – contém o histórico de solicitações anteriores.
    - `src/arquivos/filadeatendimento.txt` – contém a fila de clientes aguardando atendimento.  
      Os dados são lidos por meio de `BufferedReader`, tratados e transformados em objetos da classe `Elemento`.


2. **Simulação da Pilha (Histórico)**
    - Exibição do histórico completo.
    - Remoção da última solicitação.
    - Exibição do histórico atualizado.


3. **Simulação da Fila (Atendimento)**
    - Exibição da lista de clientes na fila.
    - Atendimento de um ou mais clientes.
    - Exibição da fila após os atendimentos.
---

## Estrutura dos arquivos

```
- src/
    - Elemento.java
    - Node.java
    - Pilha.java
    - Fila.java
    - Historico.java
    - Atendimento.java
    - Main.java
    - arquivos/
        - historico.txt
        - filadeatendimento.txt
