package SolucionandoDesafiosEmKotlin.pratica

fun main() {

    val N = readLine()!!.toInt()
    fibonacci(N)

}

val fibonacci:(Int) -> Unit = { numero ->

    var A = 1
    var B = 0
    var soma: Int
    val lista:MutableList<String> = mutableListOf("0")
    lista.add(" ")

    for (i in 0 until numero.minus(1)){

        lista.add(A.toString())
        lista.add(" ")

        soma = A
        A += B
        B = soma

    }
    lista.forEach { numeros-> print(numeros) }
}