## Singleton

---
Extraído da definição do GoF (Gang of Four)*:

O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa classe. 
Ele garante que todos os objetos que usam uma instância dessa classe usem a mesma instância.


#### Benefícios do uso do padrão Singleton
A seguinte lista trás os benefícios de usar o padrão Singleton:
1. Acesso controlado à instância única.
2. Espaço de nome reduzido.
3. Permite refinamento de operações e representação.
4. Permite um número variável de instâncias.
5. Mais flexível do que as operações de classe.
---

### Quando utilizar o padrão Singleton?
Você deve usar o padrão Singleton quando: Deve haver exatamente uma instância de uma classe.

Em engenharia de software, o Singleton Pattern é um padrão de projeto que restringe a instanciação de uma classe a um objeto.
Isso é útil quando exatamente um objeto é necessário para coordenar ações em todo o sistema.
O conceito às vezes é generalizado para sistemas que operam com mais eficiência quando existe apenas um objeto, ou que 
restringem a instanciação a um certo número de objetos.
O termo vem do conceito matemático de um singleton.
Há críticas ao uso do padrão singleton, pois alguns o consideram um antipadrão, julgando que é usado em excesso, introduz
restrições desnecessárias em situações em que uma única instância de uma classe não é realmente necessária e introduz o 
estado global em um aplicativo.

_*Reference: [GoF - Gang Of Four - Design Patterns]_(https://www.gofpatterns.com/creational-patterns/creational-patterns/singleton-pattern.php)
