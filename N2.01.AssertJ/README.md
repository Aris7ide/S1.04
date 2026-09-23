# Nivell 2: AssertJ

## 📌 Enunciat del exercici
En aquest nivell aprendrem a utilitzar AssertJ, una biblioteca de testing que ens permet escriure assercions més expressives i llegibles que les assercions tradicionals de JUnit.

Cada exercici proposat se centra en una funcionalitat diferent d’AssertJ. Et recomanem consultar la documentació oficial si necessites ajuda addicional durant la pràctica.

## ✨ Funcionalitats
- AssertJ

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
## Ejercicio 1
Una aserción que demuestre que el valor de dos objetos enteros es igual, y otra que indique que no lo es.
- Creo la clase para meter los metodos y el test de la misma
## Ejercicio 2 y 3
Una aserción que demuestre que la referencia a un objeto es la misma que otra, y otra que indique que es distinta.

Una aserción que indique que dos arrays de enteros son idénticos.

- #### He creado el primer test checkEquals() y me he dado cuenta de que no necesito la clase methodsClass para hacer tests ya que puedo crear los objetos necesarios directamente en los tests
- #### Creado el test checkReference y checkArrays
## Ejercicio 4
Crea un arrayList contenedor de varios tipos de objetos (créalos también). 
- Escribe una aserción para verificar el orden de los objetos en ArrayList según han sido insertados.
- Verifica ahora que la lista anterior contiene los objetos en cualquier orden.
- Verifica que en la lista anterior uno de los objetos se ha añadido sólo una vez. Deja uno de los elementos sin añadir, y verifica que la lista no contiene éste último.
- #### He creado el test checkArrayElements y hecho las 4 pruebas con .containsExactly, .containsExactlyInAnyOrder, .containsOnlyOnce y .doesNotContain
- #### Para hacer esta prueba he tenido que crear las 4 clases Bajo,Guitar,Piano,Ukulele y la superclase Instrument
## Ejercicio 5
Crea un mapa y verifica que contiene una de las key que le añade.
- #### He creado el test checkMap() y con .containsKey() he probado que haya una Key creada
## Ejercicio 6
Provoca una ArrayIndexOutOfBoundsExceptionen una clase cualquiera. Crea una aserción que valide que la excepción es arrojada cuando corresponde.
- #### He creado el test checkException() and the class exceptionClass with a method calling a position that doesn't exist
- #### Asserted through assertThatThrownBy().isInstanceOf(IndexOutOfBoundException.class)
## Ejercicio 7
Crea un objeto Optionalvacío. Escribe la aserción correcta para verificar que efectivamente está vacío.
- #### I have just created a test with an empty List and checked with assertThat().isEmpty