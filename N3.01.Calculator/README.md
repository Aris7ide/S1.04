# Nivel 3: TDD — Desarrollo Guiado por Pruebas

## 📌 Enunciat del exercici
En este ejercicio trabajaremos con Test-Driven Development (TDD) para construir paso a paso una calculadora con estado interno .

Este enfoque nos ayudará a entender cómo escribir una prueba a la vez nos permite modelar mejor las clases y asegurar su correcta funcionalidad.

Objetivo
Aprender a aplicar el ciclo Red → Green → Refactor para diseñar una clase de forma iterativa, empezando por las necesidades expresadas en cada test.

Ejercicio 1: Calculadora

Implementaremos una clase llamada Calculatorque gestiona un total acumulado , inicialmente 0, y que ofrece operaciones como sumar, restar, multiplicar, dividir y reiniciar.

## ✨ Funcionalitats
- TDD
- AssertJ / Junit5

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- he creado la clase Calculator y la clase test y empezado con el checkear que al llamar calculadora empeza en 0
- para que el primer test pase le he dado a Calculator un atributo int Total y lo he inicializado con 0
- he hecho el test checkAdd() llamando un metodo operationAdd() y luego en Calculator he añadido el metodo
- lo mismo con el test checkSubtract(), checkMultiply() y checkDivide()
- usando assertThatThrownBy() el test me confirma que lanza una ArithmeticException