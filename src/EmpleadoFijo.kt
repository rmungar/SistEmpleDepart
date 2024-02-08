class EmpleadoFijo(nombre:String, iD:Int, val salarioFijo: Int, val numPagas: Int) :Empleado(nombre, iD){

    override fun calcularSalario(): Double {
        return (salarioFijo.toDouble()/numPagas.toDouble())
    }
}