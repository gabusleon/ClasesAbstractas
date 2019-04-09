# Clases Abstractas

Las clases abstractas tienen la característica especial de que pueden coexistir constructores, métodos y atributos de una clase regular con la definición de métodos abstractos sin ningún tipo de implementación. Por otro lado las clases abstractas solo sirven como clases base o superclases dentro de la herencia, por lo tanto no se pueden crear objetos o instancias de dichas clases. 
En el lenguaje Java, para definir que una clase es abstracta se coloca la palabra reservada abstract antes del nombre de la clase. En cuanto a la definición de los métodos abstractos, los mismos también deben utilizar la palabra abstract antes de cada uno de sus nombres.
La herencia se utiliza normalmente para la reutilización de código de las superclases en la clases derivadas, pero otro uso muy importante dentro de la Programación Orientada a Objetos es la reutilización de conceptos o la sobreescritura de los métodos definidos en las clases bases, por lo tanto si a las clases base no se las va a utilizar directamente creando instancias, sino como un concepto que ayude a las clases derivadas, entonces ahí conviene definir a las clases base como abstractas.
Para representar una clase abstracta en UML, la única diferencia con las clases regulares es que el nombre de la clase se debe escribir en cursiva. 

Referencia: Ortiz M. y Plaza A., Programación orientada a objetos con Java y UML, Universidad Politécnica Salesiana, 2013.

En este proyecto se utiliza un ejemplo sobre Empleados para demostrar la las clases y métodos abstractos.
