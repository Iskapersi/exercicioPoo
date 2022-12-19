package aula6

interface MotorACombustao{

    val combustivelUtilizado: String
    val nivelDePoluicao: String

    fun abastecer()
    fun trocarOleo()
}

interface MotorEletrico{

    val tipoBateria: String
    val tempoDeRecarga: String
    val autonomiaEmKm: String

    fun carregar()
    fun trocarBateria()
    fun descricaoBateria() {
        println("""
        O tipo da bateria é $tipoBateria, possui um tempo de recarga de $tempoDeRecarga
        e tem uma autonomia de $autonomiaEmKm.    
        """.trimIndent())
    }

}

class CarroCombustao():MotorACombustao{
    override val combustivelUtilizado: String
        get() = TODO("Not yet implemented")
    override val nivelDePoluicao: String
        get() = TODO("Not yet implemented")

    override fun abastecer() {
        TODO("Not yet implemented")
    }

    override fun trocarOleo() {
        TODO("Not yet implemented")
    }
}

class CarroEletrico():MotorEletrico{
    override val tipoBateria: String = "Bateria de nítio"

    override val tempoDeRecarga: String = "5 horas"

    override val autonomiaEmKm: String = "200km"

    override fun carregar() {
        TODO("Not yet implemented")
    }

    override fun trocarBateria() {
        TODO("Not yet implemented")
    }


}

fun main() {
    var elet = CarroEletrico()
    elet.descricaoBateria()

}