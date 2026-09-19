# 📌 Ejercicio 1: Tests unitarios con JUnit

## 📌 Enunciado
Crea una clase Java que gestione una colección de libros de una biblioteca. Esta clase debe ofrecer las siguientes funcionalidades:

- Añadir libros a la colección.
- Recuperar la lista completa de libros (siguiendo el comando de inserción).
- Obtener el título de un libro a partir de su posición.
- Añadir un libro en una posición específica en la colección.
- Eliminar un libro por su título.
- Devolver una copia de la lista ordenada alfabéticamente .

Implementa test unitarios con JUnit 5 para validar el comportamiento de la clase. Asegúrate de cubrir, como mínimo, los siguientes casos:


- La colección no debe ser nula después de instanciar la clase.
- El tamaño de la colección es correcto después de añadir varios libros.
- Los libros se encuentran en la posición esperada una vez añadidos.
- El método para obtener un libro por posición devuelve el título correcto.
- Añadir un libro en una posición concreta modifica correctamente la colección.
- Eliminar un libro por el título reduce el tamaño de la colección.
- La lista ordenada devuelve los libros en orden alfabético (sin modificar la colección original).
- No deben permitirse libros con títulos duplicados.

## ✨ Funcionalitats
- Junit

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **Test**: Junit
- **IDE**: IntelliJ IDEA

## Execution
- He creado toda la estructura con Main, model, Service, ConsoleReader y ConsoleUI
- He empezado a crear un menu y metodos tipo readInt() para pillar exceptions.
- He cambiato el ArrayList por un HashMap para poder dar posiciones a los libros
- 