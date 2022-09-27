import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    var precoTotal = BigDecimal.ZERO
    //for
    for (preco in precoDosProdutos){
        precoTotal += preco
    }

    //while
    var contador = 0
    precoTotal = BigDecimal.ZERO

    while (contador < precoDosProdutos.size){
            precoTotal += precoDosProdutos[contador]
        contador += 1

    }
    println("O preço total das compras foi $precoTotal")
}