fun clcDamage (baseD: Int, mult: Double): Int{
    return (baseD * mult).toInt()
}
fun main(){
    val damege = clcDamage(50, 1.5)
    println("Нанесён урон: $damege HP")

}
