object Question05 extends App {

    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()

    val number = n - 1

    def sumOfEven(n: Int): Int = {

        if (n == 2) {
            n
        }
        else {
            if (n % 2 == 0) {
                n + sumOfEven(n-1)
            }
            else {
                sumOfEven(n-1)
            }
        }
    }

    println(f"The sum is ${sumOfEven(number)}")
}
