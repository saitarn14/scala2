package lectures.part1basics

import scala.annotation.tailrec

/**
 * Created by saita on 04-12-2024.
 */
object DefaultArgs extends App {
	@tailrec
	def trFact(n: Int, acc: Int = 1): Int = {
		if (n <= 1) acc
		else trFact(n-1, n*acc)
	}

//	val fact10 = trFact(10,1)
	val fact10 = trFact(5,1)
	val fact10_1 = trFact(5)
	println(fact10)
	println(fact10_1)

	def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture.. "+ width + "x" + height)
//	savePicture("jpg", 800, 600)
	/*
	1. pass in every leading argument => savePicture("jpg", 800, 600)
	2. name the arguments savePicture(width = 800, height = 600)
	 */

	savePicture(width = 2000, height = 600)
	savePicture(height = 600)
	savePicture(format = "png")
}
