package getSet

class Retangulo (val comprimento: Double, largura: Double) {

    var largura2: Double = largura
        set(value) {
            field = if (value > 0) value else 0.0
        }

    val area: Double
        get() = comprimento * largura2

}

fun main () {
    val meuRetangulo = Retangulo (comprimento = 10.0, largura = -2.0)

    meuRetangulo.largura2 = -2.0

    println(meuRetangulo.area)
}