package SolucionandoDesafiosEmKotlin.pratica

fun main(args: Array<String>) {

    val input = readLine()!!

    val A = input.split(" ")[0].toInt()
    val B = input.split(" ")[1].toInt()
    val C = input.split(" ")[2].toInt()
    val D = input.split(" ")[3].toInt()

        if (
            (B > C) &&
            (D > A) &&
            ((C.plus(D)) > (A.plus(B))) &&
            (C > 0) &&
            (D > 0) &&
            (A % 2 == 0)
        ) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }

}