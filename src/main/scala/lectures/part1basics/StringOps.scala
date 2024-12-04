package lectures.part1basics

/**
 * Created by saita on 04-12-2024.
 */
object StringOps extends App {
	val str: String = "Hi There, We are all in Scala"

	// JAVA String Class
	println(str.charAt(4))
	println(str.substring(5, 12))
	println(str.split(" ").toSeq)
	println(str.split(" ").toList)
	println(str.startsWith("JO"))
	println(str.replace(" ","-"))
	println(str.toLowerCase())
	println(str.toUpperCase())
	println(str.length)

	val aNumberString = "39"
	val aNumber = aNumberString.toInt
	println('a' +: aNumberString :+ 'z')

	//S-interpolators
	val name = "JoJo"
	val age = 23
	val greeting = s"Hello, I'm $name and I'm $age years old"
	val anotherGreeting = s"Hello, My name is $name and I will be turning ${age + 1} years olds."
	println(greeting)
	println(anotherGreeting)


	//F-interpolator

	val speed = 1.2f
	val myth = f"$name can eat $speed%2.4f apples per minute."

	println(myth)


	// raw -interpolator
	println(raw"This is a \n newline")
}
