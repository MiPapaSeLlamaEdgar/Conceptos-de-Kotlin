//README.MD//

1. Variables
En Kotlin, las variables se pueden declarar usando las palabras clave var para variables mutables (cuyo valor puede cambiar) y val para variables inmutables (constantes).

Variables Mutables (var)
Variables Inmutables (val)

2. Constantes
En el nivel superior o en objetos, puedes usar const val para definir constantes que son conocidas en tiempo de compilación y no pueden ser modificadas. const val solo puede usarse con tipos básicos como String, Int, etc.

3. Opcionales y Nulos
Kotlin maneja la nulidad de una manera muy segura mediante el sistema de tipos. Para declarar una variable que pueda contener un valor nulo, se debe especificar explícitamente añadiendo un signo de interrogación ? al tipo de la variable.

Nullable (Puede ser nulo)

Para trabajar con valores que pueden ser nulos, Kotlin ofrece varias herramientas para manejar la seguridad contra nulos:

Operador de llamada segura (?.): Permite acceder a un método o propiedad de un objeto nullable de manera segura. Si el objeto es null, no se realiza la llamada y el resultado es null.
Operador Elvis (?:): Permite proporcionar un valor por defecto en caso de que la expresión a la izquierda sea null.
Operador de afirmación no nula (!!): Convierte cualquier valor a un tipo no nulo, lanzando una excepción NullPointerException si el valor es null.