package lectures.part1basics

/**
 * Created by saita on 01-12-2024.
 */
object CBNvsCBV extends App{
	def callByValue(x: Long): Unit = {
		println("by value: " + x)
		println("by value: " + x)

		// CALL BY VALUE = Sent value to function
	}

	def callByName(x: => Long): Unit = {
		println("by name: " + x)
		println("by name: " + x)
		// CALL BY NAME = Sent function[System.nanoTime()] to function [callByName()]
	}

	callByValue(System.nanoTime())
//	callByValue(545627786539500L)

	callByName(System.nanoTime())
//	callByName(System.nanoTime())

	def infinite(): Int = 1 + infinite()
	def printFirst(x: Int, y: => Int): Unit = println(x)

//	printFirst(infinite(), 24)
	printFirst(24, infinite())
}
