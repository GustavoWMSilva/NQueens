# README.md

## Problema das N-Rainhas

Este repositório contém a explicação e o exemplo da resolução do problema das N-Rainhas utilizando o método de backtracking. O objetivo é posicionar N rainhas em um tabuleiro NxN de forma que nenhuma rainha ataque outra. 

### Introdução

O problema das N-Rainhas consiste em posicionar N rainhas em um tabuleiro NxN de maneira que nenhuma rainha esteja na mesma linha, coluna ou diagonal que outra. Este problema é um clássico exemplo de problema que pode ser resolvido por backtracking, uma técnica que busca todas as soluções possíveis por meio da exploração de cada decisão de forma recursiva.

### Formalização do Problema

- O tabuleiro é representado como uma matriz NxN.
- Cada posição no tabuleiro pode ser identificada por coordenadas (i, j), onde i é a linha e j é a coluna.
- Duas rainhas estão na mesma diagonal se a diferença ou soma de suas coordenadas for igual.

#### Condições

1. Duas rainhas não podem estar na mesma linha ou coluna.
2. Duas rainhas não podem estar na mesma diagonal.

### Algoritmo de Backtracking

#### Passo 1: Representação do Tabuleiro

- Considere que `x1, x2, ..., xn` representam uma solução onde `xi` é a coluna da i-ésima linha onde a i-ésima rainha será colocada.
- Os valores de `xi` serão distintos, pois não podemos ter duas rainhas na mesma coluna.

#### Passo 2: Verificação de Diagonais

- Para garantir que duas rainhas não estão na mesma diagonal, considere a matriz `a[1:n, 1:n]`.
- Elementos na mesma diagonal do canto superior esquerdo ao canto inferior direito têm o mesmo valor da subtração linha - coluna.
- Elementos na mesma diagonal do canto superior direito ao canto inferior esquerdo têm o mesmo valor da soma linha + coluna.

#### Exemplo

Considere uma rainha na posição (4, 2):

- Os quadrados na diagonal do canto superior esquerdo ao canto inferior direito são: (3,1), (5,3), (6,4), (7,5), (8,6). Todos têm a diferença linha - coluna igual a 2.
- Os quadrados na diagonal do canto superior direito ao canto inferior esquerdo são: (1,5), (2,4), (3,3), (5,1). Todos têm a soma linha + coluna igual a 6.

Duas rainhas estão na mesma diagonal se:

- `i - j = k - l` ou `i + j = k + l`, onde `i, j` são as coordenadas de uma rainha e `k, l` são as coordenadas de outra rainha.

### Implementação do Algoritmo

1. **Inicialização**:
   - Crie um array `x` para armazenar a posição das rainhas.
   - Crie uma lista `solutions` para armazenar todas as soluções encontradas.

2. **Função de Verificação**:
   - A função `place(k, i)` verifica se a k-ésima rainha pode ser colocada na coluna `i` sem atacar as rainhas já posicionadas.

3. **Função Recursiva**:
   - A função `nQueens(k, n, first)` tenta posicionar a k-ésima rainha e chama a si mesma recursivamente para posicionar as próximas rainhas.

4. **Impressão das Soluções**:
   - A função `printSolutions()` imprime todas as soluções encontradas.

### Exemplo de Execução

#### Entrada

- Tamanho do tabuleiro: 8x8
- Número de rainhas: 8

#### Saída

- Soluções encontradas:

```plaintext
1 5 8 6 3 7 2 4 
1 6 8 3 7 4 2 5 
1 7 4 6 8 2 5 3 
...
Soluções Encontradas = 92
```

#### Representação Visual

Para ilustrar a solução, considere a representação visual do tabuleiro 8x8 com a configuração das rainhas. Cada linha abaixo representa a posição das rainhas em uma solução específica. O número representa a coluna onde a rainha está posicionada para aquela linha.

##### Exemplo de Solução

```plaintext
1 5 8 6 3 7 2 4
```

Representação visual:

```plaintext
. Q . . . . . .
. . . . Q . . .
. . . . . . . Q
. . . . . Q . .
. . Q . . . . .
. . . . . . Q .
. Q . . . . . .
. . . Q . . . .
```

### Explicação do Exemplo

Para um tabuleiro 8x8, o algoritmo encontra 92 soluções diferentes onde as 8 rainhas podem ser posicionadas de modo que nenhuma rainha ataque outra. Cada linha da saída representa uma configuração diferente das rainhas no tabuleiro.

### Referências

- Material de apoio e notas de aula sobre algoritmos de backtracking e o problema das N-Rainhas.
- "Introduction to Algorithms" de Cormen, Leiserson, Rivest, and Stein.

### Contato

Para mais informações, entre em contato com os desenvolvedores.

---

Este trabalho foi realizado como parte da disciplina de Algoritmos e Estruturas de Dados, sob a orientação do professor Scopel.
