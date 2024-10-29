# Bayes-Calculator

Este projeto foi feito na IDEA IntelliJ [^1].

Objetivo: Estudar e praticar Métodos Probabilísticos

## Teorema de Bayes

Matematicamente, o Teorema de Bayes é:

\[
P(A|B) = \frac{P(B|A) \times P(A)}{P(B)}
\]

Onde:
- \( P(A|B) \) é a probabilidade de \( A \) acontecer dado que \( B \) aconteceu.
- \( P(B|A) \) é a probabilidade de observar \( B \) dado que \( A \) é verdadeiro.
- \( P(A) \) é a probabilidade inicial de \( A \) ocorrer.
- \( P(B) \) é a probabilidade de \( B \) ocorrer.


## Explicação do Código

- Componentes Gráficos: Cada botão representa um exemplo e calcula a probabilidade quando pressionado.
- Cálculos de Probabilidade: Funções como `calculateEmailSpam()`, `calculateDiseaseDetection()`, etc., contêm os valores e cálculos específicos para cada exemplo.
- resultArea: Mostra os resultados e explicações dos cálculos, permitindo uma compreensão imediata do usuário.

[^1]: Criado para estudo da Universidade.
