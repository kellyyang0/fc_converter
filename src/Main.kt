fun main() {

    val measurement: String

    // Ask user which conversion is wanted
    print("Type F2C for Fahrenheit to Celcius and C2F for Celcius to Fahrenheit")
    val enteredWay: String = readln()

    // Initialize measurement variable with correct type
    measurement = if (enteredWay == "C2F") {
        "Fahrenheit"
    } else {
        "Celcius"
    }

    // Ask user to input starting temperature
    print("Please enter in the temp: ")
    val enteredNum: Double = readln().toDouble()

    // Call converter function and store into variable
    val convertedNum = converter(enteredNum, measurement)

    // Print final conversion
    print("$enteredNum $measurement is $convertedNum")
}

/**
 * Converts Fahrenheit to Celcius and vice-versa
 *
 * @param orgNum value to be converted
 * @param corF desired target unit
 * @return [orgNum] converted to the unit given in [corF]
 */
fun converter(orgNum: Double, corF: String): Double {
    return if (corF == "Celcius") {
        ((5 / 9) * orgNum) + 32
    } else {
        ((9 / 5) * orgNum) - 32
    }
}

