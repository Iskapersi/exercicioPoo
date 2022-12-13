package aula6

interface InstrumentosMusicais {

    val possuiCordas: Boolean
        get() = false
    val material: String

    fun consertar()

    fun afinar()

    fun imprimirCordas(){
        println(possuiCordas)
    }

    fun tocarMusica(musica: String)

    fun listaAcordes(){
        println("Dó Ré Mi Fá Sol Lá Si")
    }
}

interface Cordas{
    val numCordas: Int
    val tipoCordas: String

    fun trocarCordas()
}
class Violao(override val material: String) : InstrumentosMusicais, Cordas{

    override val possuiCordas: Boolean = true
    override val numCordas: Int = 6
    override val tipoCordas: String = "Sei la"

    override fun trocarCordas() {
        println("Cordas Trocadas")
    }

    override fun consertar() {
        println("Instrumento consertado")
    }

    override fun afinar() {
        println("Instrumento afinado")
    }

    override fun tocarMusica(musica: String) {
        println("Tocando música $musica, plin plin plon...")
    }

}



fun main() {
    val meuViolao = Violao(material = "Madeira")
    meuViolao.imprimirCordas()
    meuViolao.consertar()
    meuViolao.tocarMusica("Axel Rose")

}