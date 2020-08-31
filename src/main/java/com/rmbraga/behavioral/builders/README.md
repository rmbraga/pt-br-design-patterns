## Construtor / Builder

---
Extraído da definição do GoF (Gang of Four)*:

O padrão Construtor separa a construção de um objeto complexo de sua representação, de modo que o mesmo processo de construção 
pode criar objetos diferentes. O padrão Builder permite que um objeto cliente construa um objeto complexo especificando 
apenas seu tipo e conteúdo. O cliente fica protegido dos detalhes da construção do objeto. Isso simplifica a criação de 
objetos complexos, definindo uma classe que constrói instâncias de outra classe. O padrão Builder produz um produto principal
e pode haver mais de uma classe no produto, mas sempre há uma classe principal. Ao usar o padrão Builder, você cria os 
objetos complexos uma etapa por vez. Outros padrões constroem o objeto em uma única etapa.


#### Construtor / Builder
- Permite que você varie a representação interna de um produto.
- Isola o código para construção e representação de um objeto.
- Oferece maior controle sobre o processo de construção de um objeto.
---

### Quando utilizar o padrão Construtor?

Você deve usar o padrão de construção quando:
1. O algoritmo para criar um objeto complexo precisa ser independente das partes que compõem os objetos e de como essas partes são montadas.
2. O processo de construção precisa permitir diferentes representações do objeto construído.

**"O padrão "Builder" é um padrão de design de software de criação de objeto. A intenção é abstrair as etapas de construção
de modo que diferentes implementações dessas etapas possam construir diferentes representações de objetos. Frequentemente,
o padrão construtor é usado para construir produtos de acordo com o padrão composto.
A intenção do padrão de projeto Builder é separar a construção de um objeto complexo de sua representação. Ao fazer isso,
o mesmo processo de construção pode criar diferentes representações."**

_*Reference: [GoF - Gang Of Four - Design Patterns]_(https://www.gofpatterns.com/creational-patterns/creational-patterns/builder-pattern.php)