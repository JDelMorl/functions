//fun addSomeNumbers(b: Int, y: Int): Int{
//    var ans = (b + y)
//    return ans
//}
//
//fun main(){
//    var z = addSomeNumbers(b = 2,y = 4)
//    println(z)
//}
fun main(){
    var userAns = 0
    var sqAns = 0
    var lengthAns = 0
    var heightAns = 0
    var cirAns = 0
    println("Please enter the number of shape you would like to solve the area of: ")
    println("1) Square")
    println("2) Rectangle")
    println("3) Triangle")
    println("4) Circle")
    print("Enter Your Choice: ")
    userAns = readLine()!!.toInt()
    if (userAns == 1) {
        print("Enter the one sides of the square: ")
        sqAns = readLine()!!.toInt()
        println("The area of the square is " + square(sqAns))
    }else if(userAns == 2) {
        print("Enter the length of the rectangle: ")
        lengthAns = readLine()!!.toInt()
        print("Enter the height of the rectangle: ")
        heightAns = readLine()!!.toInt()
        println("The area of the rectangle is " + rectangle(lengthAns, heightAns))
    }else if(userAns == 3) {
        print("Enter the base of the triangle: ")
        lengthAns = readLine()!!.toInt()
        print("Enter the height of the triangle: ")
        heightAns = readLine()!!.toInt()
        println("The area of the rectangle is " + triangle(lengthAns, heightAns))
    }else if (userAns == 4) {
        print("Enter the radius of the circle: ")
        cirAns = readLine()!!.toInt()
        println("The area of the circle is " + circle(cirAns))
    }
}
fun square(a: Int): Int{
    val area = a * a
    return area

}
fun rectangle(a: Int, b: Int): Int{
    val area = a * b
    return area

}
fun triangle(a: Int, b: Int): Double{
    val area = .5 * a * b
    return area

}
fun circle(a: Int): Double{
    val area = 3.14 * (a * a)
    return area

}