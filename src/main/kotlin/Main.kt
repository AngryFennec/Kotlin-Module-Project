import java.util.Scanner

fun main() {
    val archiveList = ArchiveList()
    while (true) {
        println("Список архивов:")
        println("0. Создать архив")
        archiveList.archives.forEachIndexed { index, archive -> println("${index + 1}. Архив ${archive.name}") }
        println("${archiveList.archives.size + 1}. Выход")
        val input = Scanner(System.`in`).nextLine().toIntOrNull()
        if (input == null) {
            println("Нужно ввести число")
            continue
        }
        input.toInt()
        when (input) {
            0 -> {
                println("Создаем архив")
                archiveList.addArchive()
            }
            in 1..archiveList.archives.size -> {
                println("Переходим в архив ${archiveList.archives[input-1].name}")
                archiveList.archives[input-1].showArchiveContent()
            }
            archiveList.archives.size + 1 -> {
                println("Выходим из программы")
                return
            }
        }
    }
}