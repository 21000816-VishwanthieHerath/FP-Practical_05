import scala.io.StdIn
object Question04 extends App {

    def input(): List[Int] = {
        print("Enter numbers and q to stop : ")
        val inputs = scala.io.StdIn.readLine()
        if (inputs.toLowerCase == "q") List.empty
        else inputs.toInt :: input()
    }

    def evenOrOdd(numbers: List[Int]): (List[Int], List[Int]) =  numbers match {
        case Nil => (List.empty, List.empty)
        case head :: tail => val (even, odd) = evenOrOdd(tail)
        if (head % 2 == 0) (head :: even, odd)
        else (even, head :: odd)
    }


    def Print(numbers: List[Int]): Unit = {
        val (even, odd) = evenOrOdd(numbers)
        println("Even numbers: " + even.mkString(", "))
        println("Odd numbers: " + odd.mkString(", "))
    }

    Print(input())
    
}
