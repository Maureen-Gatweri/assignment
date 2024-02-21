fun main() {


    greetingName("Gatweri")
    var m = modulus(45, 57)
    println(m)
    println(add(53, 7.8, 7, 7))
    var p=interestingFactAboutMe("Gatweri", "means peace")
    println(p)

}





 fun greetingName (name: String) {
     var name = "Hello ${name}"
     println(name)
 }
     fun modulus(num1: Int, num2: Int): Int{
     var result = num1 % num2
     return result
 }
    fun add(num3: Int, num4: Double, num5:Int, num6: Int): Double {
        var result = num3 + num4 + num5 + num6
        return result
    }
    fun interestingFactAboutMe(name: String, fact: String): String{
        var funFact=name+" "+fact
        return funFact

    }





