fun  main(){
    val options = arrayOf("Камень", "Бумага", "Ножницы")
    val Gcho = GetGameCgoice(options)
    val Ucho = GetUserChoice(options)
    printres(Ucho,Gcho)
}
fun GetGameCgoice(optParam: Array<String>) = optParam[(Math.random() * optParam.size).toInt()]
fun GetUserChoice(optParam: Array<String>): String{
    var isvc = false
    var Ucho = ""
    while(!isvc){
        print("Пожалуйста введите одно из следующих значений: ")
        for(item in optParam) print(" $item")
        println()
        val usi = readLine()
        if (usi != null && usi in optParam) {
            isvc = true
            Ucho = usi
        }
        if (!isvc) println("Неверный ввод.")
    }
    return Ucho
}
fun printres(Ucho: String, Gcho: String){
    val res: String
    if (Ucho == Gcho) {
        res = "Ничья!"
    } else  if ((Ucho == "Камень" && Gcho == "Ножницы") || (Ucho == "Бумага" && Gcho == "Камень") || (Ucho == "Ножницы" && Gcho == "Бумага")
        ){
        res = "Вы победили!"
    } else {
        res = "Вы проиграли!"
    }
    println("Выш выбор $Ucho. Я выбираю $Gcho. $res")
}