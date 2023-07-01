fun main(){
    //list...................................................
//    val names= listOf("Souvik","Ankush","Ankan")
//    println("The size of the list is:${names.size}")
//    println("The second number of the list is ${names.get( 1)}")
//    println("The second number of the list is using index operator ${names[1]}")
//    println("Souvik is the indexof ${names.indexOf("Souvik")} in the list")

    //Mutable List...............................
//    val names= mutableListOf("Souvik","Ankush","Ankan")
//    names.add("Maiti")
//    println(names)
//    names.removeAt(1)
//    names.remove("Ankush")
//    println(names)
//    names.set(2,"SVK")
//    names[1]="Michel"
//    println(names)
//    names.clear()
//    println(names)
    //set.................................
//   Have to unique elements
//    val names= setOf("Souvik","Ankush","Ankan")
//    println("The size of the set id ${names.size}")
//    println("The set contains ${names.contains("Souvik")}")
    //MutableSet...............................
//    val names= mutableSetOf("Souvik","Ankush","Ankan","")
//    // sets are unique
//    names.add("Ankush")
//    println(names)
//    names.remove("Ankush")
//    println(names)

    //MAP
//val classRanks= mapOf(1 to "Souvik", 2 to "Rahul", 3 to "Ankan", 4 to "Ankush")
//    println("Students: ${classRanks.values}")
//    println("Ranks: ${classRanks.keys}")
//    println("Souvik got a rank ${classRanks.containsValue("Souvik")}")
//    println("There is fourth rank is ${classRanks.containsKey(4)}")
//    println("The student at first position: ${classRanks.get(1)}")
    //MutableMAp
    val classRanks= mutableMapOf(1 to "Souvik", 2 to "Rahul", 3 to "Ankan", 4 to "Ankush")
    classRanks.put(4,"Ri")
    classRanks.remove(2)
    println(classRanks)
}