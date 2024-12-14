package feedback6

import android.content.Context
import java.io.File

class InternalStorageManager(private val context: Context) {

    fun saveFile(fileName: String, content: String) {
        val file = File(context.filesDir, fileName)
        file.writeText(content)
    }

    fun readFile(fileName: String): String? {
        val file = File(context.filesDir, fileName)
        return if (file.exists()) file.readText() else null
    }
}
