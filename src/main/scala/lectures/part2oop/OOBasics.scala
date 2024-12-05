package lectures.part2oop

/**
 * Created by saita on 05-12-2024.
 */
object OOBasics extends App {
	val person = new Person("Saiarn", 31)
	println(person.x)
//	println(person.greet("saitarn111"))
	person.greet("FONFON")
	person.greet()

	// TODO
	val author1 = new Writer("JO WriterName", "Jo Writer LNAME", 1999)
	val author2 = new Writer("JO2 WriterName", "Jo2 Writer LNAME", 1999)
	val novel = new Novel("The Most Important book", 2004, author1)

	println(novel.authorAge)
	println(novel.isWrittenBy(author1))

	// TODO
	val counter = new Counter
	counter.inc.print
	counter.inc.inc.inc.print
	counter.inc(10).print

}

// constructor
class Person(name: String, val age: Int) {
	//body
	val x = 2

	println(1 + 3)

	def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
//	def greet(name: String): Unit = println(s"$name says: Hi, $name")

	//overloading
	def greet(): Unit = println(s"Hi, I'm ${this.name}")

	//multiple constructors
	def this(name: String) = this(name, 0)
	def this() = this("Fon Poko")

}

// class parameters are NOT FIELDS

/*
Novel and a Writer

Writer : first name , lastname , year of birth
- method fullname

Novel : name, year of release, author
- authorAge
- isWrittenby(author)
- copy (new year of release) = new instance of Novel
 */

class Writer(firstname: String, lastname: String, val yearOfBirth: Int) {
	def fullname: String = firstname + " " + lastname

}

class Novel(name: String, year: Int, author: Writer) {
	def authorAge = year - author.yearOfBirth
	def isWrittenBy(author: Writer) = author == this.author
	def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
Counter class
-  receives an int value
- method current count
- method to increment /decrement => new Counter
- overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
	def inc = {
		println("incrementing")
		new Counter(count + 1)
	} //immutability

	def dec = {
		println("decrementing")
		new Counter(count - 1)
	} //immutability

	def inc(n: Int): Counter = {
		if (n <= 0) this
		else inc.inc(n-1)
	}

	def dec(n: Int): Counter = {
		//		new Counter(count - n)
		if (n <= 0) this
		else dec.dec(n-1)
	}
	def print = println(count)
}
