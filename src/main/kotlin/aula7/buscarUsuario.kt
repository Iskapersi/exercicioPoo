package aula7

import kotlin.random.Random

data class Usuario (val nomeUsuario: String, val senha: String)

sealed class ResultadoBuscaUsuario {
    data class Sucesso (val usuarioBuscado: Usuario, val mensagem: String): ResultadoBuscaUsuario()

    object Carregando : ResultadoBuscaUsuario()
    data class Falha (val erro: String) : ResultadoBuscaUsuario()

}

fun buscaUsuario (): ResultadoBuscaUsuario {
    val usuarioAleatorio = Usuario(nomeUsuario = "Bernandinho", senha = "1234")

    return when (Random.nextInt(0,3)){
        0 -> ResultadoBuscaUsuario.Sucesso (usuarioBuscado = usuarioAleatorio, mensagem = "Usuário retornado com sucesso!")
        1 -> ResultadoBuscaUsuario.Carregando
        2 -> ResultadoBuscaUsuario.Falha (erro = "Falha ao buscar usuario")
        else -> ResultadoBuscaUsuario.Carregando
    }
}

fun main() {

    repeat(6){
        println(buscaUsuario())
    }

}