fun main(){
    spawnEnemy("Dismerat", 300)
    spawnEnemy("Король Тьмы", 500, true)
}
fun  spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false){
    println("Враг: $name Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}