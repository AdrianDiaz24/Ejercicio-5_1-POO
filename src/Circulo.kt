
class Circulo(val radio: Double, color: String): Figura(color) {

    override fun area(): Double {
        return Math.PI * radio * radio
    }

    override fun perimetro(): Double {
        return 2 * Math.PI * radio
    }

}