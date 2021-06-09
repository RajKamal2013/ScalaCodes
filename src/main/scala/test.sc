import scala.collection.mutable.{ArrayBuffer, ListBuffer}

def evenNumbersMultiplied(numbers:List[Integer]):List[Integer] =
  numbers.filter(_%2 == 0).map(_* 10)

var num:List[Integer] = List(1, 2, 10)
println(num)

var nums = evenNumbersMultiplied(num)

var data = ArrayBuffer(1, 2, 3, 4)
println(data)

var ldata = ListBuffer(1, 4, 6, 9 )
println(ldata)