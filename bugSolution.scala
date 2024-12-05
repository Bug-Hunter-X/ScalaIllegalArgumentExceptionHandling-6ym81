```scala
class MyClass(val name: String) {
  private var _value: Int = 0

  def value: Int = _value

  def value_=(newValue: Int): Unit = {
    if (newValue < 0) {
      throw new IllegalArgumentException("Value cannot be negative")
    }
    _value = newValue
  }
}

object Main extends App {
  val myObject = new MyClass("MyObject")
  try {
    myObject.value = 10
    println(myObject.value) //Prints 10
    myObject.value = -5 //Throws IllegalArgumentException
  } catch {
    case e: IllegalArgumentException => {
      println("Error: " + e.getMessage)
    }
  }
}
```