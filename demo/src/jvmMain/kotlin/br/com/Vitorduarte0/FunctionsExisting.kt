import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    //String
    val name = "Vitor Duarte"
    val lengthName = name.count()
    println("O tamanhoNome: ${lengthName}")
    val splitName = name.split(" ")
    println("Separa o nome caractere por caractere: ${splitName}")
    val dropLastName = name.dropLast(4)
    println("O nome sem as 4 letras do final: ${dropLastName}")
    val dropName = name.drop(1)
    println("O nome sem a primeira letra: ${dropName}")
    val containsName = name.contains("V")
    println("tem essa letra no 'nome': ${containsName}")

    //Array
    val array = arrayOf(1, 6, 2, 4, 5, 10, 3, 21)
    val sumOfArray = array.sumOf { it }
    println("A soma dos elementos do array ${sumOfArray}")
    val reverseArray = array.reversedArray()
    println("Revertendo parágrafos ${arrayToString(reverseArray)}")
    val sortArray = array.sortedArray()
    println("Ordenando array ${arrayToString(sortArray)}")

    //BigDecimal
    val bigDecimal = BigDecimal("2")
    val powBigDecimal = bigDecimal.pow(3)
    println("pow big decimal ${powBigDecimal}")
    val divideBigDecimal = bigDecimal.divide(BigDecimal("3"), 8, RoundingMode.HALF_UP)
    println("Divide big decimal ${divideBigDecimal}")
}

fun arrayToString(array: Array<Int>) = array.fold("") {
    acc, i -> "$acc $i"
}