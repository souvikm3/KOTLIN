fun main(){
    val numbers= arrayOf(1,2,4,5,6)
    println("The number at 2nd Position ${numbers.get(1)}")
    numbers.set(3,20)
    println("${numbers.get(3)}")
    numbers[1]=22
    println(numbers.joinToString { "," })
    val numbersZero=Array(5){0}
    println(numbersZero.joinToString { "," })

}