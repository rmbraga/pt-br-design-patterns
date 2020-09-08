![Java CI with Gradle](https://github.com/rmbraga/pt-br-design-patterns/workflows/Java%20CI%20with%20Gradle/badge.svg?branch=master)
# Sobre PT-BR Design Patterns

Este repositório foi criado com a intenção de exemplificar o uso de design patterns em projetos de desenvolvimento de software.

Na área de engenharia de software, temos a seguinte definição sobre *Design Patterns* na [Wikipedia:](https://pt.wikipedia.org/wiki/Padr%C3%A3o_de_projeto_de_software)

*Em Engenharia de Software, um padrão de projeto (do inglês design pattern) é uma solução geral para um problema que ocorre com frequência dentro de um determinado contexto no projeto de software. Um padrão de projeto não é um projeto finalizado que pode ser diretamente transformado em código fonte ou de máquina, ele é uma descrição ou modelo (template) de como resolver um problema que pode ser usado em muitas situações diferentes. Padrões são melhores práticas formalizadas que o programador pode usar para resolver problemas comuns quando projetar uma aplicação ou sistema. Padrões de projeto orientados a objeto normalmente mostram relacionamentos e interações entre classes ou objetos, sem especificar as classes ou objetos da aplicação final que estão envolvidas. Padrões que implicam orientação a objetos ou estado mutável mais geral, não são tão aplicáveis em linguagens de programação funcional.*


## Tipos de padrões
Os 3 tipos de padrões mais comuns são: de criação, estruturais e de comportamento. Para mais explicações, acesse [:link:](https://pt.wikipedia.org/wiki/Padr%C3%A3o_de_projeto_de_software#Padr%C3%B5es_GoF_('Gang_of_Four')) para Wikipedia.

[Padrões de Criação](#padrões-de-criação-creational)

[Padrões Estruturais](#padrões-estruturais-structural)

[Padrões de Comportamento](#padrões-de-comportamento-behavioral)


## Padrões de Criação (Creational)
Em engenharia de software, padrões criacionais são padrões que lidam com mecanismos para a criação de objetos, tentando criá-los de uma maneira que seja adequada para a situação. A forma básica de criação de objetos pode resultar em problemas de design do software ou adicionar complexidade para o mesmo. Padrões de criação solucionam este problema controlando como estes objetos são criados.

- Abstract Factory
- [Builder](https://github.com/rmbraga/pt-br-design-patterns/tree/master/src/main/java/com/rmbraga/creational/builders)
- Factory Method
- Object pool
- Prototype
- [Singleton](https://github.com/rmbraga/pt-br-design-patterns/tree/master/src/main/java/com/rmbraga/creational/singleton)



## Padrões Estruturais (Structural)
Os padrões estruturais preocupam-se com a maneira como classes e objetos são compostos para formar estruturas maiores. Padrões de classes utilizam a herança para compor interfaces ou implementações, enquanto padrões de objeto descrevem maneiras de compor objetos para obter novas funcionalidades. A flexibilidade obtida pela composição de objetos provém da capacidade de mudar a composição em tempo de execução, o que não é possível com a composição estática (herança de classes).

- [Adapter](https://github.com/rmbraga/pt-br-design-patterns/tree/master/src/main/java/com/rmbraga/structural/adapter)
- Bridge
- Business Delegate
- [Composite](https://github.com/rmbraga/pt-br-design-patterns/tree/master/src/main/java/com/rmbraga/structural/composite)
- [Decorator](https://github.com/rmbraga/pt-br-design-patterns/tree/master/src/main/java/com/rmbraga/structural/decorator)
- Façade (ou Facade)
- Flyweight
- Private class data
- [Proxy](https://github.com/rmbraga/pt-br-design-patterns/tree/master/src/main/java/com/rmbraga/structural/proxy)


## Padrões de Comportamento (Behavioral)
Os padrões de comportamento concentram-se nos algoritmos e atribuições de responsabilidades entre os objetos. Eles não descrevem apenas padrões de objetos ou de classes, mas também os padrões de comunicação entre os objetos. Os padrões comportamentais de classes utilizam a herança para distribuir o comportamento entre classes, e os padrões de comportamento de objeto utilizam a composição de objetos em contrapartida à herança.

- Chain of Responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Template Method
- Visitor

## Contribuindo 
TBD

## Licença
[MIT](https://choosealicense.com/licenses/mit/)


