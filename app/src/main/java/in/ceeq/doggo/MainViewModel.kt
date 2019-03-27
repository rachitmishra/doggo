package `in`.ceeq.doggo

import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    private val source1 = MutableLiveData<String>()
    private val source2 = MutableLiveData<String>()

    val combined = MediatorLiveData<String>().apply {

        addSource(source1) {
            if (!it.isNullOrEmpty() && !this.value.isNullOrEmpty()) {
                this.value += it
            }
        }

        addSource(source2) {
            if (!it.isNullOrEmpty() && !this.value.isNullOrEmpty()) {
                this.value += it
            }
        }
    }


    fun combine(str: String, str2: String) {
        source1.value = str
        source2.value = str2
    }
}
