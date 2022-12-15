package aula8

interface Admin {
    fun login (usuarioAutenticado: Usuario)


    fun logout()

}

class Autenticador: Admin {
    override fun login(usuarioAutenticado: Usuario) {
        println("Logado")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }

}

data class Usuario (val usuario: String, val senha: String) {

}

fun main() {
    val usuariojorge = Usuario(usuario = "Jorginho", "jorginhodelas")
    val autentica = Autenticador().login(usuariojorge)
    println(usuariojorge)

}