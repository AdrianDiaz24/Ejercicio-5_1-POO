

class Triangulo(val base: Double, val altura: Double, color: String): Figura(color) {
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return
    }


}