# Princípio da Substituição de Liskov (LSP) 

O **Princípio da Substituição de Liskov (Liskov Substitution Principle - LSP)** é um dos cinco princípios do SOLID e define que **uma subclasse deve poder ser utilizada no lugar da sua classe base sem alterar o comportamento esperado do programa**.

Ou seja, qualquer classe derivada deve manter a integridade das regras de comportamento da classe base. Se uma subclasse altera o comportamento esperado, violando contratos da superclasse, o LSP está sendo desrespeitado.

## Estrutura do Repositório
O repositório contém três casos de estudo que inicialmente violam o LSP e depois são corrigidos.

### **Case 1: Retângulo vs. Quadrado**
**Problema:**
- A classe `Square` herda de `Rectangle`, mas um quadrado tem a restrição de que largura e altura devem ser iguais. 
- Quando um `Square` é usado como um `Rectangle`, alterações de largura ou altura geram comportamento inesperado.

**Pacotes:**
- `case1.problem` - Contém a implementação incorreta que viola o LSP.
- `case1.solution` - Contém a implementação corrigida, onde `Square` e `Rectangle` são tratados como entidades separadas.

---

### **Case 2: Pássaros que Voam e Não Voam**
**Problema:**
- A classe base `Bird` possui um método `fly()`, mas nem todos os pássaros podem voar (exemplo: pinguins).
- A subclasse `Penguin` sobrescreve `fly()` lançando uma exceção, o que viola o LSP, pois o comportamento da classe base é alterado.

**Pacotes:**
- `case2.problem` - Contém a implementação incorreta que viola o LSP.
- `case2.solution` - Contém a implementação corrigida, onde pássaros que voam e não voam são tratados de forma separada.

---

### **Case 3: Conta Bancária vs. Conta Somente Leitura**
**Problema:**
- A classe `BankAccount` permite saques e depósitos.
- A subclasse `ReadOnlyAccount` herda de `BankAccount`, mas sobrescreve `withdraw()` lançando uma exceção, o que viola o LSP.

**Pacotes:**
- `case3.problem` - Contém a implementação incorreta que viola o LSP.
- `case3.solution` - Contém a implementação corrigida, onde `ReadOnlyAccount` utiliza composição ao invés de herança.

## Como Executar os Casos
1. Clone o repositório.
2. Navegue até cada pacote `problem/solution` e execute a classe `Main.java` para visualizar os comportamentos.

## Conclusão
O Princípio da Substituição de Liskov é essencial para garantir que subclasses sejam realmente substituíveis pelas superclasses sem introduzir comportamentos inesperados. Ao aplicar o LSP corretamente, criamos código mais previsível, modular e de fácil manutenção.

