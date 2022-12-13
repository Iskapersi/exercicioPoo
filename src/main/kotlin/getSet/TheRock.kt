package getSet

class Ator (val nome: String, val sobrenome: String) {

    var ultimoFilme: String? = null
        get () {
        return if(field==null) "Desconhecido" else field

    }

    set (value) {
        value?.apply {
            if (this.isEmpty())
                println("Esse filme é inválido")
            else
                field = value
        }

    }


}

fun main () {

    val theRock = Ator (nome = "Dwayne", sobrenome = "Johnson")

    println("O ultimo filme do ator ${theRock.nome} ${theRock.sobrenome} foi ${theRock.ultimoFilme}.")

    theRock.ultimoFilme = "Carga Pesada"

    println("O ultimo filme do ator ${theRock.nome} ${theRock.sobrenome} foi ${theRock.ultimoFilme}.")

    theRock.ultimoFilme = null


    println("O ultimo filme do ator ${theRock.nome} ${theRock.sobrenome} foi ${theRock.ultimoFilme}.")
}
