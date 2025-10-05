fun usePotion(name: String, power : Int){
    println("Использовано $name (+$power HP)")
}
fun usePotion(power : Int, name: String ){
    println("Использовано $name (+$power MP)")
}
fun main(){
    usePotion("Лечебное",50)
    usePotion(30, "Магическое")
}
