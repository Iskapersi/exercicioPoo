package aula5

import kotlin.math.PI
import kotlin.math.pow

open class Forma2d(){
open fun calcularArea(): Double{
    return 0.00
    }
}

class quadrado(val lado: Double): Forma2d(){
    override fun calcularArea(): Double {
        val area = lado.pow(2.0)
        return area
    }
}

class triangulo(val base: Double, val altura: Double): Forma2d(){
    override fun calcularArea(): Double {
        val area = base * altura / 2
        return area
    }
}


open class Forma3d {
    open fun calcularVolume(): Double{
        return 0.00
    }
}

class Piramide(val areaBase: Double, val altura: Double): Forma3d() {
    override fun calcularVolume(): Double {
        val volume = areaBase * altura / 3
        return volume
    }
}

class Cone(val raio: Double, val altura: Double): Forma3d() {
    override fun calcularVolume(): Double {
        val volume = PI * raio.pow(2) * altura / 3
        return volume
    }
}


fun main() {


    val lado = 2.0
    val areaDoQuadrado = quadrado(lado = lado)
    println(areaDoQuadrado.calcularArea())

    val base = 2.0
    val altura = 2.0
    val areaDoTriangulo = triangulo(base, altura)
    println(areaDoTriangulo.calcularArea())

    val volumePiramide = Piramide(4.0, 2.0)
    println(volumePiramide.calcularVolume())

    val volumeCone = Cone(4.0, 2.0)
    println(volumeCone.calcularVolume())




}