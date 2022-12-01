import java.io.File

class FileUtil {
    companion object {
        fun getInput(fileName: String): List<String> {
            return File("src/main/resources/$fileName.txt").useLines { it.toList() }
        }
    }
}
