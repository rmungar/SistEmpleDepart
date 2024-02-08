abstract class Empleado (val nombre:String, val ID: Int){
    init {
        require(nombre.isNotBlank()) {"El nombre no puede estar vacío"}
        require(ID > 0) {"El ID no puede ser negativo"}
    }
    abstract fun calcularSalario():Double

    override fun toString(): String {
        return "${nombre.replaceFirstChar { it -> it.uppercase() }} con ID - ${"%04d".format(ID)} tiene un salario de ${"%2d".format(calcularSalario())} al mes"
    }
}