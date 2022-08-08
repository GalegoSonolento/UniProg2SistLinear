# UniProg2SistLinear
Aulas e exercícios da cadeira de programação 2: sistemas lineares, da Unisinos (Minhas respostas e anotações)

==-- Sites interessantes --==
- DZone
- Hacker rank
- https://www.infoq.com/

==-- Modelos de desenvolvimento --==
- Waterfall (68)
- Buzer - geradores (geravam uma aplicação total)
- "Wiked problem" - um problema já resolvido, mas sem a especificidade correta
- Modelo de paleto 80/20 - foco em 20% das funcionalidades
- UX design - desenhos de sistemas mais amigáveis ao usuário
- Ecossistema de sistemas - novas aplicações precisa se encaixar em outras maiores e permitir conexões em si
- Corba / Dcom / web services

==-- API --==
- Application Programing Interface
- Um chamamento de classe é uma API
- Os instanciamentos usam a API da linguagem
- INteração de sistemas é via API web
- Permite as interações do programador com os componentes da linguagem
- Evita overinteraction (encapsulamento)

==-- Biblioteca --==
- Fernecidas pela linguagem
- Acessada pela API

==-- Componente --==
- "pronto pra uso"
- inversão de dependência - o componente pode fazer algo por mim
- Pode ser mais prático q uma biblioteca (pré-pronto)

==-- Framework --==
- Estrutura montada que fornece ferramnetas para construção de aplicação

==-- Microserviços --==
- Segregação de serviços dentro da mesma aplicação para evitar a queda total do sistema

==-- Software livre e open source --==
- Stallman
- Raymond

==-- Classes --==
- Contâineres de código
- Se pública ela dá o nome do arquivo.java
- É possível colocar mais de uma classe num mesmo .java, mas apenas uma pode ser pública (não é uma boa prática)
- Dá pra usar recursos nativos da máquina dependendo da biblioteca do java (a JVM faz a portabilidade do java para todas as máquinas possíveis, só precisa estar lá)

==-- Garbage collector --==
- Os ponteiros do java não são manipulados diretamente
- Os objetos ficam armazenados dentro de um "heap" - as pilhas apontam para os objetos da heap
- Ele observa objetos que são inutilizados ou que foram postos como null e retira-os da memória
- O programador não cria objetos, eles aparecem durante o processamento do programa
- O GC funciona enquanto o programa roda

==-- Pacotes --==
- Organização das classes
- Agrupamentos de classes (criação de pacotes)
- Podem ser chamados na íntegra durante o código

==-- Conceitos sobre OO --==
- Existem vários objetos e eles são manipulados pelas classes dentro da linguagem

==-- Anatomia de um código --==
- O mais recebe um array de Strings
- Empacotamento de um programa java é .jar - um zip com a extensão jar
- Dá pra colocar bibliotecas inteiras em .jar - ele pode ser incorporado a outros projetos (como frameworks)
- #> java -jar exemplo.jar (sem parâmetros) -> java -jar exemplo.jar -n "Guilherme" (passando parâmetros pelo console)
- Métodos de classe são estáticos
- Atributos sempre estão non topo do código
- Se um método não é entendivel em menos de 30s, tem algo de errado com o método
- Comentários tem hora e lugar
- Código precisa ser autoexplicativo

==-- Histórico: tipos de dados --==
- Começaram a falar sobre o paradigma de orientação a objetos na década de 60
- Paradigma funcional (36) - anterior ao Turing
- LInguagens estão caminhando para um ambiente multiparadigma
- Alan Kay - pai da OO - criou o SmallTalk
- UDT - tipo definidos pelo usuário - LP's mais expressivas
  - Numa ficha, o endereço pode ser um tipo criado pelo usuário (uma classe inteira nova memo)
- ADT - tipos anstratos de dados
  - Esquema do public e private

==-- Paradigma da OO --==
- O mundo é feito de objetos
- Resolve o problema da separação de dados de funções
- Alta coesão e baixo acoplamento - maior dificuldade 
- Coesão
  - Faz sentido/lógico
  - Relacionado a responsabilidade e padrão de escrita (o método tem apenas uma função)
  - É preferencial quebrar as funções o máximo possível
  - Nomes de método devem refletir as funções da função
  - Método privado é o apoio pra ser usado dentro da classe
- Acoplamento
  - Interdependência das funções
  - Herança e polimorfismo diminuem as relações de acoplamento
- Classes instanciáveis e concretas são as mais mutáveis (c/ mto acoplamento, as mudanças podem afetar outras classes)

==-- Classe --==
- Contâiner de dados e funções
- Classe não existe em tempo de execução 
- 
