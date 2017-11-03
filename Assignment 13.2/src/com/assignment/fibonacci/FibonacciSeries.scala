package com.assignment.fibonacci



//A Fibonacci series (starting from 1) written in order without any spaces in between, 
//thus producing a sequence of digits.  
//Write a Scala application to find the Nth digit in the sequence. 
// Write the function using standard for loop 
//○  Write the function using recursion
object FibonacciSeriesWithLoop {
  def fibonacciSeries(n: Int): Int = {
    var a = 0
    var b = 1
    var i = 0


    while (i < n) {
      val c = a + b
      a = b
      b = c
      i = i + 1
    }
    return a;
  }

  def fib3(n: Int): Int = {
    def fib_tail(n: Int, a: Int, b: Int): Int = n match {
      case 1 => a
      case _ => fib_tail(n - 1, b, a + b)
    }
    return fib_tail(n, 1, 1)
  }
  def main(args: Array[String]) {
    print("Fibonacci series with loop     :\t ");
    var n = 10
    for (i <- 1 to n) {
      print(fibonacciSeries(i));
    }

    println("\t");
    print("Fibonacci series with recursion :\t ");

    for (i <- 1 to n) {
      print(fib3(i));
    }

  }
}