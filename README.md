# Verifica Red de Interconexión

## Problem

Una red de interconexión posee una topología específica mediante la cual procesadores y/o módulos de memoria se interconectan.

La Figura 1 muestra tres topologías comunes de redes de interconexión: anillo, estrella y malla de conexión completa.

![Figura 1](https://github.com/danoespinoza/VerificaRedInterconexion/blob/master/grafos/figura1.png)

Dada una matriz de adyacencia A[n][n] (n>3) de un grafo que modela una red de interconexión con alguna de las topologías dadas en el Figura 1, se debe determinar cuál de estas topologías, si es que existe en el grafo, representa la matriz A.

## Output example

```
============================
=========INICIO=============
============================
Ruta del archivo: 
/media/data/workspaces/VerificaRedInterconexion/grafos/graf1.dat
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 1 1 1 1 1 
1 1 0 1 1 1 1 
2 1 1 0 1 1 1 
3 1 1 1 0 1 1 
4 1 1 1 1 0 1 
5 1 1 1 1 1 0 

Full: Si.
Estrella: No.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 1 1 1 1 1 
1 1 0 1 1 1 1 
2 1 1 0 1 1 1 
3 1 1 1 0 1 0 
4 1 1 1 1 0 1 
5 1 1 1 1 1 0 

Full: No.
Estrella: No.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 1 1 1 1 1 
1 1 0 1 1 1 1 
2 1 1 1 1 1 1 
3 1 1 1 0 1 1 
4 1 1 1 1 0 1 
5 1 1 1 1 1 0 

Full: No.
Estrella: No.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 0 1 0 0 0 
1 0 0 1 0 0 0 
2 1 1 0 1 1 1 
3 0 0 1 0 0 0 
4 0 0 1 0 0 0 
5 0 0 1 0 0 0 

Full: No.
Estrella: Si.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 0 1 0 0 0 
1 0 0 1 0 0 0 
2 1 1 0 1 1 1 
3 0 0 1 0 0 0 
4 0 0 1 0 0 1 
5 0 0 1 0 0 0 

Full: No.
Estrella: No.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 1 1 1 1 1 
1 1 0 0 0 0 0 
2 1 0 0 0 0 0 
3 1 0 0 0 0 0 
4 1 0 0 0 0 0 
5 1 0 0 0 0 0 

Full: No.
Estrella: Si.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 0 0 0 0 1 
1 0 0 0 0 0 1 
2 0 0 0 0 0 1 
3 0 0 0 0 0 1 
4 0 0 0 0 0 1 
5 1 1 1 1 1 0 

Full: No.
Estrella: Si.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 0 0 0 1 0 
1 0 0 0 0 1 0 
2 0 0 0 0 1 0 
3 0 0 0 0 1 0 
4 1 1 1 1 0 1 
5 0 0 0 0 1 0 

Full: No.
Estrella: Si.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 1 0 0 0 1 
1 1 0 1 0 0 0 
2 0 1 0 1 0 0 
3 0 0 1 0 1 0 
4 0 0 0 1 0 1 
5 1 0 0 0 1 0 

Full: No.
Estrella: No.
Anillo: Si.
============================
Dimension: 4

Matriz de adyacencia: 
  0 1 2 3 
0 0 1 0 1 
1 1 0 1 0 
2 0 1 0 1 
3 1 0 1 0 

Full: No.
Estrella: No.
Anillo: Si.
============================
Dimension: 4

Matriz de adyacencia: 
  0 1 2 3 
0 0 1 1 0 
1 1 0 0 1 
2 1 0 0 1 
3 0 1 1 0 

Full: No.
Estrella: No.
Anillo: Si.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 1 0 1 0 1 
1 1 0 1 0 0 0 
2 0 1 0 1 0 0 
3 1 0 1 0 1 0 
4 0 0 0 1 0 1 
5 1 0 0 0 1 0 

Full: No.
Estrella: No.
Anillo: No.
============================
Dimension: 6

Matriz de adyacencia: 
  0 1 2 3 4 5 
0 0 1 1 0 0 0 
1 1 0 1 0 0 0 
2 1 1 0 0 0 0 
3 0 0 0 0 1 1 
4 0 0 0 1 0 1 
5 0 0 0 1 1 0 

Full: No.
Estrella: No.
Anillo: Si.
============================
===========FIN==============
============================
```
