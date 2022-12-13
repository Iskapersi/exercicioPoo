package exercicio1

class Funcionario (
    val nome: String,
    val cpf: String,
    val email: String,
    var cargo: String,
    var salario: Double = 0.00
) {

    fun mudarCargoSalario () {
        println("Digite o novo cargo")
        val novoCargo = readln().lowercase()
        println("Digite o novo salario ou deixe em branco para o padrão:")
        val novoSalario = readln().toDoubleOrNull()
        if (novoSalario == null) {
            this.salario = when (novoCargo) {
                "gerente" -> 5000.00
                "motorista" -> 1800.00
                else -> this.salario
            }
        } else {
            this.salario = novoSalario
        }
    }


    override fun toString(): String {
        return """
Nome: $nome
Cpf: $cpf
E-mail: $email
Cargo: $cargo
Salário: $salario
""".trimIndent()
    }

}