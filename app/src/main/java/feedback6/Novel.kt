package feedback6

data class Novel(
    val title: String,
    val author: String,
    val year: Int,
    val description: String,
    val isFavorite: Boolean
)

fun sampleNovels() = listOf(
    Novel("Cien Años de Soledad", "Gabriel García Márquez", 1967, "Una novela clásica", false),
    Novel("1984", "George Orwell", 1949, "Distopía política", true),
    Novel("El Principito", "Antoine de Saint-Exupéry", 1943, "Un cuento filosófico", false)
)


