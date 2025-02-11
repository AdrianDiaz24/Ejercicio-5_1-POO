

class Rectangulo(val base: Double, val altura: Double, color: String): Figura(color) {
    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return 2 * (base + altura)
    }


}