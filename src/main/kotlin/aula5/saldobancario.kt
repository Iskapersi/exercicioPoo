package aula5

import java.text.NumberFormat
import java.util.*

class ContaBancaria () {
    var saldo: Double = 0.00
        private set

    fun buscaSaldo(): Double {
        return saldo
    }

    fun deposito(valor: Double){
        saldo =+ valor
    }

    fun saque(valor: Double){
        if (valor > saldo) {
            println("Não tem grana man. Saldo: ${saldo.formataMonetario()}")
        } else {
            saldo -= valor
        }
    }
}

fun Double.formataMonetario(): String {
    return NumberFormat.getCurrencyInstance(Locale("pt","BR")).format(this)
}

fun main() {

    val minhaContaBancaria = ContaBancaria ()

    with(minhaContaBancaria){
        println("O meu saldo é de ${buscaSaldo().formataMonetario()}")

        minhaContaBancaria.deposito(100.0)
        minhaContaBancaria.saque(50.0)

        println("O meu saldo é de ${buscaSaldo().formataMonetario()}")

        minhaContaBancaria.saque(60.0)
    }


}