package exercicio1

class Endereco (
    val logradouro: String,
    val numero: String,
    val bairro: String,
    val cep: String,
    val cidade: String,
    val estado: String
        ) {
    override fun toString(): String {
        return """
            Rua: $logradouro
            Número: $numero
            Bairro: $bairro
            Cep: $cep
            Cidade: $cidade
            Estado: $estado
        """.trimIndent()
    }



}