fun main() {
    var array = arrayOf(
        1, 2, 3, 4, 5, 6
    )
    println(array[1])
    array[1] = 9
    println(array[1])

    array += arrayOf(7)

    println(array[6])

    var list = listOf(1, 2, 3, 4, 5, 6)

    list += listOf(7)
    println(list[6])

    val mutableListOf = mutableListOf(1,2,3,4,5,6)
    mutableListOf.add(7)
    println(mutableListOf[6])
    printAllIndex(mutableListOf)
    println("-----------------------")
    printAllIndex(list)
}

fun printAllIndex(list: List<Int>){
    list.forEachIndexed { index, i ->
        println("index: $index valor: $i")
    }
}