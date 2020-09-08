## Decorador  / Decorator

---
O padrão Decorador pode ser usado para adicionar responsabilidades a um objeto, seja de forma estática ou dinâmica.
O Decorador provê uma interface melhorada ao objeto original.

Para esta implementação, é recomendado o uso da composição no lugar da herança - de forma a reduzir a sobrecarga de subclasses para cada elemento decorador. O recurso envolvido com este design pode ser usada para decorar o objeto quantas vezes for necessária.

#### Exemplo Prático

Vamos supor que temos uma árvore natalina e que queira decorá-la. A decoração não altera o objeto em si; ela acrescenta items como: guirlanda, ouropel, luzes e enfeites.

### Quando utilizar o padrão Decorador?

1. Quando desejamos adicionar / melhorar / remover algum comportamento ou estado do objeto
2. Quando queremos modificar a funcionalidade de um único objeto de um classe sem afetar os restantes

---

_*Reference*: [Baeldung - Design Patterns - Decorator](https://www.baeldung.com/java-decorator-pattern)_