import androidx.compose.ui.text.toUpperCase

fun main() {

    //if(se)
    val tipoDeRota = "asd".toUpperCase()
    if(tipoDeRota == "A_PE"){
        println("Traçando rota a pé")
    }else{
        if(tipoDeRota == "CARRO"){
            println("Traçando rota de carro")
        }else{
            if(tipoDeRota == "ONIBUS"){
                println("Traçando rota de onibus")
            }else{
                if(tipoDeRota == "trem"){
                 println("Traçando rota de trem")
                }
                else{
                    println("Rota não encontrada")
                }
            }
        }
    }

    //when(quando)
    when(tipoDeRota){
        "a_pe" -> println("Traçando rota a pé")
        "carro" -> println("Traçando rota de carro")
        "onibus" -> println("Traçando rota de onibus")
        "trem" -> println("Traçando rota de trem")
        else -> println("Rota não encontrada")

    }
}