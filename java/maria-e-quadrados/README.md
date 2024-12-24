# Contagem de Quadrados Perfeitos

Este projeto resolve o problema de contar o número de quadrados perfeitos em um intervalo definido por dois números inteiros \(A\) e \(B\). O problema é frequentemente utilizado como exercício em entrevistas e plataformas como HackerRank.

## 📋 Descrição do Problema

Maria recebe dois inteiros \(A\) e \(B\) e deve contar quantos **quadrados perfeitos** existem no intervalo \([A, B]\), incluindo os limites do intervalo.

Um **quadrado perfeito** é um número inteiro que pode ser expresso como o quadrado de outro número inteiro. Exemplos de quadrados perfeitos:
- \(1 = 1^2\)
- \(4 = 2^2\)
- \(9 = 3^2\)
- \(16 = 4^2\)

## 🔢 Formato de Entrada

1. Um número inteiro \(T\), representando o número de casos de teste.
2. Para cada caso de teste, dois inteiros \(A\) e \(B\) (separados por um espaço) indicando o intervalo.

### Restrições:
- \(1 < T < 100\)
- \(1 =< A =< B =< 10 ^9)

## 🖨️ Formato de Saída

Para cada caso de teste, imprima o número de quadrados perfeitos no intervalo \([A, B]\) em uma nova linha.

## 🧮 Exemplo de Entrada e Saída

### Entrada:
- 2 3 9 17 24


### Saída:
- 2 0

### Explicação:
- No primeiro caso (3  a 9), os quadrados perfeitos no intervalo são 4  4 e  9  9, totalizando 2.
- No segundo caso ( 17 a 24), nenhum número do intervalo é um quadrado perfeito, totalizando 0.