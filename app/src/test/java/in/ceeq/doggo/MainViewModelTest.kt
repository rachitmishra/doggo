package `in`.ceeq.doggo

import `in`.ceeq.doggo.LiveDataTestUtil.getValue
import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainViewModelTest {

    lateinit var viewModel: MainViewModel

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
    }

    @Test
    fun combine() {
        viewModel = MainViewModel()
        viewModel.combine("Hello, ", "World!")
        assertThat(getValue(viewModel.combined)).isEqualTo("Hello, world!")
    }
}
