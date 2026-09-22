# Ejercicio 2: Test parametrizado

## 📌 Enunciat del exercici
Crea una clase llamada CalculoDnique contenga un método público para calcular la letra correspondiente de un DNI, dado el número (sin letra).

Crea una clase de test con JUnit 5 que parametrice una serie de pruebas para validar el correcto comportamiento del cálculo.

El test debe comprobar como mínimo 10 casos de números de DNI distintos con su letra correspondiente, validando que el resultado del método coincide con el valor esperado.

También se deben validar valores inválidos , como números negativos o demasiado grandes, para comprobar que el método gestiona correctamente estas situaciones (por ejemplo, lanzando una excepción).

## ✨ Funcionalitats
- @ParameterizedTest

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Execution
- #### He creado las clases necesarias: 
- Dni con el dni
- ConsoleReader con un readString para pillar excepciones
- CalculoDni con le metodo que hay que comprobar
- El Main para llamar el metodo