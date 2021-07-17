package PrimeirosPassosEmKotlin

import java.util.Scanner

fun main(args: Array<String>) {

    val A = readLine()!!.toFloat()
    val B = readLine()!!.toFloat()

    val weightA = 3.5
    val weightB = 7.5
    val totalWeight = weightA.plus(weightB)

    val m = (A.times(weightA)).plus((B.times(weightB)))/ totalWeight

    val r = "%.5f".format(m)

    println("MEDIA = ${r}")
}
