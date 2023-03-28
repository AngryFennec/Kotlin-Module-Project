import java.util.*

class Archive(val name: String, ) {
    private val notes = mutableListOf<Note>()

    fun addNote() {
        println("Введите название заметки")
        val noteName = Scanner(System.`in`).nextLine()
        println("Введите текст заметки")
        val noteText = Scanner(System.`in`).nextLine()
        notes.add(Note(noteName, noteText))
    }

    fun showArchiveContent() {
        while (true) {
            println("Список заметок:")
            println("0. Создать заметку")
            notes.forEachIndexed { index, note -> println("${index + 1}. Заметка ${note.name}") }
            println("${notes.size + 1}. Выход")
            val input = Scanner(System.`in`).nextLine().toIntOrNull()
            if (input == null) {
                println("Нужно ввести число")
                continue
            }
            when (input) {
                0 -> {
                    println("Создаем заметку")
                    addNote()
                }
                in 1..notes.size -> {
                    println("Переходим в заметку ${input-1}")
                    notes[input-1].show()
                }
                notes.size + 1 -> {
                    println("Возвращаемся на экран выбора архивов")
                    return
                }
            }
        }
    }
}