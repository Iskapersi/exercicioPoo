package aula8

import aula8.Dificuldade.*

class Questao<T>(val enunciado: String, val resposta: T, val dificuldade: Dificuldade) {
    fun mostraResposta() {

        if (resposta is Boolean) {
            println("""
            Enunciado: $enunciado
            Resposta: ${if (resposta) "Verdadeiro" else "Falso"}
            Dificuldade: $dificuldade
        """.trimIndent())

        } else{
            println("""
            Enunciado: $enunciado
            Resposta: $resposta
            Dificuldade: $dificuldade
        """.trimIndent())
        }
    }
}

enum class Dificuldade {
    FACIL, MEDIO, DIFICIL
}

fun main() {
    val questao1 = Questao(enunciado = "A soma de 423 e 1234 é 2", resposta = false, dificuldade = FACIL)

    val questao2 = Questao(enunciado = "2 + 2 = ???", resposta = 4, dificuldade = MEDIO)

    val questao3 = Questao(enunciado = "Quem descobriu o Brasil?", resposta = "Pedro Álvares Cabral", dificuldade = DIFICIL)

    questao1.mostraResposta()
    questao2.mostraResposta()
    questao3.mostraResposta()
}