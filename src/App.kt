fun upgWeapon (weapon: MutableSet<String>){
    weapon.add("Улучшение +1")
}
fun main(){
    val sword = mutableSetOf("Меч")
    upgWeapon(sword)
    println(sword)

}
