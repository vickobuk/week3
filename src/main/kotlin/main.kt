//program to display multiple of 3 and 5
//
fun main(){
    for (i in 1..100){
        if(i%3==0 && i%5==0){
            println("FizzBuzz") //to print FizzBuzz  i.e multiple of 3 and 5
        }
        else if (i%3==0){
            println("Fiz")// for multiple of 3
        }
        else if(i%5==0) {
            println("Buzz") //for multiple of 5
        }
        else {
            println(i) //to return value if demand not meant
        }
    }
}



