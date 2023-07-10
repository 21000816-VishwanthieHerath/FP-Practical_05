object Question02 extends App {

    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()

    def isPrime(n: Int, divisor: Int): Boolean = {
        if (divisor < 2) true
        else if (n % divisor == 0) false
        else isPrime(n, divisor - 1)
    }

    def primeSeq(n: Int): Unit = {
        if (n >= 2) {
            if (isPrime(n, n - 1)) {
                primeSeq(n - 1)
                print(s"$n ")
            } 
            else {
                primeSeq(n - 1)
            }
        }
    }

    primeSeq(n)

}
