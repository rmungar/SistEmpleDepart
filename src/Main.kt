fun main() {

        val deparatamento = Departamento("DATA CLASS")
        val emp1: Empleado = EmpleadoFijo("Diego", 1,150000,12)
        val emp2: Empleado = EmpleadoPorHoras("Tomas", 2, 90, 74)
        deparatamento.agregarEmpleado(emp1)
        deparatamento.agregarEmpleado(emp2)
        deparatamento.empleados.forEach { println(it.toString()) }
}