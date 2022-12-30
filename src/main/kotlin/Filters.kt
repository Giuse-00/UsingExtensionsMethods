import java.util.function.Predicate

fun main() {

    val numbers = listOf<Int>(5, 657, 65, 890, 23)

    val filteredList = numbers.filter{ it < 500}

    fun List<Int>.printFilteredList(){
        for (element in this){
            println(element)
        }
    }

    filteredList.printFilteredList()


    /*  I ALSO TRIED IN THIS WAY

    fun List<Int>.filterByValue(Predicate: (Int) -> Boolean): List<Int>{
        return this.filter{Predicate(it)}
    }

    fun List<Int>.printValues(){
        this.forEach{ println(it) }
    }

    val myList = listOf<Int>(787, 234, 543, 123, 45, 56, 1237)

    val filteredList = myList.filterByValue { it < 500 }.forEach{ it -> println("${it}") }
*/
}