fun main(){
     var discount:Int=0;
    var price: Int=20
    if(price>50){
        discount=10
    }
    else{
        discount =3
    }
    println(discount)
    discount=if(price>50) 10 else 3
    println(discount)
}