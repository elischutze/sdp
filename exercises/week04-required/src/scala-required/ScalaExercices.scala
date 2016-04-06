


// #### REPL Exercises#####

// $ scala
// Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_66).
// Type in expressions to have them evaluated.
// Type :help for more information.

//  ### 1. Create a value identifier and store (and print) the value 17.

// scala> val x = 17
// x: Int = 17

// scala> x
// res0: Int = 17

// ### 2. Using the value you just stored (17), try to change it to 20. What happened?

// scala> x = 20
// <console>:11: error: reassignment to val
//        x = 20
//          ^

// # Got an error because values are final.

// ### 3. Store (and print) the value ABC1234".

// scala> val y = "ABC1234"
// y: String = ABC1234

// ### 4. Using the value you just stored (ABC1234), try to change it to DEF1234". What
// happened?

// scala> y = "DEF1234"
// <console>:11: error: reassignment to val
//        y = "DEF1234"
//

// # Same error.  ^

// 5. Store the value 15.56. Print it.

// scala> val r = 15.56
// r: Double = 15.56

// scala> println(r)
// 15.56

// scala>

import scala.math._
import atomicscala.AtomicTest._


// ######## EXPRESSIONS #######

object Expresions {


  def main(args: Array[String]): Unit = {

    var temp = 32
    var sky = "partly cloudy"

    printf("The temperature is %s degrees and the sky is %s.\n", temp, sky)

    // 1. Write an expression that evaluates to true if the sky is sunny and the temperature
    // is more than 80 degrees.

    var exp1 = if (sky == "sunny" && temp > 80) true else false
    printf("Expression 1: %s\n", exp1)

    // 2. Write an expression that evaluates to true if the sky is either sunny or partly cloudy
    // and the temperature is more than 80 degrees.

    var exp2 = if (temp > 80 && (sky == "sunny" || sky == "partly cloudy")) true else false
    printf("Expression 2: %s\n", exp2)

    // 3. Write an expression that evaluates to true if the sky is either sunny or partly cloudy
    // and the temperature is either more than 80 degrees or less than 20 degrees.

    var exp3 = if ((temp > 80 || temp < 20) && (sky == "sunny" || sky == "partly cloudy")) true else false
    printf("Expression 3: %s\n", exp3)

    //4. Convert Fahrenheit to Celsius.
    // Hint: first subtract 32, then multiply by 5/9. If you get 0, check to make sure you
    // didnt do integer maths.
    var F = 45
    def FtoC(f: Double) = {
      (f - 32) * (5 / 9.0)
    }
    printf("%d degrees F = %.1f degrees C\n", F, FtoC(F))
    // 5. Convert Celsius to Fahrenheit.
    // Hint: first multiply

    var C = 10
    def CtoF(c: Double) = {
      c * (5 / 9) + 32
    }
    printf("%d degrees C = %.1f degrees F\n", C, CtoF(C))

  }
}

// ####### METHODS #######

object Methods {

  // 	1. Create a method getSquare that takes an Int argument and returns its square.

  def getSquare(n: Int) = {
    pow(n, 2)
  }


  // 2. Create a method isArg1GreaterThanArg2 that takes two Double arguments. Return
  // true if the first argument is greater than the second. Return false otherwise.

  def isArg1GreaterThanArg2(arg1: Double, arg2: Double) = {
    if (arg1 > arg2) true else false
  }


  // 3. Create a method manyTimesString that takes a String and an Int as arguments
  // and returns the String duplicated that many times.

  def manyTimesString(str: String, times: Int) = {
    var many = ""
    for (_ <- 1 to times) many += str
    many
  }


  def main(args: Array[String]): Unit = {

    //       getSquare(n)
    // Print your answer. Test using the following code.
    println("\nTesting getSquare() method...")
    val a = getSquare(3)
    printf("The square of 3 is %s\n", a)
    assert(a == 9)
    val b = getSquare(6)
    printf("The square of 6 is %s\n", b)
    assert(b == 36)
    val c = getSquare(5)
    printf("The square of 5 is %s\n", c)
    assert(c == 25)

    // Print your answer. Satisfy the following:
    println("\nTesting isArg1GreaterThanArg2() method...")
    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    assert(t1 == false)
    printf("4.1 > 4.12? %s\n", t1)
    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    assert(t2 == true)
    printf("2.1 > 1.2? %s\n", t2)


    //Print your answer. Satisfy
    // the following:
    println("\nTesting manyTimesString() method...")
    val m1 = manyTimesString("abc", 3)
    assert("abcabcabc" == m1, "Your message here")
    printf("3 times abc: %s\n", m1)
    val m2 = manyTimesString("123", 2)
    assert("123123" == m2, "Your message here")
    printf("2 times 123: %s\n", m2)

  }

}

// Classes & Objects

object ObjectsAndClasses extends App {

  // 1. Create a Range object and print the step value. Create a second Range object with
  // a step value of 2 and then print the step value. Whats different?

