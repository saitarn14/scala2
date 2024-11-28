package lectures.part1basics

/**
 * Created by saita on 28-11-2024.
 */
object Expressions extends App{
	val x :Int = 1 + 2

	println(2 * 4 + 1)

	println(1 == x)
	println(!(1 == x))
	var aVariable = 2

	println(aVariable)
	aVariable += 3
	println(aVariable)

	// IF Expression
	private val aCondition = true
	private val aConditionedValue = if (aCondition) 9 else 7
	println(aConditionedValue)
	println(if(aCondition) 9 else 7)


	//LOOP
	println("LOOP\n")
	var i = 0
	while (i < 10) {
		println(i)
		i += 1
	}

	val aWeirdValue = (aVariable = 3) //Unit === vode
	println(aWeirdValue)

	val aCodeBlock: String = {
		val y: Int = 2
		val z: Int = y + 1

		if (z > 2) "hello" else "goodbye"
	}

//	val anotherValue = z + 1
	val someValue = {
		2 < 3
	}
	println(someValue)

	val someOtherValue = {
		if(someValue) 234 else 998
		88

	}
	println(someOtherValue)
}

