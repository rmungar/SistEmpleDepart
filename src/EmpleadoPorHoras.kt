class EmpleadoPorHoras(nombre: String, iD: Int, val horasTrabajadas: Int, val tarifaPorHoras: Int) : Empleado(nombre, iD){

    override fun calcularSalario(): Double {
        return (horasTrabajadas*tarifaPorHoras).toDouble()
    }
}