## Método de Fabrica / Factory Method

---
Extraído da definição do GoF (Gang of Four)*:

Em um padrão de fábrica, uma classe concreta com métodos estáticos é usada para criar instâncias de objetos que implementam
uma interface.

O padrão Factory Method define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar.
O método Factory permite que uma classe adie a instanciação para subclasses, o que é útil para construir objetos individuais 
para uma finalidade específica sem que o solicitante saiba a classe específica que está sendo instanciada. Isso permite que 
você introduza novas classes sem modificar o código, porque a nova classe implementa apenas a interface para que possa ser 
usada pelo cliente. Você cria uma nova classe de fábrica para criar a nova classe e a classe de fábrica implementa a interface
de fábrica.

---
#### Benefícios
A seguir está uma lista dos benefícios de se usar o padrão Factory Method.
- Elimina a necessidade de vincular classes de aplicativo ao seu código. O código lida apenas com a interface, portanto, você pode trabalhar com quaisquer classes que implementem essa interface.
- Permite que as subclasses forneçam uma versão estendida de um objeto, porque criar um objeto dentro de uma classe é mais flexível do que criar o objeto diretamente no cliente.
---

### Quando utilizar o padrão Método de Fabrica?

Você deve usar o padrão do método de fábrica quando:
1. Uma classe não pode antecipar a classe de objetos que deve criar.
2. Uma classe deseja que suas subclasses especifiquem os objetos que ela cria.
3. As classes delegam responsabilidade a uma das várias subclasses de auxiliares e você deseja localizar o conhecimento de qual subclasse auxiliar é delegada.

*Reference:* [GoF - Gang Of Four - Design Patterns](https://www.gofpatterns.com/creational-patterns/creational-patterns/factory-method-pattern.php)
