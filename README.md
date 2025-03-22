# 📊 Manipulação e Processamento de Vetores em Java

![java-9](https://github.com/user-attachments/assets/7d272eaa-4d0d-4a30-a69a-d95fa313e49b)

Este repositório contém diversos programas em Java que exploram o uso de vetores e estruturas de dados, abordando operações 
essenciais para o desenvolvimento eficiente de algoritmos. Entre os principais conceitos abordados, destacam-se:

- **Vetores e Arrays:** Utilizados para armazenar e manipular conjuntos de dados em um espaço de memória contínuo. Acesso rápido por índice e manipulação eficiente de elementos.
- **Estruturas condicionais:** Como `if-else`, para controle de fluxo baseado em condições específicas, determinando quais blocos de código serão executados.
- **Estruturas de repetição:** Incluindo `while` e `for`, permitindo a execução iterativa de blocos de código conforme determinado por condições lógicas ou intervalos predefinidos.
- **Iteração sobre coleções:** Facilitando a navegação e manipulação de conjuntos de dados armazenados em arrays, listas (`List`) e mapas (`Map`).
- **Uso do `Set<Integer>` e `HashSet<>()`:** Técnicas para evitar duplicidade de valores numéricos em coleções. O `Set` é uma estrutura que não permite valores duplicados, e o `HashSet<>()` é utilizado para garantir que os valores inseridos sejam únicos, oferecendo operações rápidas de adição, remoção e busca.

Além disso, os programas implementam técnicas de modularização, organizando o código em métodos reutilizáveis, 
promovendo clareza, manutenção e reutilização eficiente do código-fonte.

As estruturas de dados utilizadas incluem:

- **Arrays (`array[]`)**
  - Estruturas dinâmicas, ideais para cenários onde o tamanho da coleção pode variar.
  - Permitem inserção e remoção eficientes.

- **Mapas (`Map`)**
  - Armazenam pares chave-valor, permitindo buscas e organização de dados de forma otimizada.

- **Sets (`Set` e `HashSet<>`)**
  - Impedem a duplicação de elementos, sendo ideais para garantir unicidade em coleções de dados.

## 🔹 Recursos Adicionais

- Implementação de modularização, organizando o código em métodos reutilizáveis.
- Utilização `Scanner` para entrada de dados do usuário.

## 🔹 Benefícios do Uso de Map, List e Arrays

- O uso do `Map` se destaca como uma alternativa eficiente para substituir loops e a estrutura `switch-case`, tornando o código mais limpo, legível e de fácil manutenção.
- A combinação de `List` e `array[]` permite manipular conjuntos de dados de maneira versátil e eficiente, dependendo da necessidade da aplicação.

## 🚀 Tecnologias Utilizadas

- **Java (JDK 8+)** – Linguagem principal utilizada para o desenvolvimento dos programas.

- **Arrays (`array[]`)** – Utilização de vetores para armazenar um conjunto fixo de elementos e garantir acesso rápido por índice.

- **Listas (`List`)** – Manipulação de listas dinâmicas, permitindo a inserção e remoção eficientes de elementos.

- **Set e HashSet** – Uso de `Set<Integer>` e `HashSet<>()` para garantir a unicidade de valores e evitar duplicidade de dados numéricos.

- **Estruturas de controle** – Implementação de condicionais (`if`, `else if`, `else`) para tomada de decisões no código.

- **Estruturas de repetição** – Uso de loops (`for`, `while`) para percorrer coleções e executar operações iterativas.

- **Map e entrySet** – Utilização do `Map` para armazenar pares chave-valor e do `entrySet()` para percorrer elementos de maneira eficiente.

- **Captura de exceções** – Tratamento de erros utilizando `try-catch` para garantir maior robustez e evitar falhas inesperadas.

- **Modularização do código** – Organização do código por meio de métodos reutilizáveis, tornando a solução mais clara e fácil de manter.

## 📌 Confira meu artigo no DEV.to

Para explorar mais sobre manipulação de vetores, listas e estruturas de dados em Java, confira meu artigo no
[DEV.to](https://dev.to/vitorpaiola/lista-de-exercicios-basicos-em-java-part-8-35bm) 🚀

Neste artigo, compartilho exemplos práticos e soluções eficientes para manipulação de **arrays**, 
**listas** (`List`), **sets** (`Set`, `HashSet`) e **mapas** (`Map`), além do uso de **estruturas de repetição** 
(`for`, `while`) e **controle de fluxo** (`if-else`).

O objetivo é demonstrar boas práticas na escrita de código, abordando desde a entrada de dados 
com `Scanner` até técnicas avançadas de organização e modularização para tornar o 
código mais **eficiente e fácil de manter.**

## 📂 Estrutura do Projeto

```estrutura
📦 vetores
├── 📁 contagemNumero
│   └── ContagemNumero.java
├── 📁 contagemNumeroV2
│   └── ContagemNumeroV2.java
├── 📁 contagemNumeroV3
│   └── ContagemNumeroV3.java
├── 📁 exibirOrdemInversa
│   └── ExibirOrdemInversa.java
├── 📁 exibirOrdemInversaV2
│   └── ExibirOrdemInversaV2.java
├── 📁 maiorElementoVetor
│   └── MaiorElementoVetor.java
├── 📁 maiorElementoVetorV2
│   └── MaiorElementoVetorV2.java
├── 📁 maiorElementoVetorV3
│   └── MaiorElementoVetorV3.java
├── 📁 mediaElementosVetor
│   └── MediaElementosVetor.java
├── 📁 mediaElementosVetorV2
│   └── MediaElementosVetorV2.java
├── 📁 mediaElementosVetorV3
│   └── MediaElementosVetorV3.java
├── 📁 multiplicacaoVetores
│   └── MultiplicacaoVetores.java
├── 📁 multiplicacaoVetoresV2
│   └── MultiplicacaoVetoresV2.java
├── 📁 multiplicacaoVetoresV3
│   └── MultiplicacaoVetoresV3.java
├── 📁 segundoMaiorElemento
│   └── SegundoMaiorElemento.java
├── 📁 segundoMaiorElementoV2
│   └── SegundoMaiorElementoV2.java
├── 📁 somaElementosVetor
│   └── SomaElementosVetor.java
├── 📁 somaElementosVetorV2
│   └── SomaElementosVetorV2.java
├── 📁 somaElementosVetorV3
│   └── SomaElementosVetorV3.java
├── 📁 somaVetores
│   └── SomaVetores.java
├── 📁 somaVetoresV2
│   └── SomaVetoresV2.java
├── 📁 somaVetoresV3
│   └── SomaVetoresV3.java
├── 📁 verificarOrdemCrescente
│   └── VerificarOrdemCrescente.java
├── 📁 verificarOrdemCrescenteV2
│   └── VerificarOrdemCrescenteV2.java
├── 📁 verificarOrdemCrescenteV3
│   └── VerificarOrdemCrescenteV3.java
├── 📁 verificarParesVetor
│   └── VerificarParesVetor.java
└── 📁 verificarParesVetorV2
    └── VerificarParesVetorV2.java
```

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**
Abra o terminal e navegue até a pasta raiz do projeto. Em seguida, execute o seguinte comando para compilar o código:

```sh
javac -d . vetores/NomeDaPasta/NomeDoArquivo.java
```

### 2️⃣ **Executar**
Após a compilação, você pode executar o programa com o comando abaixo:

```sh
java vetores.NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java vetores.contagemNumero.ContagemNumero
```

## 📌 Descrição dos Programas

### 🔢 **Contagem de Ocorrências em Vetor**
**Objetivo:** Faça um programa que leia um vetor de números 
inteiros e exiba quantas vezes um número específico aparece no vetor. Usando `array`.

### 🔢 **Contagem de Ocorrências em Vetor Versão 2**
**Objetivo:** Faça um programa que leia uma lista de números inteiros e exiba quantas 
vezes um número específico aparece na lista. Usando `List`.

### 🔢 **Contagem de Ocorrências em Vetor Versão 3**
**Objetivo:** Faça um programa que leia uma lista de números inteiros e 
exiba quantas vezes um número específico aparece na lista. Usando `Map` e `EntrySet`.

---

### 🔄 **Exibição de Elementos na Ordem Inversa**
**Objetivo:** Escreva um programa que leia um vetor de números inteiros e 
exiba os elementos na ordem inversa. Usando `array`.

### 🔄 **Exibição de Elementos na Ordem Inversa Versão 2**
**Objetivo:** Escreva um programa que leia um vetor de números inteiros e 
exiba os elementos na ordem inversa. Usando `List`.

---

### 🔝 **Identificação do Maior Elemento no Vetor**
**Objetivo:** Faça um programa que leia um vetor de números inteiros e 
exiba o maior elemento presente no vetor. Usando `array`.

### 🔝 **Identificação do Maior Elemento no Vetor Versão 2**
**Objetivo:** Faça um programa que leia um vetor de números inteiros e 
exiba o maior elemento presente no vetor. Usando `List`.

### 🔝 **Identificação do Maior Elemento no Vetor Versão 3**
**Objetivo:** Faça um programa que leia um vetor de números inteiros e 
exiba o maior elemento presente no vetor. Usando `Map` e `EntrySet`.

---

### 📉 **Cálculo da Média dos Elementos no Vetor**
**Objetivo:** Escreva um programa que leia um vetor de números inteiros e 
exiba a média dos elementos. Usando `array`.

### 📉 **Cálculo da Média dos Elementos no Vetor Versão 2**
**Objetivo:** Escreva um programa que leia um vetor de números inteiros e 
exiba a média dos elementos. Usando `List`.

### 📉 **Cálculo da Média dos Elementos no Vetor Versão 3**
**Objetivo:** Escreva um programa que leia um vetor de números inteiros e 
exiba a média dos elementos. Usando `Map` e `EntrySet`.

---

### ✖️ **Multiplicação de Elementos Correspondentes em Vetores**
**Objetivo:** Escreva um programa que leia dois vetores de números inteiros com o mesmo 
tamanho e exiba um novo vetor com os elementos resultantes da multiplicação dos elementos 
correspondentes dos dois vetores. Usando `array`.

### ✖️ **Multiplicação de Elementos Correspondentes em Vetores Versão 2**
**Objetivo:** Escreva um programa que leia dois vetores de números inteiros com o mesmo 
tamanho e exiba um novo vetor com os elementos resultantes da multiplicação dos elementos 
correspondentes dos dois vetores. Usando `List`.

### ✖️ **Multiplicação de Elementos Correspondentes em Vetores Versão 3**
**Objetivo:** Escreva um programa que leia dois vetores de números inteiros com o mesmo 
tamanho e exiba um novo vetor com os elementos resultantes da multiplicação dos elementos 
correspondentes dos dois vetores. Usando `Map` e `EntrySet`.

---

### 🏅 **Identificação do Segundo Maior Elemento no Vetor**
**Objetivo:** Crie um programa que leia um vetor de números inteiros e 
encontre o segundo maior elemento presente no vetor. Usando `array`.

### 🥈 **Identificação do Segundo Maior Elemento no Vetor**
**Objetivo:** Crie um programa que leia um vetor de números inteiros e 
encontre o segundo maior elemento presente no vetor. Usando `List<Integer>`.

---

### ➕ **Soma de todos os elementos em Vetores**
**Objetivo:** Crie um programa que leia um vetor de números inteiros e 
exiba a soma de todos os elementos. Usando `array`.

### ➕ **Soma de todos os elementos em Vetores Versão 2**
**Objetivo:** Crie um programa que leia um vetor de números inteiros e 
exiba a soma de todos os elementos. Usando `List<Integer>`.

### ➕ **Soma de todos os elementos em Vetores Versão 3**
**Objetivo:** Crie um programa que leia um vetor de números inteiros e 
exiba a soma de todos os elementos. Usando `Map<Integer, Integer>` e `EntrySet`.

---

### 💡 **Soma dos Elementos Correspondentes em Vetores**
**Objetivo:** Crie um programa que leia dois vetores de números inteiros com o mesmo 
tamanho e exiba um novo vetor com a soma dos elementos correspondentes dos dois vetores. Usando `array`.

### 💡 **Soma dos Elementos Correspondentes em Vetores Versão 2**
**Objetivo:** Crie um programa que leia dois vetores de números inteiros com o mesmo 
tamanho e exiba um novo vetor com a soma dos elementos correspondentes dos dois vetores. Usando `List<Integer>`.

### 💡 **Soma dos Elementos Correspondentes em Vetores Versão 3**
**Objetivo:** Crie um programa que leia dois vetores de números inteiros com o mesmo 
tamanho e exiba um novo vetor com a soma dos elementos correspondentes dos dois vetores. 
Usando `Map<Integer, Integer>` e `EntrySet`.

---

### 📈 **Verificação de Ordem Crescente no Vetor**
**Objetivo:** Faça um programa que leia um vetor de números inteiros e 
verifique se ele está em ordem crescente. Usando `array`.

### 📉 **Verificação de Ordem Crescente no Vetor Versão 2**
**Objetivo:** Faça um programa que leia um vetor de números inteiros e 
verifique se ele está em ordem crescente. Usando `List<Integer>`.

### 📈 **Verificação de Ordem Crescente no Vetor Versão 3**
**Objetivo:** Faça um programa que leia um vetor de números inteiros e 
verifique se ele está em ordem crescente. Usando `Map<Integer, Integer>` e `EntrySet`.

---

### 🔢 **Verificação de Elementos Pares no Vetor**
**Objetivo:** Crie um programa que leia um vetor de números inteiros e 
verifique se todos os elementos são pares. Usando `array`.

### 🔢 **Verificação de Elementos Pares no Vetor Versão 2**
**Objetivo:** Crie um programa que leia um vetor de números inteiros e 
verifique se todos os elementos são pares. Usando `List<Integer>`.

## 📌 Quer acompanhar mais dicas e novidades sobre Java?

🔔 Fique por dentro de tudo sobre Java! Me siga no [Twitter](https://x.com/v__souz) para receber dicas, 
novidades e atualizações! 🚀✨

---

### 📜 **Licença**
Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**
Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos 
programas ou funcionalidades, sinta-se à vontade para abrir um Pull Request. 
Estou ansioso para ver suas melhorias! 😃
