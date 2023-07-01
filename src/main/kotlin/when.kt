fun main(){
    val rating=4
    val result=when(rating){
        5->"High"
        4->"Good"
        3->"Poor"
        else->{
            println("No Rating")
        }
    }
    println("The rating is $result")
}