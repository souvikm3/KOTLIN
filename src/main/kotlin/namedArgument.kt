fun main(){
    println(Named("Red Box", width = 15, height = 20))

}
fun Named(name:String, height:Int, width:Int):Int{
    println(name)
    return height*width
}