fun pyramid(n: Int){
    for (i in 1..n) {
        for(j in 1..(n-i)){
            print(" ")
        }
        for(j in 1..(i)) print(j)
        for(j in (i-1) downTo 1) print(j)
        for(j in 1..(n-i)){
            print(" ")
        }
        print("\n")
    }
}

fun main(args: Array<String>) {
    print("Please input value.\nvalue: ")
    val input=readLine()
    if(!input.isNullOrBlank()){
        pyramid(input.toInt()%10)
    }else{
        println("Non-int type was entered.")
    }
}