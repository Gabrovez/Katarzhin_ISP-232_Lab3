fun cc(): () -> Int{
    var  count = 0
    return {++count}
}
fun main(){
    val kills = cc()
    println(kills())
    println(kills())

}
