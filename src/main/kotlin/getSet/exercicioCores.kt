package getSet

enum class Cores (val rgb: String, val cmyk: String, val hsv: String, val hsl: String) {
    AZUL ("0, 0, 255", "100%, 100%, 0%, 0%", "240°, 100%, 100%", "240°, 100%, 50%"),
    CIANO ("0, 255, 255", "100%, 0%, 0%, 0%%", "180°, 100%, 100%", "180°, 100%, 50%"),
    VERDE ("0, 255, 0", "100%, 0%, 100%, 0%", "120°, 100%, 100%", "120°, 100%, 50%"),
    VERMELHO ("255,0, 0", "0%, 100%, 100%, 0%", "0°, 100%, 100%", "0°, 100%, 50%"),
    AMARELO ("255, 255, 0", "0%, 0%, 100%, 0%", "60°, 100%, 100%", "60°, 100%, 50%"),
    PRETO ("0, 0, 0", "0%, 0%, 0%, 100%", "0°, 0%, 0%", "0°, 0%, 0%"),
    BRANCO ("255, 255, 255", "0%, 0%, 0%, 0%", "0°, 0%, 100%", "0°, 0%, 100%")

}

fun main() {
    println("Escolha uma cor para trabalhar: ${Cores.values().joinToString()}")
    val cor = readln().uppercase()

    println("""
Qual tipo de representação de cores deseja ver? [RGB, CMYK, HSV, HSL]
    """.trimMargin())
    val repre = readln().lowercase()



}