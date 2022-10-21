# UniProg2SistLinear
Aulas e exercícios da cadeira de programação 2: sistemas lineares, da Unisinos (Minhas respostas e anotações)

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
- Nunca colocar System.ou.println() por todo o código e no main
- Definir atributos como private
- Custos de sistemas tem um impacto importante na velocidade do programa (aplicações e criações de objetos)
- Usar interfaces antes das classes abstratas (dx a classe abstrata se fazer necessária)
- Var args -> mto parecido com o do python / (T... elementos) = (* elementos)
- Cláusula de guarda
  - Pensar na lógica do cenário problemático antes
  - Métodos tem "contratos"
  - Validar se os parâmetros são verdadeiros
  - Economiza recursos da máquina

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
- DEpendência
  - Parâmetro dentro de algum dos métodos

==-- Modelagem ágil --==
- Artefato é td q foi produzido
- Entender quais artefatos agregam valor
- Documentação deve acontecer com o projeto andando
- Sempre tentar ajudar outros a terminar os códigos e tarefas
- O fluxo de produção de software é constante
- Os CRC cards não precisam servir de documentação - só exploram os conceitos
- Documentação éimportante (mas n dá pra sobrecarregar o time só com isso)
- Astah não pega as dependências (precisam ser criadas no astah)

==-- Arrays e matrizes --==
- Conceitos e estrutura
  - Array é uma coleção de elemetos (objetos ou tipos)
  - Um array é estático (tamanho fixo)
  - O valor default de um array de objetos é null, 0 para numerais, unicode para char e false para boolean
  - Array == vetor
  - OutOfBounds é quando saiu do index do array
- Estrutura
  - Sempre o nome[índice] = conteúdo
- Funcionamento
  - EXistem heaps e pilhas
  - Os valores são armazenados em uma heap
- Formas de percorrer um array
  - Os meios realmente são o for e o for-it
  - O for-it tem um objeto de referência para percorrer um arary
  - O while e do-while também são usados, mas nem tanto (talvez para procura de dados específicos)
- Formas de criação (e matrizes)
  - Uma definição com tds os elementos explícitos (um array de semana, por exemplo)
  - Ou String[] semana = new String[7] // semana = {*dias da semana*}
  - Array é uma matriz unidimensional (vetor)
  - Vetores multimendionais viram matrizes
  - Exemplo:
    - String[][] nomeDoArray = {{inicializador linha 1}, {inicializador linha 2}, ...}
    - Elas podem ter várias dimensões
    - Elas são organizadas por linhas (planilhas)
- Propriedade lenght vem padrão e me dá o tamanho dele
- É possível criar arrays de qql dimensão
- System.arraycopy() - copia um vetor para outro. Mas tbm dá pra usar a classe Arrays
- A classe arrays deve ser importada, mas é mto útil para lidar com arrays

==-- Exceptions --==
- Tipos de erros
  - Erro de lógica e de checagem (alguns realmente precisam de revisão e tratamento) / também existem os que precisam de tratamento de hardware
 - Checked e unchecked 
  - As checked n precisam de tratamento explícito, mas as unchecked sim
- os blocos são de "try and catch" - também existe o finnaly - Semelhante ao switchCase
- Exceções interrompem o fluxo normal do código (são mais custosas que simples tratamentos)
- Criando Exceções
  - As exceções criadas precisam ser puxadas de alguma das classes de exceções

==-- Conversão de objetos --==
- Classes wrappers trasnformam os tipos primitivos em objetos para a manipulação
- Aplicações reais pedem tipos específicos - montetários usam bigDecimal
- vetores seguem a mesma estrutura
- Tipos maiores convertidos para menores precisam de seleção de informação (descrição do tipo antes da declaração - casting)
- Existe um risco nas conversões - sem try/catch um programa pode quebrar facilmente
- O pacote java.lang sempre vem junto no java - classes empacotadoras (wrappers)
- O boxing e unboxing são feitos automaticamente no java

==-- Tipos Genéricos --==
- Definição do tipo usado na estrutura
- Segurança da rodagem do código
- O que são:
  - São os tipos definidos
  - As referências são as letras (são substituidas pela informação contida no tipo genérico)
  - Object é o pai de todos
- Não funciona com tipo primitivo
- Não dá pra alterar o tipo de um obj
- Sintaxe
  - class NomeDaClasse<Tipo> -> NomeDaClasse<Tipo> var = new NomeDaClasse<Tipo>([argumentos])
  - O interrogação (?) pode ser qql coisa
