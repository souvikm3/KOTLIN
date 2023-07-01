fun main() {
//    println("Hello, world!!!")
//    val a:Int=10
//    val b:Long=a.toLong()
//    println(b)
    val name:Any ="John"
    println(name)
    if(name is String){
        println(name.length)
    }
    val x:Int=7
    val y:Long? =x as? Long
    println(y)
}