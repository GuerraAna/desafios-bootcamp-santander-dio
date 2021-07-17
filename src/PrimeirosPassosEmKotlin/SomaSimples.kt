package PrimeirosPassosEmKotlin


fun main() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()

    primeiraSoma()
    segundaSoma()

    print("SOMA = ${terceiraSoma(A, B)}")
}

private fun terceiraSoma(A: Int, B: Int) = A.plus(B)

private fun segundaSoma() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()

    print("SOMA = ${A.plus(B)}")
}

private fun primeiraSoma() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()

    val SOMA = A.plus(B)

    print("SOMA = $SOMA")
}