- Não são instansiados por si só
- Funciona igual uma classe criada normal, mas pode usar qql tipo de objeto

==-- Herança e polimorfismo --==
- COnstrutor não é método (o retorno é o próprio objeto)
- Métodos tbm tem sobrecarga (a diferença pd estar nos parâmetros)
- Uso do this e super
  - super é pras classes superiores (se algo tiver protected dá pra ver)
- Enumerações
  - Final classes n podem ter herança
  - Métodos final n podem ser sobreescritos (mas a sobrecarga ainda acontece)
  - Qql final rola
  - Tipos enumerados servem de classificação
  - value() - retorna uma array das enumerações
  - valueOf(String) - retorna uma String das enumerações
- Associações
  - Classe abstrata impede de criar objetos
- Um static explicita que um atributo é da classe
- Regras
  - Nenhuma referência dá protected
- Classes abstratas
  - Compartilhar dados e comportamento
  - Princípio da substituição de boskof
  - POde ter métodos concretos 
  - INterface é mais abstrata q classe abstrata
  - Classes abstratas tbm podem ter construtores
- Interface
  - Só constantes
  - Métodos abstratos e sem construtores
  - Conceito OO, não da tela
  - Dá pra chamar de contrato
  - Uma classe pode ter várias implementações de interface
  - implementações de comportamento
  - <<interface>>
  - Compartilhamentos de comportamentos é com interface  (procurar começar a codar com ela)
  - Métodos são todos públicos (default)

==-- RECURSÃO --==
- Fundamentos
  - Função chama ela mesma
  - Problema grande dividido em partes menores
  - Substitui alguns problemas de iteração
  - Ela pede um caso base e outro recursivo 
  - Uso da pilha de chamadas
  - Função recursiva sempre deixa um pedaço da memória ocupado
- Riscos
  - Um código mais elegante e difícil de entender
- Número triangular 
  - Monta um  triângulo equilátero de acordo com o número de quadradinhos na aresta
  - Diz quantos quadrados são necessários para montar a estrutura
  - Mesmo código do fatorial, mas com soma

==-- MANIPULAÇÃO DE ARQUIVOS --==
- Saída padrão é a tela ou impressora e a entrada padrão é o teclado
- Arquivo é uma unidade persistente de informação
- 'ML''s são formatos de marcação - ajuda na integração de aplicações
- Anatomia de um arquivo
  - Banco de dados relacional é basicamente uma tabela
  - Colunas/dados/campos
  - Linha/Registro/Informação/Tupla
  - Separadores podem ser por vírgula, qtde de dígitos, etc
  - XML e JSON possuem um tipo de layout - metadado
- API Java
  - java.io
    - Biblioteca mais antiga de manipulação de arquivos
    - InputStream/OutputStream - binários
    - Reader/Writer - leitura de arquivos mais high level
    - Serialização e logging
    - java.nio -> API nova (mais bem feita-melhor de usar)
  - Classe File
    - Representa diretórios e arquivos
    - File tem vários construtores
    - IOException -> exceções verificáveis facilitam implementações de aplicações
  - Hierarquia InputStream e OutputStream
    - Algumas leituras da memória e de serialização 
  - EOF - End Of File
    - Para encerrar uma leitura é preciso entregar um comando de final de arquivo
  - Caracteres especiais
    - No windows o padrão de diretórios é o contrabarra
    - Mas todo mundo pode usar a barra normal pra expressão de códigos
  - Hierarquia Reader e Writer
    - São dois q funcionam para leitura de redes

==-- DESIGN OO --==
- Coesão 
- Acoplamento
- Tamanho
- Complexidade
- Entender esses aspectos facilita no processo de aprendizado do código em incorporação nas equipes
- Todos os paradigmas precisam ser levados em conta (é importante levar aspectos de diferentes paradigmas juntos)
- Princípios da OO
  - Herança
  - Abstração
  - Encapsulamento
  - Polimorfismo
