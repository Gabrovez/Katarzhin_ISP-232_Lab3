fun CharacterCreation (name: String, level: Int = 1, ct: String = "Новичок"){
    println("Игрок: $name | Уровень: $level |Класс: $ct")
}
fun main(){
    CharacterCreation("Aragorn", 10, "Рыцарь")
    CharacterCreation("Legolas", 5)
    CharacterCreation("Gendalf")
}
