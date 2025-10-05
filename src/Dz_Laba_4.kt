fun main(){
    spawnEnemy("Dismerat")
    spawnEnemy("Векна", isBoss = true)
}
fun  spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false){
    println("Враг: $name Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}