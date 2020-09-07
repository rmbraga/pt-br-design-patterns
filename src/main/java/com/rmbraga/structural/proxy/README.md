## Proxy / Substituto

---
O proxy pode ser definido também como um _substituto_. Como um cenário real, o cartão de crédito atua como proxy, ou seja, um substituto para o dinheiro na sua conta. Pode ser utilizado no lugar do dinheiro e provê acesso a este quando necessário.

Isto é exatamente como o padrão proxy funciona, controla e gerência o acesso ao objeto sendo protegido.
O padrão Proxy é classificado como estrutural, utilizado para formar estruturas grandes de objetos entre muitos outros diferentes objetos.

A definição original que consta no livro Design Patters do Gang of Four é a seguinte: 

Permite o controle de acesso em nível de objeto atuando como uma entidade atravessadora - “pass-through” - ou como um marcador - “placeholder”.

De modo a economizar de memória a ser utilizada, deve-se utilizar o Proxy. Da mesma forma, caso queira controlar o acesso a um objeto, o padrão torna-se útil e efetivo. 

Em outras palavras, o padrão Proxy age como barreira entre o cliente e a implementação real que está sendo chamada.

#### Tipos de Proxy
- *Proxy de Proteção*: provê controle de acesso a um objeto.
- *Proxy Virtual*: quando é preciso limitar a criação de objetos, ou seja, salvar memória e processamento.
- *Proxy Remoto*: controlar o acesso a um objeto remoto.

#### Proxy vs Adapter
“mas isto não seria função também de um Adapter?”. 
Pois bem, a principal diferença é que o Adapter expōe uma interface diferente permitindo a interoperabilidade.
Já o padrão Proxy expõe a mesma interface, mas ajuda em economia de memória ou tempo de processamento.

#### Quando devo utilizar o Proxy?
É recomendado o uso quando nos seguintes cenários:
1. O objeto representado é externo ao sistema.
2. Objetos precisam ser criados por demanda.
3. Controle de acesso ao objeto original é necessário.
4. Funcionalidade extra é necessária quando o objeto é acessado.

Faça uso do Proxy quando a comunicação com um elemento terceiro - “third party” - é custoso, provavelmente via network. 
O Proxy vai permitir que você aguarde até o momento do commit - escrever - na base de dados, além de limitar a quantidade de vezes em que esta comunicação é feita.
É também muito utilizado quando se faz necessário a dissociação da implementação atual do acesso a uma biblioteca específica. Recomendado o seu uso também para acesso a grandes arquivos ou gráficos.
Através do uso do Proxy, você pode aguardar/atrasar o carregamento de determinado recurso ate o exato momento em que voce necessita acessá-lo.  
---

_*Reference*: [Baeldung - Design Patterns - Proxy](https://www.baeldung.com/java-proxy-pattern)_