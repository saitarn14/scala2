package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

/**
 * Created by saita on 01-12-2024.
 */
object Recursion extends App{
	def factorial (n: Int): Int = {
		if (n <= 1) 1
		else {
			println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
			val result = n * factorial(n-1)
			println("Computed factorial of " + n)
			result
		}
	}

	println(factorial(10))

	def anotherFactorial(n: Int): BigInt = {
		@tailrec
		def factHelper(x: Int, accumulator: BigInt): BigInt = {
			if (x <= 1) accumulator
			else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

		}
		factHelper(n, 1)
/*
		anotherFactorial(10) = factHelper(10,1)
		= factHelper(9, 10 * 1)
		= factHelper(8, 9 * 10 * 1)
		= factHelper(7, 8 * 9 * 10 * 1)
		...
		= factHelper(2, 3 * 4 * ... * 9 * 10 * 1)
		= factHelper(1, 1 * 2 * 3 * 4 * ... * 10 * 1)
*/
	}
	println(anotherFactorial(20))

	// WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

	/*
	1. Concatenate a string n times
	2. IsPrime function tail recursive
	3. Fibonacci function, tail recursive

	 */

	def tailStringConcat(s: String, n: Int):String = {
		@tailrec
		def stringConcatHelper(aString: String, x: Int, accmulateString: String):String = {
			println("stringConcatHelper() called with string=" + accmulateString)
			if (x == 0 ) accmulateString
			else stringConcatHelper(aString, x-1, s+ accmulateString)
		}
		stringConcatHelper(s,n,"")
	}
	println(tailStringConcat("Ss", 3))

	def isPrime(n: Int): Boolean = {
		@tailrec
		def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
			if (!isStillPrime) false
			else if (t <= 1) true
			else isPrimeTailrec(t-1, n % t != 0 && isStillPrime)
		}
		isPrimeTailrec(n / 2, isStillPrime = true)
	}
	println(isPrime(2004))


}
