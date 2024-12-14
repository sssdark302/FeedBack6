package feedback6

import android.content.Context
import java.io.File

class ExternalStorageManager(private val context: Context) {

    fun saveFile(fileName: String, content: String): Boolean {
        val externalDir = context.getExternalFilesDir(null) ?: return false
        val file = File(externalDir, fileName)
        file.writeText(content)
        return true
    }

    fun readFile(fileName: String): String? {
        val externalDir = context.getExternalFilesDir(null) ?: return null
        val file = File(externalDir, fileName)
        return if (file.exists()) file.readText() else null
    }
}
