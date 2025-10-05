fun main(){
    showPlayerStatus("Aragorn", 100)
    showPlayerStatus("Legolas", 85)
}
fun showPlayerStatus (name: String, health: Int){
    println("Игрок: $name | Здоровье: $health HP")
}