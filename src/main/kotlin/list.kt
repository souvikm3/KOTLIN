fun main() {
//list...................................................
    val names= listOf("Souvik","Ankush","Ankan")
    println("The size of the list is:${names.size}")
    println("The second number of the list is ${names.get( 1)}")
    println("The second number of the list is using index operator ${names[1]}")
    println("Souvik is the indexof ${names.indexOf("Souvik")} in the list")
}