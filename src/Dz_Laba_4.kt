fun main(){
    createQuest("Найти кота")
    createQuest("Спасти принцессу", 100,true)
}
fun  createQuest(title: String, reward: Int = 50, isMain: Boolean = false){
    println("Квест: $title (Награда: $reward золота${if (isMain) " | ОСНОВНОЙ" else ""})")
}