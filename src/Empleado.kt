/**
 * Clase abstracta Empleado que toma como parametros:
 * @param nombre -> Cadena con el nombre del empleado
 * @param ID -> Combinación numérica única para cada empleado
 */

abstract class Empleado (val nombre:String, val ID: Int){
    init {
        require(nombre.isNotBlank()) {"El nombre no puede estar vacío"}
        require(ID > 0) {"El ID no puede ser negativo"}
    }
    abstract fun calcularSalario():Double

    override fun toString(): String {
        return "${nombre.replaceFirstChar { it -> it.uppercase() }} con ID - ${"%04d".format(ID)} tiene un salario de ${calcularSalario()}€ al mes"
    }
}