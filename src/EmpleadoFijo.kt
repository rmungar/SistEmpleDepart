/**
 * Clase EmpleadoFijo que toma como parametros heredados:
 * @param nombre -> Cadena con el nombre del empleado
 * @param ID -> Combinación numérica única para cada empleado
 * Y como parámetros exclusivos:
 * @param salarioFijo -> Entero que representa lo que cobra el empleado
 * @param numPagas -> Entero que representa las veces que se ha de dividir el salarioFijo
 */

class EmpleadoFijo(nombre:String, iD:Int, val salarioFijo: Int, val numPagas: Int) :Empleado(nombre, iD){

    override fun calcularSalario(): Double {
        return (salarioFijo.toDouble()/numPagas.toDouble())
    }

    override fun toString(): String {
        return super.toString()
    }
}