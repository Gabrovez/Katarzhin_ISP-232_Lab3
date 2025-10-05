fun attack(){
    println("Атака по воздуху!")
}
fun attack(enemy: String){
    println("Атакован $enemy!")
}
fun attack(enemy: String, damage: Int){
    println("Атакован $enemy c уроном $damage HP!")
}
fun main(){
    attack()
    attack("Гоблин")
    attack("Дракон", 50)
}
