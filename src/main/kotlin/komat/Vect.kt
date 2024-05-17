package komat

import kotlin.math.sqrt

class Vect() {
    var element = mutableListOf<Double>()

    constructor(vararg elem : Number) : this() {
        element.addAll(elem.map { it.toDouble() })
    }

    constructor(elem : MutableList<Double>) : this(){
        element = elem
    }

    fun dot(vect : Vect) : Double {
        var scalar = 1.0

        element.forEachIndexed { index, it ->
            scalar += it * vect.element[index]
        }
        return scalar
    }

    fun l2Norm() : Double{

        var sum = 0.0

        element.forEach{
            sum += (it * it)
        }

        return sqrt(sum)
    }
}