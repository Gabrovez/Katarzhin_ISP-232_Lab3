fun main(){
    Heal()
    Heal(22)
    Heal(25, true)
}
fun Heal(){
    println("Вы исцелились на 10 HP")
}
fun Heal(amount: Int){
    println("Вы исцелились на $amount HP")
}
fun Heal(amount: Int, isPotion: Boolean){
    if (isPotion){
        println("Выпито зелье (+$amount HP)")
    }else{
        println("Заклинание лечения (+$amount HP)")
    }

}