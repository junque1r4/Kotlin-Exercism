object Acronym {
    fun generate(phrase: String) : String {
        var answer = ""
        for (word in phrase.replace( "-", " ").replace("_", "").split(" ")) {
            if (word.isNotEmpty()) {
                answer += word[0]
            }
        }
        return answer.uppercase()
    }
}

fun main() {
    val test = Acronym.generate("Something - I made up from thin air")
    println(test)
}