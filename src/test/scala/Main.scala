
object Main {
  def main(args:Array[String]) ={

    val printer = new Printer(Array("1","s","3"))
    printer.sum((value, index) => value.toInt - index)
    println(printer.getTotal())
    println(printer.getTotal())

    val pairs = Array(1,2,3,4).filter(i -> loquesea(i))
    pairs.count(x => true)
    pairs.count(x => true)

    val rdd : Array[String] = Array("willia,roses","andres,blanco")



    println(Array("1","2","3","4").map(_.toInt).reduce((x, y) => x + y))


    val newPrinter = new Printer(Array("a1","a2","a3"))

    println(newPrinter.sum((value, index) => { value.charAt(1).toString.toInt * index}))

  }

  def loquesea(value : Int): Boolean = {
    return true
  }
}

class Printer(names : Array[String]) {
  var _f : (String, Int) => Int = null
  def sum(f : (String, Int) => Int) {
    _f = f
  }

  def getTotal() : Int = {
    var sum = 0
    for(i <- 0 until names.length) {
      sum += _f(names(i), i)
    }
    sum
  }

}