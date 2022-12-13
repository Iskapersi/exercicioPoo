package aula7

import aula7.Cor.*

interface AcaoCliqueBotao {
    fun clique()
    fun cliqueLongo()
    fun duploClique()
}

enum class Cor{
    VERDE, VERMELHO, CINZA
}

class Botao (val texto: String, val cor: Cor, val acaoCliqueBotao: AcaoCliqueBotao? = null)

fun main() {
    val botaoConfirmar = Botao(texto = "Confirmar", cor = VERDE, acaoCliqueBotao = object : AcaoCliqueBotao{
        override fun clique() {
            println("Clique no botão resetar!")
        }

        override fun cliqueLongo() {
            println("Clique longo no botão resetar!")
        }

        override fun duploClique() {
            println("Clique duplo no botão resetar!")
        }
    })

    val botaoNeutro = Botao(texto = "Confirmar", cor = CINZA, acaoCliqueBotao = object : AcaoCliqueBotao {
        override fun clique() {
            println("Clique no botão neutro!")
        }

        override fun cliqueLongo() {
            println("Clique longo no botão neutro!")
        }

        override fun duploClique() {
            println("Clique duplo no botão neutro!")
        }

    })

    botaoConfirmar.acaoCliqueBotao?.let { acaoCliqueBotao ->
        acaoCliqueBotao.clique()
        acaoCliqueBotao.cliqueLongo()
        acaoCliqueBotao.duploClique()
    }
}