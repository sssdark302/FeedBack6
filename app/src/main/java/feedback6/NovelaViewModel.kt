package feedback6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NovelaViewModel : ViewModel() {
    private val _novelas = MutableLiveData<List<Novel>>(listOf())
    val novelas: LiveData<List<Novel>> get() = _novelas

    fun agregarNovela(novela: Novel) {
        _novelas.value = _novelas.value.orEmpty() + novela
    }

    fun eliminarNovela(novela: Novel) {
        _novelas.value = _novelas.value.orEmpty() - novela
    }

    fun marcarFavorita(novela: Novel) {
        _novelas.value = _novelas.value.orEmpty().map {
            if (it.title == novela.title) it.copy(isFavorite = true) else it
        }
    }
}
