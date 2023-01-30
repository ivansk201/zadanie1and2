fun main() {
    print("Введите чему будет равно первое число: ")
    var pervoe = readLine()
    var perv: Double = pervoe!!.toDouble()
    print("Введите чему будет равно второе число: ")
    var vtoroe = readLine()
    var vtor: Double = vtoroe!!.toDouble()
    if (perv > vtor)
        perv++
    else if (vtor>perv)
        vtor++
    else perv = perv * perv * perv
    println("Первое число $perv,второе число $vtor")
}