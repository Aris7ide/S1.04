# Ejercicio 3: Control de Excepciones

## 📌 Enunciat del exercici
Crea una clase Java que contenga un método público que provoque una excepción del tipo ArrayIndexOutOfBoundsException. Este método puede, por ejemplo, intentar acceder a una posición inexistente de un array.

A continuación, implementa una clase de test con JUnit 5 que verifique que el método arroja la excepción esperada cuando se dan las condiciones correspondientes.

## ✨ Funcionalitats
- Exceptions and testing

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Execution
- he creado una clase methodClass con un método checkExceptions() que llama a un elemento en un List que no existe.
- he creado la página de testing y llamando el método sale la excepción IndexOutOfBoundaries
- le he puesto en el test assertThrows(IndexOutOfBoundException.class, () -> {AQUI LLAMO AL METODO QUE TIENE QUE LANZAR EL ERROR();});