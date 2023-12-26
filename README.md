# Cheksum Suma de Verificacion

## Team Members

- Santiago Arboleda
- Daron Mercado
- Camilo Bueno

[![Review ](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://docs.google.com/document/d/1_KQW95rhOznHlsKN-rQxLWTCCLBbxN7s/edit)

## Overview
En este informe, se presenta el análisis de los resultados obtenidos de la experimentación realizada con algoritmos de checksum en el proyecto. El objetivo es evaluar el rendimiento de los algoritmos en diferentes situaciones y comparar los resultados con la complejidad teórica esperada.

## Algoritmos Implementados

Se implementaron dos algoritmos de checksum: SingleChecksum y DualChecksum.

## Experimentación

### Conjuntos de Datos Utilizados

Se utilizaron conjuntos de datos de diferentes tamaños:
- Toy: n < 102
- Pequeñas: 102 < n < 104
- Medianas: 104 < n < 105
- Grandes: n > 106


## Análisis de Datos


### [Visualizacion de datos](https://github.com/Bloque-CED/2023-2t2-teame13/blob/main/doc/GraphicsTI2.ipynb)

### Gráficos de Tiempo vs Tamaño de Entrada

Se generaron gráficos de barras que muestran la variación del tiempo de ejecución en función del tamaño de entrada para cada algoritmo.


## Funcionalidades

1. **Carga de datos desde un archivo:**
    - Método: `loadFromTxt` en la clase `Reader`.
    - Se encarga de cargar datos desde un archivo.

2. **Cálculo del checksum individual:**
    - Método: `calculateChecksum` en la clase `SingleChecksum` y `DualChecksum`.
    - Se encarga de calcular el checksum individual a partir de una palabra.

3. **Ejecución del experimento:**
    - Método: `runExperiment` en la clase `Controller`.
    - Se encarga de ejecutar el experimento que involucra el cálculo del checksum individual y dual para una lista de palabras.

4. **Escritura de resultados:**
    - Método: `writeResults` en la clase `Writter`.
    - Se encarga de escribir los resultados en archivos de salida.

## Instrucciones de Ejecución

1. Asegúrate de tener el entorno de ejecución adecuado (por ejemplo, Java, Scala).
2. Clona el repositorio a tu máquina local.
3. Ejecuta el archivo `Main` desde el paquete `ui`.
4. Tambien, puedes ver los diversos Test yendo a la carpeta  en el src.

## INDICADORES DE CALIDAD

|Indicadores de Calidad|     |                    |      |
|:----|:----|:-------------------|:-----|
| |     |                    |      |
|TOTAL DE FALLOS: | 0   | Densidad de fallos | 0%   |
|TOTAL DE PRUEBAS:| 116 | 0/116              |      |
| |     |                    |      |
| | 1   | Confiabilidad      | 100% |
|Densidad de fallos:| 0   | 1 - 0              |      |
| |     |                    |      |
|TOTAL DE PRUEBAS:| 116 | Completitud        | 29%  |
|TOTAL DE FUNCIONALIDADES:| 4   | 35/4               |      |
