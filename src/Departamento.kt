class Departamento(val nombre: String) {
    val empleados = mutableListOf<Empleado>()

    fun agregarEmpleado(empleado: Empleado){
        empleados.add(empleado)
    }
    fun calcularSalarioTotal():Double{
        var total = 0.00
        for (empleado in empleados){
            total += empleado.calcularSalario()
        }
        return total
    }
}