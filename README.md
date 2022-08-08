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
- 
