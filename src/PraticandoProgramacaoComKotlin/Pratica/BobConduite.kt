package PraticandoProgramacaoComKotlin.Pratica

fun main() {
    val t = mutableListOf<Int>()
    var sum: Int

    for (i in 1..readLine()!!.toInt()) {
        val list = readLine()!!.split(" ").map { it.toInt() }
        if (list.size == 2){
            sum = list[0] + list[1]
            t.add(sum)
        }
    }

    for (i in t) {
        println(i)
    }
}