package getSet

class ClassePersonalizada (comprimento: Double = 0.0, var largura: Double) {

    var comprimento = comprimento
        set(value) {

            field = if (value < 0) 0.00 else value
        }

    val perimetro: Double
        get() = (comprimento + largura) * 2

    val area: Double
        get() = comprimento * largura

}

val per = ClassePersonalizada (0.0, 0.0)

fun main() {



    per.comprimento = -5.0
    per.largura = 5.5

    println(per.perimetro)
    println(per.area)
}