package aula7

open class Personagem (val dano: Int, val defesa: Int)

class Guerreiro: Personagem (dano = 10, defesa = 5)

class Mago: Personagem (dano = 8, defesa = 7)

abstract class Mouse {
        abstract fun cliqueEsquerdo()
        abstract fun cliqueDireito()
}

interface Teclado {
        fun pressionarTecla(tecla: Char)
        val teclasDisponiveis: List<Char>
}

class Controle (val mouse: Mouse, val teclado: Teclado)

fun main() {
        val guerreiro = Guerreiro()
        val mago = Mago()

        val controleGuerreiro = Controle(mouse= object : Mouse() {
                override fun cliqueEsquerdo() {
                        println("Guerreiro usou a espada para atacar! Dano = ${guerreiro.dano}")
                }

                override fun cliqueDireito() {
                        println("Usou o escudo para defender! Defesa = ${guerreiro.defesa}")
                }

        },teclado = object: Teclado{
                override fun pressionarTecla(tecla: Char) {
                        if (tecla !in teclasDisponiveis) {
                                println("Tecla inválida")
                                return
                        }
                        println(when(tecla){
                                'w' -> "Andar para frente"
                                's' -> "Andar para trás"
                                'a' -> "Andar para esquerda"
                                'd' -> "Andar para direita"
                                'e' -> "Super ataque com a espada! Dano = ${guerreiro.dano * 5}"
                                else -> {}
                        })
                }

                override val teclasDisponiveis: List<Char>
                        get() = listOf('w', 's', 'd', 'a', 'e')

        })

        with(controleGuerreiro) {
                mouse.cliqueEsquerdo()
                mouse.cliqueDireito()
                teclado.pressionarTecla('w')
                teclado.pressionarTecla('w')
                teclado.pressionarTecla('d')
                teclado.pressionarTecla('s')
                mouse.cliqueDireito()
        }

}