  // ## The step value by default is 1 !

  var range1 = 0 until 100
  println("range1 step value: " + range1.step)
  var range2 = 0 until 100 by 2
  println("range2 step value: " + range2.step)

  // 2. Create a String object s1 (as a var) initialised to "Sally". Create a second String
  // object s2 (as a var) initialised to "Sally". Use s1.equals(s2) to determine if the
  // two Strings are equivalent. If they are, print s1 and s2 are equal, otherwise
  // print s1 and s2 are not equal.

  var str1 = "Sally"
  var str2 = "Sally"

  if (str1.equals(str2)) println("s1 = s2") else println("s1 != s2")


  //  Create classes for Hippo, Lion, Tiger, Monkey, and Giraffe

  class Hippo {}

  class Lion {}

  class Tiger {}

  class Monkey {}

  class Giraffe {}

  // create an instanceof each one of those classes. Display the objects. Do you see five different ugly-looking (but unique) strings? Count and inspect them.

  println(new Hippo())
  println(new Lion())
  println(new Tiger())
  println(new Monkey())
  println(new Giraffe())
  println("")
  println(new Lion())
  println(new Giraffe())
  println("")

  // 2. Create a second instance of Lion and two more Giraffes. Print those objects.
  // How do they differ from the original objects that you created?

  // ## They have different IDs!

  // 	1. Create a Sailboat class with methods to raise and lower the sails, printing Sails
  // raised, and Sails lowered, respectively.

  class Sailboat {

    def raiseSails() = {
      "Sails Raised!"
    }

    def lowerSails() = {
      "Sails Lowered!"
    }

  }


  // Create a Motorboat class with methods to start and stop the motor, returning
  // Motor on, and Motor off, respectively.

  class Motorboat {
    def startMotor() = {
      "Motor On!"
    }

    def stopMotor() = {
      "Motor Off!"
    }
  }


  //Create an object (instance) of the
  // Sailboat class.

  //Use assert for verification:
  val sailboat = new Sailboat
  val r1 = sailboat.raiseSails()
  println(r1)
  assert(r1 == "Sails Raised!", "Expected Sails raised, Got " + r1)

  val r2 = sailboat.lowerSails()
  println(r2)
  assert(r2 == "Sails Lowered!", "Expected Sails lowered, Got " + r2)

  val motorboat = new Motorboat
  val s1 = motorboat.startMotor()
  println(s1)
  assert(s1 == "Motor On!", "Expected Motor on, Got " + s1)

  val s2 = motorboat.stopMotor()
  println(s2)
  assert(s2 == "Motor Off!", "Expected Motor off, Got " + s2)

  // 	Create a new class Flare. Define a light method in the Flare class.

  class Flare {
    def light() = {
      "Flare used!"
    }
  }

  // Satisfy the following:

  val flare = new Flare
  val f1 = flare.light
  println(f1)
  assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

  // 	In each of the Sailboat and Motorboat classes, add a method signal that creates
  // a Flare object and calls the light method on the Flare.

  class Sailboat2 {

    def raiseSails() = {
      "Sails Raised!"
    }

    def lowerSails() = {
      "Sails Lowered!"
    }

    def signal() = {
      val flare = new Flare()
      flare.light
    }

  }

  class Motorboat2 {
    def startMotor() = {
      "Motor On!"
    }

    def stopMotor() = {
      "Motor Off!"
    }

    def signal() = {
      val flare = new Flare()
      flare.light
    }
  }

  //Satisfy the following:

  val sailboat2 = new Sailboat2
  val signal = sailboat2.signal()
  println("Sailboat2: " + signal)
  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

  val motorboat2 = new Motorboat2
  println("Motorboat2: " + signal)
  val flare2 = motorboat2.signal()
  assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

 //// Fields in Classes ///

  class Cup {
    var percentFull = 0
    val max = 100

    def add(increase:Int):Int = {
      percentFull += increase
      if(percentFull > max) {
        percentFull = max
      }
      percentFull // Return this value
    }
  }

  val cup = new Cup
  cup.add(45) is 45
  cup.add(-15) is 30
  cup.add(-50) is -20

  class Cup2 {
    var percentFull = 0
    val max = 100
    val min = 0

    def add(increase:Int):Int = {
      percentFull += increase
      if(percentFull > max) {
        percentFull = max
      }
      else if(percentFull < min){
        percentFull = min
      }
      percentFull // Return this value
    }

    def set(pfull:Int) = {
      percentFull = pfull
    }

    def get():Int = {
      return percentFull
    }
  }

  val cup2 = new Cup2
  cup2.add(45) is 45
  cup2.add(-55) is 0
  cup2.add(10) is 10
  cup2.add(-9) is 1
  cup2.add(-2) is 0

  cup2.percentFull = 65
  cup2.percentFull is 65

  val cup3 = new Cup2
  cup2.set(56)
  cup2.get() is 56












}









