fun attack(enemy: String){
    println("Атакован $enemy!")
}
fun attack(enemyid: Int){
    println("Атакован враг с ID $enemyid!")
}
fun main(){
    attack("Орк")
    attack(1001)
}
