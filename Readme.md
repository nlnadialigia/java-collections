# Java - Trabalhando com Collections

<p align="center">
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/nlnadialigia/java-collections?color=170055&style=plastic">&nbsp;
  <img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/nlnadialigia/java-collections?color=170055&style=plastic">&nbsp;
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/nlnadialigia/java-collections?color=170055&style=plastic">&nbsp;
  <a href="./LICENSE.md">
    <img alt="GitHub" src="https://img.shields.io/github/license/nlnadialigia/java-collections?color=170055&style=plastic">
  </a>
</p>

<br>

# ℹ️ Sobre

Repositório dedicado aos exemplos do curso de Java - Trabalhando com Collections, da DIO.

## 📌 Coleções com iterações ordenadas: List

- Elementos duplicados e garante ordem de inserção
- ArrayList deve ser usado onde mais operações de pesquisa são necessárias, e LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias.

### ⚙ Exercícios Propostos

🔴 Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2– Fevereiro e etc).

🔴 Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
   Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
   "Assassina". Caso contrário, ela será classificado como "Inocente".
   <br>

## 📌 Coleções com Singularidade: Set

- Não permite elementos duplicados
- Não possui índice

### ⚙ Exercícios Propostos

🔴 Crie um conjunto contendo as cores do arco-íris e: <br>
A. Exiba todas as cores uma abaixo da outra<br>
B. A quantidade de cores que o arco-íris tem<br>
C. Exiba as cores em ordem alfabética<br>
D. Exiba as cores na ordem inversa da que foi informada<br>
E. Exiba todas as cores que começam com a letra ”v”<br>
F. Remova todas as cores que não começam com a letra “v”<br>
G. Limpe o conjunto<br>
H. Confira se o conjunto está vazio<br>

🔴 Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por: <br>
A. Ordem de Inserção<br>
B. Ordem Natural (nome)<br>
C. IDE<br>
D. Ano de criação e nome<br>
E. Nome, ano de criacao e IDE<br>
Ao final, exiba as linguagens no console, um abaixo da outra.
<br>

## 📌 Coleções de Pares: Map

- Elementos únicos (key) para cada valor (value)

### ⚙ Exercícios Propostos

🔴 Dada a população estimada de alguns estados do NE brasileiro, faça:

```
Estado = PE - População = 9.616.621

Estado = AL - População = 3.351.543

Estado = CE - População = 9.187.103

Estado = RN - População = 3.534.265
```

- Crie um dicionário e relacione os estados e suas populações;
- Substitua a população do estado do RN por 3.534.165;
- Confira se o estado PB está no dicionário, caso não adicione: PB -
  4.039.277;
- Exiba a população PE;Exercícios Propostos
- Exiba todos os estados e suas populações na ordem que foi
  informado;
- Exiba os estados e suas populações em ordem alfabética;
- Exiba o estado com o menor população e sua quantidade;
- Exiba o estado com a maior população e sua quantidade;
- Exiba a soma da população desses estados;
- Exiba a média da população deste dicionário de estados;
- Remova os estados com a população menor que 4.000.000;
- Apague o dicionário de estados;
- Confira se o dicionário está vazio.

<br>

🔴 Faça um programa que simule um lançamento de dados.

- Lance o dado 100 vezes e armazene.
- Mostre quantas vezes cada valor foi inserido.

<br>

## 📌 Stream API

#### ⚙ Classe Anônima

A classe anônima em Java é uma classe não recebeu um nome e é tanto declarado e instanciado em uma única instrução. Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado apenas uma vez.
<br>

#### ⚙ Functional Interface

Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.

- Comparator
- Consumer
- Function
- Predicate
  <br>

#### ⚙ Lambda

Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).
<br>

#### ⚙ Method Reference

Method Reference é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível . Para utilizá-lo, basta informar uma classe ou referência seguida do
símbolo “::” e o nome do método sem os parênteses no final.
<br>

#### ⚙ Stream API

A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional. Combinada com as expressões lambda, ela proporciona uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de
escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.

<br>

# 👩‍💼 Autora

<img src=".github/picture.png" width="100px;" alt="Picture"/>
<p><b>Nádia Ligia, desenvolvedora em construção.</b></p>
<a href="https://www.linkedin.com/in/nlnadialigia/">
  <img alt="Linkedin" src="https://img.shields.io/badge/-Linkedin -170055?style=flat&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/nlnadialigia/" />
</a>&nbsp;
<a href="mailto:nlnadialigia@gmail.com">
  <img alt="Email" src="https://img.shields.io/badge/-Email-170055?style=flat&logo=Gmail&logoColor=white&link=mailto:nlnadialigia@gmail.com" />
</a>&nbsp;
<a href="https://www.nlnadialigia.com">
  <img alt="Homepage" src="https://img.shields.io/badge/-Homepage-170055" />
</a>
