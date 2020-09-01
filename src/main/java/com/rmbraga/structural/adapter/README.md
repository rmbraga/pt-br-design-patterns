### Descrição do Padrão Adaptador

O padrão adaptador(adapter) age como intermediário entre duas classes, convertendo a interface de uma para que seja utilizada pela outra.
Isto possibilita que classes com interfaces incompatíveis se comuniquem.
O padrão adaptador(adapter) implementa uma interface conhecida para ambos clientes e provê acesso a uma instância de uma classe não conhecida dos seus clientes.
Um objeto adaptador provê a funcionalidade de uma interface sem precisar saber a classe utilizada para implementar determinada interface.

#### Benefícios

- Permite que dois ou mais objetos incompatíveis comuniquem-se e interajam. 
- Melhora a reutilização de antigas funcionalidades.

#### Quando utilizar?

- Queira utilizar uma classe existente, mas sua interface não é compatível com a que você precisa.
- Queira criar uma classe reutilizável que coopere com alguma classe imprevista ou incompatível.
- Queira utilizar um objeto em algum ambiente que espere uma interface que seja diferente da do objeto.
- Quando há necessidade de tradução da interface para múltiplas fontes. 

Na computação, o padrão de projeto adaptador - conhecito também como embrulho/wrapper - traduz uma interface de um classe para uma interface compatível.
O adaptador também é responsável pela transformação de dados de forma apropriada. 
Por exemplo:
Caso múltiplos valores booleanos são armazenados como um inteiro singular (e.g. sinal/flag), o adaptador será responsável por extrair e retornar o valor boolean apropriado dos valores inteiros.
Outro exemplo muito utilizado é a transformação de datas (e.g AAAAMMDD para DD/MM/AAAA). 

_*Referência*_ [GoF - Gang Of Four](https://www.gofpatterns.com/structural-design-patterns/structural-patterns/adapter-pattern.php)