- Problemas de design
  - Rigidez
    - Manutenção é dificil
    - Muita alteração de módulos
    - Códigos mais complexos do que deveriam
    - Acontece quando ferramntas de mapeamento de problemas não são usadas
    - A rigidez também é comportamental
  - Fragilidade
    - Fácil de quebrar
    - O problema aparece em um trecho provavelmente não pensado
    - Ainda assim é possível identificá-los
    - O time de resposta ao problema é importante pra análise pos mortem -> identificação do porquê o produto quebrou (implementações futuras usam esses dados)
    - Um código frágil n tem testes de integração
      - Testes automatizados -> dá de brinde um teste de regressão (eles ficam de histórico como uma bateria para mostrar partes quebradas)
  - Imobilidade
    - Reuso excessivo de código
    - Poucas abstrações de código
    - Bibliotecas precisam ser partes plugáveis de código (criar/usar/visar formas de reúso)
  - Complexidade desnecessária
    - Funcionalidades desnecessárias
    - O Homem Mítico-Mês
    - Manutenção complicada
    - "Com um prejeto atrasado não adianta colocar mais pessoas" - Frederick Brooks
    - Evitá-vel com pensamento sistêmico
    - Complexidades
      - Essencial
        - Inerente ao problema
      - Acidcental
        - Desnecessária 
        - Colocada no sistema por algum motivo de produção
    - A complexidade cresce junto com o processo
    - Dívida técnica
      - Impossível de eliminar 
      - Apenas pode ser gerida
  - Repetição desnecessária
    - copia e cola dentro do código
    - Uma alteração tem um efeito em cascata
  - Opacidade
    - Nomes precisam ser significativos
    
==-- Princípios SOLID --==
- Single Responsability Principle
  - Coesão maior entre as classes
- Open Closed Principle
  - Bertrand Meyer
  - Design by contract (basicamente uma API)
  - Abertos pra ampliação mas fechados pra modificação -> ab stração/proteção de código
  - Tipos abstratos praticamente não mudam (quebram bibliotecas) - proteção dos comportamentos
  - 

==-- JUnit --==
- Todo código precisa de testes
- Performance e stress são testes diferentes - performance é resposta/stress é desempenho em situações extremas
- Verificação e validação de software
  - Identificação de implementações e de funcionamento correto 
  - Além de estar alinhado com as vontades do cliente
  - Validação envolve o usuário
- Testes white e black box
  - white tem acesso ao código -> normalmente feito por programadores
  - black teste usabilidade -> testadores que não tem acesso ao código (não são necessariamente programadores)
- Teste de unidade é a menor porção do teste (classe ou método)
- Testes de integração podem ocorrer em ambientes mais robustos, mas com mais frequência que testes de UI
- JUnit
  - Módulo de testes popular (suporte nativo nas IDE's)
- TDD: Test-Driven Development
  - Trabalhar com ciclos curtos e pequenos de codar e testar
  
==-- Listas --==
- Estruturas dinâmicas (maioria dos casos) - evita estouros no código
- Super genérica 
- Implemeta listas, pilhas e filas
- Pilha - recebe no topo e retira no topo 
- Fila - recebe no fim e tira no começo
- Ordem linear
- Lista tem um espaço inicial de memória reservado
- Consegue armazenar objetos
- A maioria dos casos com estrutura de dados usam listas
- Lista ordenada
  - Impôe uma ordem de elementos (regra)
  - Primeiro se testa se a estrutura comporta mais elementos
  - Depois localizar o local de incersão 
  - Empurrar os demais pra frente
  - Inserir
  - Existem estratégias de aumento do tamanho de memória usada (em listas)
- Lista não-ordenada
  - Colocado em qql posição 
  - Esquema do aumento de tamanho ainda existe
- Lista indexada
  - Usa a referẽncia da posição
- Tipos de lista
  - API de uma lista é praticamente igual à de uma array
  - Big O: Complexidades 
    - Os piores casos de código sempre são calculados para saber a efetividade de código
    - O(n)- linear -> maior e menor elemento
    - O(log n) - logaritmico -> pesquisa binária
    - O(n log n) - logaritmico aumenta -> ordenação
    - O(n²) - quadrático -> bubble sort
    - O(2^n) - terrivelmente grande
    - O(n!) - provavelmente impossivel de resolver (com grandes quantidades) - extremamente demorado - problemas NP
  - Lista simples
    - Normalmente tem O(n) - apenas reatribuições de espaços
  - Lista encadeada
    - Não fica organizado linearmente 
    - Sem índices
    - Cada objeto aponta para outro em seguida
    - adição de outros elementos apenas troca as referências de escolha (links das listas)
    - Leitura: O(n) -> ainda precisa percorrer a estrutura até encontrar o objeto procurado
    - Para remover todos da lista precisa apontar o primeiro e último pro null
    - Permanece com a noção de índices, mas eles não mais existem 
    - Usada para manter velocidade na inserção e remoção 
    - Manter a ordem aqui também é mais simples
  - Lista duplamente encadeada
    - igual uma lista encadeada
    - Mas agora ele também te uma referência pro elemento anterior 
- API do Java
  - 



  

==-- Prograssão de Lacerda? --==

