package innerClass
//class ClassePrincipal {
//    var descricao1 = "Classe Principal"
//    class aninhada {
//        var descricao2 = "Classe Aninhada"
//        fun teste(): String {
//            return ""
//        }
//    }
//    inner class ClasseDeDentro {
//        var descricao3 = "Classe de Dentro"
//        fun teste(): String {
//            return descricao1
//        }
//    }
//}

data class JogadorSelecao(val nome: String, val posicao: String, val numero: Int) {
    inner class GravidadeLesao2(val nivelGravidade: Int)
    class Lesoes(val jogadoresLesionados: MutableList<String> = mutableListOf()) {
        inner class GravidadeLesao(val nivelGravidade: Int) {
        }
    }
}

fun main() {
    val lesoes = JogadorSelecao.Lesoes(jogadoresLesionados = mutableListOf("Messi"))
    val gravidadeLesao: JogadorSelecao.Lesoes.GravidadeLesao =
        JogadorSelecao.Lesoes().GravidadeLesao(nivelGravidade = 1)

    val gravidadeLesao2: JogadorSelecao.GravidadeLesao2 =
        JogadorSelecao(nome = "Messi", "ATA", numero = 10).GravidadeLesao2(nivelGravidade = 2)

    println(gravidadeLesao2.nivelGravidade)

}