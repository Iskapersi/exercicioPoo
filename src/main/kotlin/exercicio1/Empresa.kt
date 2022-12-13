package exercicio1

class Empresa (
        var nomeEmpresa: String,
        val cnpj: String,
        val segmento:String,
        val endereco: String,
        private val listaFuncionarios: MutableList<Funcionario> = mutableListOf()
        ) {
        override fun toString(): String {
                return """             
Nome da exercicio1.Empresa: $nomeEmpresa
CNPJ: $cnpj
Segmento: $segmento
Endereço: $endereco
                """.trimIndent()
        }



        fun adicionarFuncionario (funcionario: Funcionario) {
                listaFuncionarios.add(funcionario)
        }

        fun mostrarFuncionarios () {
                println(listaFuncionarios.toList())
        }

        fun buscarFuncionario (nome: String) {
        }

        fun removerFuncionario (nome: String) {

        }

}
