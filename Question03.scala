object Question03 extends App {

    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()

    def sum(n: Int): Int = {

        if (n == 1) n else n + sum(n-1)
    }

    println(f"The sum is ${sum(n)}")
}
