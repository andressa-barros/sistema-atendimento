
---

## 🧩 Estruturas Implementadas

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
- `Elemento dado`
- `Node proximo`

---

### Classe `Pilha` (Histórico de Solicitações)
Implementa uma **pilha** com base em lista encadeada.

**Principais métodos:**
- `push(Elemento e)` → adiciona uma solicitação no topo.  
- `pop()` → remove a solicitação mais recente.  
- `isEmpty()` → verifica se a pilha está vazia.  
- `exibirHistorico()` → mostra todas as solicitações no histórico.

---

### Classe `Fila` (Ordem de Atendimento)
Implementa uma **fila** com base em lista encadeada.

**Principais métodos:**
- `enfileirar(Elemento e)` → adiciona um cliente ao final da fila.  
- `desenfileirar()` → remove o cliente que será atendido.  
- `isEmpty()` → verifica se a fila está vazia.  
- `exibirFila()` → mostra a ordem atual de atendimento.

---

## Funcionamento do Sistema

1. **Leitura dos arquivos:**
   - `filadeatendimento.txt` → lista inicial de clientes na fila.
   - `historico.txt` → registros anteriores de solicitações.

2. **Operações possíveis:**
   - Adicionar cliente na fila.  
   - Atender cliente (removendo-o da fila).  
   - Registrar uma nova solicitação no histórico (push).  
   - Desfazer a última solicitação (pop).  
   - Exibir a fila atual e o histórico de solicitações.

---

## Execução

### Compilação
```bash
javac Main.java
