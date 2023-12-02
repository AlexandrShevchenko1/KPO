import java.util.*

abstract class figure(var height: Int, var base: Int) {
    abstract fun GetVolume(): Double
    abstract fun CalcLateralProj(): Double
    abstract fun CalcAboveProj(): Double
}

class Cone(height: Int, base: Int) : figure(height, base) {
    override fun GetVolume(): Double {
        return Math.PI * base * base * height / 3
    }

    override fun CalcLateralProj(): Double {
        return (height * base / 2).toDouble()
    }

    override fun CalcAboveProj(): Double {
        return Math.PI * base * base / 4
    }

}

class Cube(height: Int, base: Int) : figure(height, base) {
    override fun GetVolume(): Double {
        return (height * height * height).toDouble()
    }

    override fun CalcLateralProj(): Double {
        return (height * height).toDouble()
    }

    override fun CalcAboveProj(): Double {
        return (height * height).toDouble()
    }

}

class Pyramid(height: Int, base: Int) : figure(height, base) {
    override fun GetVolume(): Double {
        return (height * base * base / 3).toDouble()
    }

    override fun CalcLateralProj(): Double {
        return (height * base / 2).toDouble()
    }

    override fun CalcAboveProj(): Double {
        return (base * base) .toDouble()
    }

}

fun main() {
    println("Введите тип фигуры: ")
    var figure: figure? = null
    var type = readln()
    type.lowercase(Locale.getDefault())
    println("Введите высоту фигуры:")
    val height = readln().toInt()
    println("Введите основание/диаметр фигуры:")
    val base = readln().toInt()

    when (type) {
        "куб" -> figure = Cube(height,base)
        "пирамида" -> figure = Pyramid(height,base)
        "конус" -> figure = Cone(height, base)
    }

    println("Объем фигуры($type): ${figure?.GetVolume()}")
    println("Площадь боковой проекции: ${figure?.CalcLateralProj()}")
    println("Площадь проекции сверху: ${figure?.CalcAboveProj()}")
}
