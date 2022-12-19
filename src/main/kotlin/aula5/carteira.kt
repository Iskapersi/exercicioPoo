package aula5

import java.text.NumberFormat
import java.util.*

open class Cliente(private val nome: String,
                   private val sobrenome: String,
                   private val senha: String) {

    class Carteira(nome: String, sobrenome: String, senha: String) : Cliente(nome, sobrenome, senha) {
        private val senhaCerta = senha
        private var saldo = 0.0
        private var chaveUm = ""
        private var chaveDois = ""
        private var chaveTres = ""
        private var extrato = "===========EXTRATO===========\n" +
                "TIPO===========VALOR==========SALDO\n"

        fun Double.formataMonetario(): String {
            return NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(this)
        }

        fun adicionarFundos(valorAdicionado: Double, senhaInserida: String) {
            if (senhaInserida == senhaCerta) {
                saldo += valorAdicionado
                extrato("DEPÓSITO", valorAdicionado, true)
                println("Adicionado ${valorAdicionado.formataMonetario()} com sucesso, saldo de ${saldo.formataMonetario()}")
            } else {
                println("Senha errada, retornando.")
            }
        }

        fun sacarDinheiro(valorSacado: Double, senhaInserida: String) {
            if (senhaInserida == senhaCerta) {
                if (valorSacado > saldo) {
                    println("Impossível sacar ${valorSacado.formataMonetario()}, saldo de ${saldo.formataMonetario()}")
                } else {
                    saldo -= valorSacado
                    extrato("SAQUE", valorSacado, false)
                    println("Adicionado ${valorSacado.formataMonetario()} com sucesso, saldo de ${saldo.formataMonetario()}")
                }
            } else {
                println("Senha errada, retornando.")
            }
        }

        fun pagarBoleto(valorBoleto: Double, senhaInserida: String) {
            if (senhaInserida == senhaCerta) {
                if (valorBoleto > saldo) {
                    println("Impossível pagar boleto de ${valorBoleto.formataMonetario()}, saldo de ${saldo.formataMonetario()}")
                } else {
                    saldo -= valorBoleto
                    extrato("BOLETO", valorBoleto, false)
                    println("Pago o boleto de ${valorBoleto.formataMonetario()} com sucesso, saldo de ${saldo.formataMonetario()}")
                }
            } else {
                println("Senha errada, retornando.")
            }
        }

        private fun extrato(tipoMovimento: String, valorMovido: Double, entraSai: Boolean) {
            if (entraSai) {
                extrato += "$tipoMovimento      +${valorMovido.formataMonetario()}     ${saldo.formataMonetario()}\n"
            } else {
                extrato += "$tipoMovimento      -${valorMovido.formataMonetario()}     ${saldo.formataMonetario()}\n"
            }
        }

        fun imprimirExtrato(){
            println(extrato)
            println("         TOTAL ${saldo.formataMonetario()}")
        }
    }
}
    private val jorginho = Cliente.Carteira(
        nome = "Jorge",
        sobrenome = "Delas",
        senha = "s4e8f2!4f"
    )

private val marquinhos = Cliente.Carteira(
    nome = "Marquinhos",
    sobrenome = "Delas",
    senha = "s4e8f2!4f"
)


fun main() {

    jorginho.adicionarFundos(50.0, "s4e8f2!4f")
    jorginho.adicionarFundos(70.0, "s4e8f2!4f")
    jorginho.sacarDinheiro(15.0, "s4e8f2!4f")
    jorginho.pagarBoleto(37.0, "s4e8f2!4f")
    jorginho.imprimirExtrato()

    marquinhos.adicionarFundos(50.0, "s4e8f2!4f")
    marquinhos.imprimirExtrato()


}