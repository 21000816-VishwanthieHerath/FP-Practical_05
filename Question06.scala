object Question06 extends App {

    print("Enter a number n : ")
    val n = scala.io.StdIn.readInt()

    def Fibonacci(n: Int): List[Int] = {

        var list: List[Int] = Nil

        if (n == 1) {
            List(0)
        }
        else if (n == 2) {
            List(0, 1)
        }
        else {
            val fibNum = Fibonacci(n-1)
            fibNum :+ fibNum(n-2) + fibNum(n-3)
        }
    }

    val fib = Fibonacci(n)

    println(fib.mkString(", "))
}
