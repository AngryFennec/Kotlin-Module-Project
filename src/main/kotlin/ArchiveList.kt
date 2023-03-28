import java.util.*

class ArchiveList {
    val archives = mutableListOf<Archive>()

    fun addArchive() {
        println("Введите название архива")
        val name = Scanner(System.`in`).nextLine()
        archives.add(Archive(name))
    }
}