object Pangram {
    fun isPangram(input: String): Boolean {
        val alphabet = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z"
            .split(",")
        var sum = 0
        for (word in alphabet) {
            when (input.uppercase().any { it == word[0] }) {
                true -> sum += 1
                else -> {}
            }
        }

        return when (sum) {
            26 -> true
            else -> false
        }
    }
}

fun main() {
    Pangram.isPangram("The quick brown fox jumps over the lazy dog.")
}