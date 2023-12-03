import java.util.function.BiPredicate



fun <T,R> List<T>.map2(func: (T) -> R): List<R> {
    val list1 = mutableListOf<R>()
    for(element in this) {
        list1.add(func(element))
    }
    return list1
}

fun <T,R> List<T>.maxBy2(func2:(List<R>)->R): R {
    var max=
    for (element in this) {
        if()
    }

return max
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



fun <T> List<T>.partition2(predicate: (T) -> Boolean):Pair<MutableList<T>,MutableList<T> >  {
    var p = Pair(mutableListOf<T>(), mutableListOf<T>())

    for (element in this) {
        if (predicate(element)) p.first.add(element) else p.second.add(element)

    }
    return  p
}
fun <T> List<T>.all2(predicate: (T) -> Boolean): Boolean {

    for (element in this) {
        if (!predicate(element)) {
            return false
        }

    }
    return true
}

    enum class Gender{MALE,FEMALE}
   data  class Hero(
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
        val emptyList = listOf<Hero>()
        val  result1 = heroes.first2()
        println(" the result of first  ${result1?.name}")

        val  result2 = heroes.firstOrNull2()
        println(" the result of first or null  ${result2?.name}")

        val  result3 = heroes.last2()
        println(" the result of last   ${result3?.name}")

        val  result4= emptyList.lastOrNull2()
        println(" the result of last or null should be null  ${result4?.name}")

        val  result5 = heroes.map2{it.age*2}.distinct2()
        println(" the result of map and distinct $result5")

        val  result6 = heroes.all2{it.age<30}
        println(" all younger then 30: $result6")

        val  result7 = heroes.maxBy2(it.age)
        println(" all younger then 30: $result7")


        val  p:Pair( MutableList<hero>, MutableList<hero>) = heroes.partition2{it.age<30}()


        println(" the result of last   ${p}")
        println(" the result of last  ${p.second.name}")


    }


