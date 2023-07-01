import java.util.Scanner

//fun main(){
//    val n=5;
//    for(i in 1..n){
//        var value=1;
//        for(j in 1..i){
//            value=i;
//            print(value)
//            value--
//        }
//        println(" ")
//    }
//}
fun main(args:Array<String>){
    val read=Scanner(System.`in`)
    val n=read.nextInt();
    (1..n).forEach{
        x->
        (x downTo 1).forEach{print("$it")}
        println()
    }

}