package peixes

import kotlin.random.Random

class AquarioSujo(message:String = "\nO AQUÁRIO ESTÁ SUJO, NÃO PODE ADICIONAR PEIXES.\n"): Exception(message)


class Peixe (val nome: String, val cor: String, val tamanho: String) {

    override fun toString(): String {
        return """
            
            Nome do Peixe: $nome
            Tamanho do Peixe: $tamanho
            Cor do Peixe: $cor
            
        """.trimIndent()
    }
}

val todosOsPeixes = mutableListOf<Peixe>()
var quantPeixes = 0
var aquarioSujeira = 0
var parametroSujeira = 3
var sujeira: Boolean = true



fun main() {
    println("""Olá bem vindo ao aquario, o que deseja fazer?
1 - Novo Peixe
2 - Ver Peixes
3 - Alimentar Peixes
4 - Limpar aquario
5 - Definir limite ações para aquário sujo
6 - Sair
""".trimMargin())

    val opcao = readln().toIntOrNull()

    when (opcao) {
        1 -> {
            try {
                aquarioSujo()
                todosOsPeixes.add(criarPeixe())
                quantPeixes += 1
                aquarioSujeira += 1
                seraQueTaSujo()
            } catch (e: AquarioSujo) {
                println(e.message)
            }

        main()
        }
        2 -> {
            println(todosOsPeixes.joinToString(""))
        main()
        }
        3 -> {
            try {
                aquarioSujo()
                alimentarPeixes()
                aquarioSujeira += 1
                seraQueTaSujo()
            } catch (e: AquarioSujo) {
                println(e.message)
            }
            main()
        }
        4 -> {
            limparAquario()
            main()
        }
        5-> {
            mudarParametrosSujeira()
            main()
        }
        else -> {
            println("Opção Inválida, tente novamente")
            main()
        }
    }
}

fun mudarParametrosSujeira() {
    println("Digite quantas ações para tornar o aquário sujo:")
    parametroSujeira = readln().toInt()
}

fun alimentarPeixes() {

    if (todosOsPeixes.size == 0){
        val alimento = Random.nextInt(from = 0, until = todosOsPeixes.size + 1)
        when (alimento) {
            0 -> {
                println("Falha! Nenhum peixe foi alimentado!")
            }
            1 -> {
                println("Sucesso. $alimento peixe foi alimentado.")
            }
        }
    } else {
        val alimento = Random.nextInt(from = 0, until = todosOsPeixes.size + 1)
        when (alimento) {
            0 -> {
                println("Falha! Nenhum peixe foi alimentado!")
            }
            todosOsPeixes.size -> {
                println("Incrível! Todos os $alimento peixes foram alimentados!")
            }
            else -> {
                println("Sucesso. $alimento peixes foram alimentados.")
            }
        }
    }



}

private fun seraQueTaSujo() {
    sujeira = aquarioSujeira % parametroSujeira != 0
}


private fun limparAquario() {
    println("O aquario foi limpo!")
    sujeira = true
}

private fun aquarioSujo() {
    if (sujeira) {
        return
    } else {
        throw AquarioSujo()
    }
}


private fun criarPeixe(): Peixe {
    println("Digite o nome do peixe:")
    val nomeDoPeixe = readln()

    val corDoPeixe = escolherCorDoPeixe()

    val tamanhoDoPeixe = escolherTamanhoDoPeixe()

    val peixe = Peixe(nome = nomeDoPeixe, cor = corDoPeixe, tamanho = tamanhoDoPeixe)

return peixe
}

fun escolherCorDoPeixe(): String {

    var corFinal = ""
    var confirmacao = true
    do {
        println("Escolha a cor do peixe: 'AZUL', 'AMARELO', 'VERMELHO'")
        val escolheuCor = readln().uppercase()


        if (escolheuCor == "AZUL" || escolheuCor == "AMARELO" || escolheuCor == "VERMELHO") {
            corFinal = escolheuCor
            confirmacao = true
        } else {
            println("Cor inválida, tente novamente.")
            confirmacao = false
        }
    } while(!confirmacao)

    return corFinal
}

fun escolherTamanhoDoPeixe(): String {

    var tamanhoFinal = ""
    var confirmacao = true
    do {
        println("Escolha o tamanho do peixe: 'P', 'M', 'G'")
        val escolheuTamanho = readln().uppercase()


        if (escolheuTamanho == "P" || escolheuTamanho == "M" || escolheuTamanho == "G") {
            tamanhoFinal = escolheuTamanho
            confirmacao = true
        } else {
            println("Tamanho inválido, tente novamente.")
            confirmacao = false
        }
    } while(!confirmacao)

    return tamanhoFinal
}