fun oe (et: String, action: (String) -> Unit){
    println("Cобытие: $et")
    action(et)
}
fun main(){
    oe("Rain") {
        println("Player get status 'Wet'")
    }

}
