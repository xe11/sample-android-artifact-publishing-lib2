package xe11.samples.android.lib2

import org.junit.Test

internal class Lib2CalculatorTest {

    @Test
    fun `sum should `() {
        val sut = Lib2Calculator()

        val actual = sut.sum(1, 2)

        assert(actual == 3)
    }
}
