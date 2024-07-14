// VARIABLE MUTABLE
var edad = 30
edad = 31  // El valor de 'edad' puede ser modificado

// VARIABLE INMUTABLE
val nombre = "Juan"
// nombre = "Pedro"  // Esto daría error porque 'nombre' es una constante

// CONSTANTE
// Las constantes deben estar en el contexto de un objeto o un 'companion object' si están dentro de una clase.
object Constantes {
    const val PI = 3.14
}

// OPCIONALES Y NULOS

// Nullable
var apellido: String? = "Pérez"
apellido = null  // Esto es permitido porque 'apellido' es nullable

// Operador de llamada segura (?.):
var longitud = apellido?.length  // 'longitud' será null si 'apellido' es null

// Operador Elvis (?:)
var longitudSegura = apellido?.length ?: 0  // Si 'apellido' es null, 'longitudSegura' será 0

// Operador de afirmación no nula (!!):
var longitudForzada = apellido!!.length  // Lanza NullPointerException si 'apellido' es null
