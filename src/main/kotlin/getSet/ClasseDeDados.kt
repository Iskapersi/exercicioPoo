package getSet

data class Jogador(val nome: String, val idade: Int, val numeroCamisa: Int, val posicao: String)


fun main() {
    val danielAlves = Jogador("Daniel Alves", 50, 13, "Lateral Direito")
    val danilo = Jogador("Danilo", 30, 2, "Lateral Direito")

    val cloneDanilo = danilo.copy()

    println(danielAlves.toString())
    println(danilo.toString())

    println(danilo.equals(cloneDanilo))

    println(danilo.hashCode())
    println(cloneDanilo.hashCode())

    println(danilo.posicao.equals(danielAlves.posicao))
    println(danilo.posicao.equals(danielAlves.posicao))
}