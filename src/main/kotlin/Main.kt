import java.util.function.BiPredicate



fun <T,R> List<T>.map2(func: (T) -> R): List<R> {
    val list1 = mutableListOf<R>()
    for(element in this) {
        list1.add(func(element))
    }
    return list1
}

fun <T> List<T>.last2(): T {
    val listLenght=this.size
    return this.get(listLenght-1)
}
fun <T> List<T>.lastOrNull2(): T? {
    val listLenght =this.size
    if(!this.isEmpty()) return this[listLenght-1]

    return null

}
fun <T> List<T>.first2(): T {
    return this.get(0)
}
fun <T> List<T>.firstOrNull2(): T? {
    if(!this.isEmpty()) return this[0]
    return null

}

fun <T> List<T>.distinct2(): List<T> {
    val list1 = mutableListOf<T>()
    for(element in this) {
        if(!list1.contains(element)){
            list1.add(element)
        }

    }
    return list1
}



fun <T> List<T>.partition2(predicate: (T) -> Boolean):Pair<MutableList<T>,MutableList<T>>  {
    var (x, y) = Pair(mutableListOf<T>(), mutableListOf<T>())

    for (element in this) {
        if (predicate(element)) x.add(element) else y.add(element)

    }
    return Pair (x,y)
}
fun <T> List<T>.all2(predicate: (T) -> Boolean): Boolean {

    for (element in this) {
        if (!predicate(element)){
            return false
        }
        return true
    }
    fun <T,R> List<T>.maxBy2(li: List<R>): R {
        var max:R=li.get(0)
        for (element in li) {
            if (max<element) {
                max=element
            }

        }
        return max
    }
    enum class Gender{MALE,FEMALE}

    class Hero(
        val name: String,
        val age: Int,
        val gender: Gender?

    )


    fun main(args: Array<String>) {
        val heroes = listOf<Hero>(
            Hero("The Captain",60,Gender.MALE) ,
            Hero("Frenchy",42,Gender.MALE),
            Hero("The Kid",9,null),
            Hero("Lady lauren",29,Gender.FEMALE),
            Hero("First Mate",29,Gender.MALE),
            Hero("Sir Stephen",37,Gender.MALE),
        )


        val  result5 = heroes.map2{it.age*2}.distinct2()
        println(" the result of mapping the age * 2 $result5")

        val  result6 = heroes.last2()
        println(" the result of last  $result6")

        val emptyList = listOf<Hero>()

        val  result7 = emptyList.lastOrNull2 ()
        println(" the result of last for emptyList is  $result7")


    }