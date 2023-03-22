import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val archives = intArrayOf(0, 1, 2)
    while (true) {
        println("Список архивов:")
        println("0. Создать архив")
        archives.forEachIndexed { index, archive -> println("${index + 1}. Архив ${index}") }
        println("${archives.size + 1}. Выход")
        val input = scanner.nextInt() // Добавить обработку нечислового ввода
        when (input) {
            0 -> {
                println("Создаем архив")
            }
            in 1..archives.size -> {
                println("Переходим в архив ${input-1}")
            }
            archives.size + 1 -> {
                println("Выходим из программы")
                return
            }
        }
    }
}