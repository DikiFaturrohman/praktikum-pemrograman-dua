// menambah function pada tipe data yang sudah ada
//

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Diki"

    println(name.hello())

    name.printHello()

    "Fatur".printHello()
}