fun main(){
    println(checkInventory("Меч"))
    println(checkInventory("Кот"))
    println(checkInventory("Зелье"))
}
fun  checkInventory(item: String): Boolean{
    val items  = arrayOf("Меч", "Кот")
    var ans = false
    if(item in items){
        ans = true
    }
    return  ans
}