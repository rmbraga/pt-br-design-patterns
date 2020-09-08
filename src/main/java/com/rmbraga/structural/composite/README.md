## Composite  / Composto

---
Extraído da definição do GoF (Gang of Four)*:

**"O design de composição permite compor uma estrutura em árvore para representar hierarquia partes-todo.
O padrão composto permite o cliente tratar objetos individuais e composição de objetos de forma uniforme."**

Vamos pegar um exemplo da vida real de uma organização. No exemplo disponível em nosso código, um gerente geral pode estar
vinculado a outro gerente, o qual pode ter desenvolvedores subordinados.

A composição consiste de: composto e folha. _e.g. composite & leaf_

#### Componente / Component
- Declara a interface para objetos nessa composição.
- Implementa o comportamento padrão para a interface comum à todas as classes.
- Declara uma interface para acessar os componentes-filho.

#### Folha / Leaf
- Representa o objeto folha na composição. A folha não tem nenhum componente-filho.
- Define o comportamento para objetos primitivos na composição.
- Herda todos os métodos de Component porém só implementa de fato os que lhe interessam,neste caso o método Operation, nos outros são inseridos exceções que serão geradas em tempo de execução.

#### Composto / Composite
- Define o comportamento para componentes que possuam componentes-filho.
- Armazena componentes-filho.
- Implementa funções relacionadas aos componentes-filho na interface do Componente.
---

### Quando utilizar o padrão Composto?

1. Quando precisar representar hierarquia de objetos
2. Quando a representação tanto de uma estrutura composta de objetos quanto a de objetos singulares tenha de ser feita de maneira uniforme.

_*Reference*: [GoF - Gang Of Four - Design Patterns](https://www.gofpatterns.com/structural-design-patterns/structural-patterns/compositePattern-code.php)_