val OPERATORS = listOf<String>("+", "-", "*", "/")

fun main() {
    println("write 'exit' to exit the program")
    println("----------------CALCULATOR---------------")
    try {
        while (true) {
            print("calc: ")
            val values = readln()

            if (values.lowercase().trim() == "exit") {
                return
            }

            if (!OPERATORS.any {it in values}) {
                println(values.toDouble())
                continue
            }

            val fValues: MutableList<String> = formatValues(values)

            var result: Double = fValues[0].toDouble()

            var i = 0
            while (i < fValues.size) {
                if (fValues[i] in OPERATORS) {
                    when (fValues[i]) {
                        "+" ->
                            result += fValues[i + 1].toDouble()

                        "-" ->
                            result -= fValues[i + 1].toDouble()

                        "*" ->
                            result *= fValues[i + 1].toDouble()

                        "/" ->
                            result /= fValues[i + 1].toDouble()

                    }
                }
                i++
            }
            println("${fValues.joinToString(" ")} = $result")
        }
    } catch (e: Exception) {
        println("Value must be a Num")
    }
}

fun formatValues(values: String): MutableList<String> {
    val formatOperators = mutableListOf<String>()
    for (i in values.indices) {
        if ((i == 0 && values[i].toString() in OPERATORS)
            || (i == (values.length - 1) && values[i].toString() in OPERATORS)
        ) {
            continue
        }
        if (values[i].toString() in OPERATORS && values[i + 1].toString() in OPERATORS) {
            continue
        } else {
            formatOperators.add(values[i].toString())
        }
    }

    val finalValues = mutableListOf<String>()
    var nv = ""
    for (v in formatOperators) {
        if (v !in OPERATORS) {
            nv += v
        } else {
            if (nv == "") {
                finalValues.add(v)
            } else {
                finalValues.add(nv)
                finalValues.add(v)
            }
            nv = ""
        }
    }

    if (finalValues[0] in OPERATORS) {
        if (finalValues[0] == "-") {
            finalValues[1] = "-" + finalValues[1]
        }
        finalValues.removeAt(0)
    }

    finalValues.add(nv)

    return finalValues
}