## Facade
---
Recomendado quando na necessidade de simplificar o acesso de um cliente a uma interfaced onde muitas outras operações são realizadas nos bastidores. 

Em outras palavras, o Facade encapsula um subsistema complexo através de uma interface.

Um dos grandes benefícios é a dissociação do cliente com a complexidade dos subsistemas, ou seja, de sua interação. Graças a isto, podemos introduzir mudanças no sistema sem afetar o cliente.


#### Como utilizar
Vejamos, por exemplo, o caso de um saque em uma conta de banco:

*Requisição*: posso sacar R$ 50,00 da minha conta do banco? 

- *Tarefa 1*: Verificar se minha conta é válida
- *Tarefa 2*: Verificar se o código de segurança é válido
- *Tarefa 3*: Verificar se há balanço disponível
- *Tarefa 4*: Efetuar o saque e ajustar o balanço

---
*References:* 
[Baeldung - Facade Design Pattern](https://www.baeldung.com/java-facade-pattern) ||
[Youtube - Facade Design Pattern](https://www.youtube.com/watch?v=B1Y8fcYrz5o&ab_channel=DerekBanas)


