object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val value = Integer.toBinaryString(number)
        return defineSecretActions(value)
    }
}

fun defineSecretActions(listString: String): List<Signal> {
    val exampleList: MutableList<Signal> = mutableListOf()

    for ((index, value) in listString.reversed().withIndex()) {
        when (index) {
            0 -> {
                if (value.digitToInt() == 1) exampleList.add(Signal.WINK)
            }
            1 -> {
                if (value.digitToInt() == 1) exampleList.add(Signal.DOUBLE_BLINK)
            }
            2 -> {
                if (value.digitToInt() == 1) exampleList.add(Signal.CLOSE_YOUR_EYES)
            }
            3 -> {
                if (value.digitToInt() == 1) exampleList.add(Signal.JUMP)
            }
            4 -> {
                if (value.digitToInt() == 1) exampleList.reverse()
            }
        }
    }
    return exampleList
}