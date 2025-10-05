import kotlin.random.Random
fun main(){
    val board = Array(3) { Array(3) {' '} }
    var curplayer ='X'
    var moves = 0
    println("Крестики-нолики: Ты (Х) против Компьютера (О)")
    printBoard(board)
while (true){
    if (curplayer == 'X') {
        println("Твой ход! Введите строку и столбец (0, 1 или 2) ")
        val row = readln().toInt()
        val col = readln().toInt()

        if (row !in 0..2 || col !in 0..2) {
            println("Неверные координаты. Должны быть 0, 1 или 2.")
            continue
        }
        if (board[row][col] != ' ') {
            println("Ячейка уже занята. Попробуйте снова.")
            continue
        }
        board[row][col] = curplayer
    }else{
        println("Ход компьютера:")
        val (row,col) = getCompMove(board)
        println("Компьютер выбрал: $row $col")
        board[row][col] = curplayer
    }
    moves++
    printBoard(board)
    if(checkWin(board,curplayer)){
        println(if(curplayer == 'X') "Ты победил!" else "Компьютер победил!")
        break
    } else if (moves == 9){
        println("Ничья!")
        break
    }
    curplayer = if (curplayer == 'X') 'O' else 'X'
}
    println("Игра окончена.")
}
fun printBoard(board: Array<Array<Char>>){
    println("  0 1 2")
    for (i in board.indices){
        print("$i ")
        println(board[i].joinToString("|") {if (it == ' ') "_" else it.toString()})
    }
    println()
}
fun checkWin(board: Array<Array<Char>>, player:Char ): Boolean{
    for ( i in 0..2){
        if(board[i][0]== player && board[i][1] == player &&  board[i][2] == player){
            return true
        }
        if(board[0][i]== player && board[1][i] == player &&  board[2][i] == player) {
            return true
        }
    }
    if(board[0][0]== player && board[1][1] == player &&  board[2][2] == player) {
        return true
    }
    if(board[0][2]== player && board[1][1] == player &&  board[2][0] == player) {
        return true
    }
    return false
}
fun getCompMove(board: Array<Array<Char>>): Pair<Int, Int> {
    val EmptyCells = mutableListOf<Pair<Int, Int>>()
    for ( i in 0..2){
        for (j in 0..2){
            if (board[i][j] == ' '){
                EmptyCells.add(Pair(i,j))
            }
        }
    }
    return EmptyCells[Random.nextInt(EmptyCells.size)]
}