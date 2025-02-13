import java.lang.Math.sqrt

class Triangulo : Figura {
    private val lado1: Double
    private val lado2: Double
    private val base: Double
    private val altura: Double

    constructor(base: Double, lado1: Double, lado2: Double, color: String) : super(color) {
        this.base = base
        this.lado1 = lado1
        this.lado2 = lado2
        this.altura = calcularAltura()
    }

    constructor(base: Double, color: String) : super(color) {
        this.base = base
        this.lado1 = base
        this.lado2 = base
        this.altura = calcularAlturaEquilatero(base)
    }

    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro() = base + lado1 + lado2

    private fun calcularAltura(): Double {
        val s = (base + lado1 + lado2) / 2
        return (2 / base) * sqrt(s * (s - base) * (s - lado1) * (s - lado2))
    }

    private fun calcularAlturaEquilatero(lado: Double): Double {
        return (lado * sqrt(3.0)) / 2
    }
}