import java.lang.IndexOutOfBoundsException

fun main(args: Array<String>) {
    var pila1 = Pila<Int>()

    println(pila1.vacia())

    pila1.put(78)
    pila1.put(4)
    println(pila1.top())

    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

}

class Pila<T>() {
    private val elementos = mutableListOf<T>()

    private fun size(): Int = this.elementos.size

    fun top() {
        this.elementos.lastIndex
    }

    fun put(elemento: T) {
        this.elementos.add(elemento)
    }

    fun pop(): T {
        return this.elementos.removeAt(this.elementos.lastIndex)
    }

    fun vacia(): Boolean {
        return this.elementos.isEmpty()
    }

    override fun toString() = this.elementos.toString()
}

fun <T> reverse(lista: List<T>):List<T> {
    var mutable = lista.toMutableList()
    var pila: Pila<T> = Pila()


    var listaIterator = lista.listIterator()


    while (listaIterator.hasNext()) {
        pila.put(listaIterator.next())
    }

    var lista = mutableListOf<T>()
    while (!pila.vacia()) {
        lista.add(pila.pop())

    }
    return lista

}