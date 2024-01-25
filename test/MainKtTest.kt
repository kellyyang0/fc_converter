class MainKtTest {

    @org.junit.jupiter.api.Test
    fun converter() {
        val convertedFahrenheit = converter(30.0, "Celsius")
        val incorrectValue = 123123.0

        assert(convertedFahrenheit != incorrectValue)
    }
}