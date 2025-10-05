fun CreateItem (name: String, price: Int, Magic: Boolean = false){
    println("Предмет: $name | Цена: $price${if (Magic) " (магический)" else ""}")
}
fun main(){
    CreateItem("Sword", 50)
    CreateItem(price = 200, name = "Potion")
    CreateItem("Staff", Magic = true, price = 150)
}
