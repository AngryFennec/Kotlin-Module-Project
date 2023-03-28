import java.util.*

class Note(val name: String, val text: String) {
    fun show() {
        println("Заметка ${name}:")
        println(text)
        println("")
        println("Для возврата введите любую строку")
        Scanner(System.`in`).nextLine()
    }
}