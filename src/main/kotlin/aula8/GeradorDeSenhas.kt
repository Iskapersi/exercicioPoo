package aula8

import kotlin.math.pow
import kotlin.random.Random
import kotlin.random.nextInt

abstract class GeradorDeSenhas <T> (val quantDigitos: Int) {

   abstract fun gerador() : T

}

class GeraSenhaNumerica (quantDigitos: Int): GeradorDeSenhas<Int>(quantDigitos){
    override fun gerador(): Int {

        val primeirovalor = 10.0.pow(quantDigitos-1.00).toInt()
        val segundovalor = (10.0.pow(quantDigitos)-1.00).toInt()

        return Random.nextInt(from = primeirovalor, until = segundovalor)
    }
}

class GeraSenhaAlfanumerica (quantDigitos: Int): GeradorDeSenhas<String> (quantDigitos) {
    override fun gerador(): String {
        val caracteres : String = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!*?+-")
        return (1..quantDigitos).map { caracteres.random() }.joinToString("")
    }

}

fun main() {
    val senhaAleatoria = GeraSenhaNumerica(8)
    println(senhaAleatoria.gerador())

    val senhaTexto = GeraSenhaAlfanumerica(8)
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())
    println(senhaTexto.gerador())


}