fun main(){
    Castspell()
    Castspell("Fireball")
    Castspell("Fireball", 10)
}
fun Castspell(){
    println("Каст случайного заклинания")
}
fun Castspell(spell: String){
    println("Каст заклинания $spell")
}
fun Castspell(spell: String, power: Int){
    println("Каст $spell с силой $power")
}