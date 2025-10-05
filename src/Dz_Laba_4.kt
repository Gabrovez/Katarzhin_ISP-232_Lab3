fun main(){
    CreateWeapon("Sword")
    CreateWeapon("GreatSword", 12)
    CreateWeapon(25, true)
}
fun CreateWeapon(name: String){
    println("Оружие: $name")
}
fun CreateWeapon(name: String, damage: Int){
    println("Оружие: $name (Урон: $damage)")
}
fun CreateWeapon(damage: Int, magic: Boolean = false){
    println("${if (magic) "Магическое" else "Обычное"} оружие (Урон: $damage)")
}