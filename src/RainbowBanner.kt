class RainbowBanner {
     private val RESET = "\u001B[0m"

    private val COLORS = listOf(
        "\u001B[31m", // Qizil
        "\u001B[33m", // Sariq
        "\u001B[32m", // Yashil
        "\u001B[36m", // Moviy
        "\u001B[34m", // Ko'k
        "\u001B[35m"  // Binafsha
    )

    private val alphabet = mapOf(
        'A' to listOf("  A  ", " A A ", "AAAAA", "A   A", "A   A"),
        'B' to listOf("BBBB ", "B   B", "BBBB ", "B   B", "BBBB "),
        'C' to listOf(" CCCC", "C    ", "C    ", "C    ", " CCCC"),
        'D' to listOf("DDDD ", "D   D", "D   D", "D   D", "DDDD "),
        'E' to listOf("EEEEE", "E    ", "EEE  ", "E    ", "EEEEE"),
        'F' to listOf("FFFFF", "F    ", "FFF  ", "F    ", "F    "),
        'G' to listOf(" GGG ", "G    ", "G  GG", "G   G", " GGG "),
        'H' to listOf("H   H", "H   H", "HHHHH", "H   H", "H   H"),
        'I' to listOf("IIIII", "  I  ", "  I  ", "  I  ", "IIIII"),
        'J' to listOf("JJJJJ", "   J ", "   J ", "J  J ", " JJ  "),
        'K' to listOf("K   K", "K  K ", "KKK  ", "K  K ", "K   K"),
        'L' to listOf("L    ", "L    ", "L    ", "L    ", "LLLLL"),
        'M' to listOf("M   M", "MM MM", "M M M", "M   M", "M   M"),
        'N' to listOf("N   N", "NN  N", "N N N", "N  NN", "N   N"),
        'O' to listOf(" OOO ", "O   O", "O   O", "O   O", " OOO "),
        'P' to listOf("PPPP ", "P   P", "PPPP ", "P    ", "P    "),
        'R' to listOf("RRRR ", "R   R", "RRRR ", "R  R ", "R   R"),
        'S' to listOf(" SSSS", "S    ", " SSS ", "    S", "SSSS "),
        'T' to listOf("TTTTT", "  T  ", "  T  ", "  T  ", "  T  "),
        'U' to listOf("U   U", "U   U", "U   U", "U   U", " UUU "),
        'V' to listOf("V   V", "V   V", "V   V", " V V ", "  V  "),
        'W' to listOf("W   W", "W   W", "W W W", "WW WW", "W   W"),
        'X' to listOf("X   X", " X X ", "  X  ", " X X ", "X   X"),
        'Y' to listOf("Y   Y", " Y Y ", "  Y  ", "  Y  ", "  Y  "),
        'Z' to listOf("ZZZZZ", "   Z ", "  Z  ", " Z   ", "ZZZZZ"),
        ' ' to listOf("     ", "     ", "     ", "     ", "     ")
    )

    fun printRainbow(text: String) {
        val upperText = text.uppercase()

        for (row in 0 until 5) {
            for ((index, char) in upperText.withIndex()) {
                val art = alphabet[char] ?: listOf("?????", "?????", "?????", "?????", "?????")
                 val color = COLORS[index % COLORS.size]
                print(color + art[row] + RESET + "  ")
            }
            println()
        }
    }
}