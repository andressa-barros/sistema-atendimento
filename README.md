
---

## Estruturas Implementadas

### Classe `Elemento`
Representa um item armazenado em cada estrutura (cliente ou solicitação).

**Atributos principais:**
- `String id`
- `String descricao`
- Outros atributos como nome, data, hora ou motivo do atendimento.

---

### Classe `Node`
Responsável por ligar os elementos da lista encadeada.

**Atributos principais:**
- `Elemento elemento`
- `Node proximo`

---

### Classe `Pilha` (Histórico de Solicitações)
Implementa uma **pilha** com base em lista encadeada.

**Principais métodos:**
- `insere(Elemento elemento)` → adiciona uma solicitação no topo.  
- `remove()` → remove a solicitação mais recente.  
- `vazia()` → verifica se a pilha está vazia.  
- `imprime()` → mostra todas as solicitações no histórico.

---

### Classe `Fila` (Ordem de Atendimento)
Implementa uma **fila** com base em lista encadeada.

**Principais métodos:**
- `adicionarCliente(Elemento elemento)` → adiciona um cliente ao final da fila.  
- `atenderCliente()` → remove o cliente que será atendido.  
- `vazia()` → verifica se a fila está vazia.  
- `imprime()` → mostra a ordem atual de atendimento.

---

## Funcionamento do Sistema

1. **Leitura dos arquivos:**
   - `filadeatendimento.txt` → lista inicial de clientes na fila.
   - `historico.txt` → registros anteriores de solicitações.

2. **Operações possíveis:**
   - Adicionar cliente na fila.  
   - Atender cliente (removendo-o da fila).  
   - Registrar uma nova solicitação no histórico (insere).  
   - Desfazer a última solicitação (remove).  
   - Exibir a fila atual e o histórico de solicitações.

---

## Execução

### Compilação
```bash
javac Main.java
