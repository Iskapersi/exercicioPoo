package exercicio1

fun main() {

    val casasBahia = Empresa (
        "Casas Bahia",
        "12345000101",
        "Marcenaria",
        "Rua Marquinhos Delas, 69, B. Peguete"
    )

    val joaozinho = Funcionario(
        "João da Silva",
        "123456789",
        "joao@gmail.com",
        "Motorista",
        1000.00)



    casasBahia.adicionarFuncionario(joaozinho)

    casasBahia.mostrarFuncionarios()

}