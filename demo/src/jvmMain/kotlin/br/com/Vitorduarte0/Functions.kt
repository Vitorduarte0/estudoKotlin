import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos2 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("4.99"), BigDecimal("3.99")
    )
    val precoDosProdutos3 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("6.99"), BigDecimal("3.99")
    )
    val priceProduct = sumePriceProducts(precoDosProdutos)
    println("O preço total da compra foi $priceProduct")

    val priceProduct2 = sumePriceProducts(precoDosProdutos2)
    println("O preço total da compra foi $priceProduct2")
     val priceProduct3 = sumePriceProducts(precoDosProdutos3)
    println("O preço total da compra foi $priceProduct3")
}

fun sumePriceProducts(products: Array<BigDecimal>): BigDecimal{
    var precoTotal = BigDecimal.ZERO
    for (preco in products){
        precoTotal += preco
    }

    return precoTotal
}