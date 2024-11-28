package lectures.part1basics

object ValuesVariablesTypes extends App{
	println("Hello Value")
	val x: Int = 23
	println(x)

	// VAL ARE IMMUTABLE
	// cannot re-assign x = 12

	// Compiler can infer types

	val aString: String = "Hello This is a String"
	val aBoolean: Boolean = false

	val aChar: Char = 'a'
	val anInt: Int = x
	val sShort: Short = 4613
	val aLong:Long = 52739822222222L
	val aFloat: Float = 2.0f
	val aDouble: Double = 3.14

	//variables
	// VAR ARE MUTABLE
	var aVariable: Int = 32
	println(aVariable)
	aVariable = 5
	println(aVariable)





}
