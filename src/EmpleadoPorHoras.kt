/**
 * Clase EmpleadoPorHoras que toma como parametros heredados:
 * @param nombre -> Cadena con el nombre del empleado
 * @param ID -> Combinación numérica única para cada empleado
 * Y como parámetros exclusivos:
 * @param horasTrabajadas -> Entero que representa el número de horas
 * @param tarifaPorHoras -> Entero que representa las veces que se ha de dividir el salarioFijo
 */
class EmpleadoPorHoras(nombre: String, iD: Int, val horasTrabajadas: Int, val tarifaPorHoras: Int) : Empleado(nombre, iD){

    override fun calcularSalario(): Double {
        return (horasTrabajadas*tarifaPorHoras).toDouble()
    }

    override fun toString(): String {
        return super.toString()
    }
}