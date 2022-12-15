package aula8

abstract class CalculadoraGenerica <T> (val primeiroValor: T, val segundoValor: T) {
    abstract fun soma(): T
    abstract fun subtrai(): T
    fun descricaoValores() {
        println("Os dois valores ($primeiroValor e $segundoValor) são do tipo ${primeiroValor!!::class}")
    }
}

//open class CalculadoraGenerica <T> (val primeirovalor: T, val segundovalor: T) {
//    open fun soma(): T {return primeirovalor}
//    open fun subtrai(): T {return segundovalor}
//    fun descricaoValores() {
//        println("Os dois valores ($primeirovalor e $segundovalor) são do tipo ${primeirovalor!!::class}")
//    }
//}
class CalculadoraStrign (primeirovalor: String, segundoValor: String): CalculadoraGenerica<String> (primeirovalor, segundoValor) {
    override fun soma(): String {
        return "$primeiroValor $segundoValor"
    }
    override fun subtrai(): String {
        return primeiroValor.replace(segundoValor,"")
    }
}

class CalculadoraInt(primeiroValor: Int, segundoValor: Int): CalculadoraGenerica <Int> (primeiroValor, segundoValor) {
    override fun soma(): Int {
        return primeiroValor + segundoValor
    }
    override fun subtrai(): Int {
        return primeiroValor - segundoValor
    }
}

fun main() {
    val minhaCalculadoraString = CalculadoraStrign(primeirovalor = "abcdef", segundoValor = "abc")

    with(minhaCalculadoraString) {
        println(primeiroValor)
        println(segundoValor)
        descricaoValores()
        println(soma())
        println(subtrai())
    }

    val minhaCalculadoraInt = CalculadoraInt(primeiroValor = 10, segundoValor = 5)

    with(minhaCalculadoraInt){
        println(primeiroValor)
        println(segundoValor)
        descricaoValores()
        println(soma())
        println(subtrai())
    }
}