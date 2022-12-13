package getSet

import getSet.Materia.*
import getSet.Dia.*

enum class Dia (val nome: String, val abreviacao: String) {
    DOMINGO (nome = "Domingo", abreviacao = "dom"),
    SEGUNDA (nome = "Segunda", abreviacao = "seg"),
    TERCA (nome = "Terça", abreviacao = "ter"),
    QUARTA (nome = "Quarta", abreviacao = "qua"),
    QUINTA (nome = "Quinta", abreviacao = "qui"),
    SEXTA (nome = "Sexta", abreviacao = "sex"),
    SABADO (nome = "Sábado", abreviacao = "sab")
}

enum class Materia (val nome: String, val diasDeAula: List<String>) {

    PORTUGUES(nome= "Português", diasDeAula = listOf(SEGUNDA.abreviacao, QUARTA.abreviacao, SEXTA.abreviacao)),
    MATEMATICA(nome = "Matemática", diasDeAula = listOf("ter", "qui")),
    GEOGRAFIA(nome = "Geografia", diasDeAula = listOf("seg")),
    CIENCIAS(nome = "Ciências", diasDeAula = listOf("ter", "qui"));

    override fun toString(): String {
        return """
            $nome nos dias ${diasDeAula.joinToString(separator = " | ", prefix = "(", postfix = ")")}
        """.trimIndent()
    }
}

data class Professor (val id: Int, val nome: String, val sobrenome: String, val materias: List<Materia>) {

    override fun toString(): String {
        return """
            O professor $nome $sobrenome de número identificador #$id leciona as aulas ${materias.joinToString()}.
        """.trimIndent()
    }
}

fun main() {
//    val professorDePortugues = Professor (id = 100, nome = "Roberto", sobrenome = "Cunha", materias = listOf(Materia.PORTUGUES))
    val professorDePortugues = Professor (id = 100, nome = "Roberto", sobrenome = "Cunha", materias = listOf(PORTUGUES, MATEMATICA, CIENCIAS, GEOGRAFIA))

    println(professorDePortugues)
}