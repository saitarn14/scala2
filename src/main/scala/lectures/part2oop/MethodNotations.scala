package lectures.part2oop

import scala.language.postfixOps

/**
 * Created by saita on 05-12-2024.
 */
object MethodNotations extends App {
	println("test")
	class Person(val name: String, favoriteMovie: String) {
		def likes(movie: String): Boolean = {
			movie == favoriteMovie
		}

		def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
		def +(person: Person): String = s"${this.name} is hanging out plus with ${person.name}"
		def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
		def unary_! : String = s"$name What 's up"
		def isAlive: Boolean = true
		def apply(): String = s"Hi my apply, my name is $name and I like $favoriteMovie"

	}

	val fonfon = new Person("FONFon", "Interstella")
	println(fonfon.likes("interstella"))
	println(fonfon likes "interstella") // equivalent
	// infix notation = operator notation (syntactic sugar)


	// "operators" in scala
	val tom = new Person("Tom", "Conair")
	println(fonfon hangOutWith tom)

	println(fonfon + tom)
	println(fonfon.+(tom))

	println(1.+(2))

	// ALL OPERATION ARE METHODS
	// Akka actors have ! ?

	//prefix notation
	val x = -1  //equivalent with 1.unary_-
	val y = 1.unary_-
	// unary_ prefix only works with - + ~ !

	println(y)
	println(!fonfon)
	println(fonfon.unary_!)

	// postfix notation
	println(fonfon.isAlive)
	println(fonfon isAlive)

	//apply
	println(fonfon.apply())
	println(fonfon()) //equivalent .apply()


	//exercise
	/*
	1. overload the + operator
	   mary + the rockstar" => new person "Mary (the rockstar)"
	2. Add an age to the Person class
	   Add a unary + operator => new person with the age + 1
	   +mary => mary with the age incrementer
	3. Add a "learns" method in the Person class => "Mary learns Scala"
	   Add a learnsScala method, calls learns method with "Scala"
	4. Overload the apply method
	   mary.apply(2) => "Mary watched Inception 2 times"
	 */
	println((fonfon + "The rock star")())
	println((fonfon + "The rock star").apply())
}
