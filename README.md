# UniProg2SistLinear
Aulas e exercícios da cadeira de programação 2: sistemas lineares, da Unisinos (Minhas respostas e anotações)

==-- Sites interessantes --==
- DZone
- Hacker rank
- https://www.infoq.com/
- https://echeung.me/crcmaker/
- Mining Software Repositories
- https://learngitbranching.js.org/?locale=pt_BR

==-- Aplicativos para instalação --==
- Astah UML - e-mail da unisinos dá acesso
- Eclipse/IntelliJ
- Git
- CMDer

==-- Lendo Erros --==
- NullPointerException -> não aponta para nada ou não pode invocar 
  - Tá chamando um método não instanciado (não tá criando o objeto em algum lugar)
- ArrayIndexOutOfBoundsException
  - Tenta pegar um valor do array fora do tamanho
- Exception in thread “main”: NoSuchMethodError: main
  - N encontrou o main

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
- Uma especificação 
- Pode apresentar variações de objetos (instâncias)
- Objeto existe em tempo de execução
- A persistência dos objetos necessita um agente externo para a memória
- Te obriga primeiro em entender o que fazer
- Membro estático
  - Casa.setArquiteto("") -> public static void setArquiteto(Ex exemplo){ arquiteto = exemplo }
- Numa caixa de texto é possível fazer n operações de variação
- Static
  - Sempre referentes à classe
- Operações de inicialização são os construtores
- Os objetos de uma OO sempre conversam entre sí
- Uma classe final não pode ter nada abaixo dela (não pd ter filhas)

==-- Objetos --==
- Ficam em pilhas, junto com os tipos primitivos

==-- Princípios --==
- Abstração permite um entendimento apenas do que for conveniente
- Mais abstração tem menos detalhes
- Herança
  - Superclasse (abstração)
  - Subclasses (filhas ou derivadas) - especializadas da superclasse (classe pai)
- Encapsulamento
  - Information hiding
  - Seta coisas q fazem sentido para os clientes da classe 
  - Relação com os modificadores de visibilidade
  - Não preciso necessariamente saber tudo que o método faz para poder utilizá-lo
- Polimorfismo
  - Vários comportamentos
  - Só acontece por causa da abstração
  - Não se pode ter métodos abstratos em classes concretas

==-- Boas Práticas --==
- Construtores
  - Não são classes
  - Sem tipo de retorno e mesmo nome da classe
  - Não fazem parte da interface
  - Só aparece na hora de construir o objeto
  - N necessariamente explícitos
- Interface da classe
  - Uma interface é u7ma API
  - Uma classe tem vários métodos e é isso q vc precisa saber
  - N a da tela, essa é a UI
- Usuário e desenvolvedor da classe
  - O cliente da classe usa muita abstração na hora de utilizá-la
  - O desenvolvedor precisa fornecer os métodos todos e permitir o usuário usar a classe sem maiores problemas
  - Dependendo do papel é importante saber como agir
- Modificador d visibilidade
  - Uma classe tem métodos e atributos
  - Private
    - Apenas dentro da classe 
  - Package private / dafault
    - Sem uma especificação, é ele quem aparece por default
    - Só pode ser enxergado dentro do mesmo pacote
  - Protected 
    - Acesso pelas subclasses
    - Tbm só é acessível por classes do mesmo pacote
  - Public
    - Geral pode ver as paradas
- Conteúdo de uma Classe
  - Estrutura package (informação de pacote)
  - Vários imports
  - Declaração
  - Boa prática colocar atributos no início
  - Construtores
  - Métodos
  - Blocos e inicialização static 
  - Classes dentro de classes
- Atributos
  - Contém dados
  - Podem ter modificador de visibilidade ou n
  - Um atributo final n pd ser modificado posteriormente (uma constante)
- Métodos
  - POdem n retornar nd
  - Proceedure
  - Mod de visibilidade
  - Pd ter um atributo interno
- Escopo das variáveis
  - Da classe / local / método
  - Apenas uma classe pública por arquivo

==-- Controle de versão com git --==
- Função de um SCV
  - Centralized version control system
  - Anos 90
  - Os primeiros eram baseados em servidores (centralizados)
    - O update atualizava a versão das workstations
    - As mudanças locais tinham commit e eram jogadas ao servido central
    - Antes a central via se existia alguma alteração antes da alteração minha, caso não, apenas dava commit, se sim, obrigava o programador a mesclar as diferenças feitas antes de seu commit
    - Os branches só eram criados no servidor 
    - Usava muito a rede
  - Distributed version control system
    - A workstation é tratada como um servidor (repositório local)
    - As operações são locais, os envios tem terminologias diferentes
    - Permite o trabalho simultâneo e um história de evolução
    - Permitem controlar os plug-ins e owners dos trechos de código (ilhas de conhecimento - modificações conjuntas)
- Git
  - Controle de versão distribuído
  - Kernel do Linux
  - Existe o staging (meio do caminho)
  - O git fetch é diferente do git pull (ele mostra as diferenças)
  - git init/git add
    - init cria um repositório novo 
    - add adiciona no local
  - Commit -> commita pro reposit´roio da máquina
  - git show -> dados de um commit
  - git log -> logs do commit
  - git branch -> lista as branches do git
  - git merge -> mescla as branches
  - git status -> lista tudo q vai ser commitado
  - git checkout -> troca a branch
  - git clone -> clone um git 
  - git remote -> adiciona o remoto no local
  - git push -> envia o da máquina para o online
  - git tag -> tag nas versões
  - git rm -> deleta o trabalho atual
  - Os commits tem código rash
  - O head do git aponta para a versão atual (o grapho é ao contrário)
  - Os commits são confirmações na estrutura
  - Não necessariamente se usa a linha de comando no terminal (IDE's tem relacionamento com git agr), mas é interessante para ver o que o PC anda fazendo com os arquivos
  - Existem git flows (braches usadas para colocar tds os arquivos e dps jogar td na master)

==-- Modelagem OO --==
- MOntagem e experiência do usuário
- Esquematização da disposição do código
- Uso do UML
- Não é interessante montar toda a modealgem antes (mais efetivo é montar e testar pequenas partes do modelo)
- Serve como apresentação de conceito (representação)
- BD(ER) \ UML / US/UX
- UML é o padrão
- Multiplicidade
  - Quantas associações existem entre as classes
- Classe abstrata
  - Escrita em italico
  - Tbm é possível colocar um esteriótipo na classe
- Em uma herança deve-se planejar os pai da classe filha (deve ser pertinente, maioria das linguegens não suporta herança múltipla)
- Linhas pontilhadas indicam abstração e interface no UML
- 
