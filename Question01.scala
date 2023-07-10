import scala.io.StdIn
object Question01 extends App {

    print("Enter an integer : ")
    val n = StdIn.readInt()

    def prime(n: Int): Boolean = {
        if (n < 2) false else isPrime(n)
    }

    def isPrime(n: Int, i: Int = 2): Boolean = {
        if (n <= 1) {
            false
        } else if (i * i > n) {
            true
        } else if (n % i == 0) {
            false
        } else {
            isPrime(n, i + 1)
        }
    }

    println(prime(n))
}

