package lectures.part1basics

import scala.annotation.tailrec

/**
 * Created by saita on 29-11-2024.
 */
object Functions extends App{

	def aFunction(a: String, b: Int): String =
		a + " " + b

	println(aFunction("JOJO", 10))

	def aParameterlessFunction(): Int = 42

	println(aParameterlessFunction())
//	println(aParameterlessFunction)

	def aRepeatedFunction(aString: String, n: Int): String = {
		if (n == 1) aString
		else aString + aRepeatedFunction(aString, n-1)
	}
	println(aRepeatedFunction("SSaiJO", 3))


	// Unit === void
	def aFunctionWithSideEffects(aString: String): Unit = println(aString)

	def aBigFunction(n: Int): Int =  {
		def aSmallFunction(a: Int, b: Int): Int = a + b

		aSmallFunction(n , n-1)
	}

	def greetingForKids(name: String, age: Int): Unit = {
		println("Hi, my name is " + name + " and I am " + age + " years old")
//		println("Hi, my name is ${name} and I am $age years old")
	}
	greetingForKids("jojokid", 7)

	def factoriaFunction(n: Int):Int = {
		if (n <=0) 1
		else n * factoriaFunction(n-1)
	}
	println(factoriaFunction(5))

	def fibonacciFunction(n: Int):Int = {
		if (n <= 2) {
//			println("1")
			1
		} else {
//			println(fibonacciFunction(n-1) + fibonacciFunction(n-2))
			fibonacciFunction(n-1) + fibonacciFunction(n-2)
		}

	}
	println(fibonacciFunction(8))
//	fibonacciFunction(8)

	def isPrimeFunction(n: Int): Boolean = {
		@tailrec
		def isPrimeUntil(t: Int): Boolean = {
			if (t <= 1) true
			else n % t != 0 && isPrimeUntil(t-1)
		}
		isPrimeUntil(n / 2)

	}
	println(isPrimeFunction(37))
	println(isPrimeFunction(200))
	println(isPrimeFunction(201))
	println(isPrimeFunction(-1))
}
