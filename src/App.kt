fun ae(eff: (Int) -> Int){
    val h = 100
    println("Новое здоровье: ${eff(h)} ")
}
fun main(){
    ae { it + 20 }
    ae { it - 50 }

}
