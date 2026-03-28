import java.util.Scanner
fun main() {
    val rainbow = RainbowBanner()
    val scanner = Scanner(System.`in`)

    println("\u001B[1m🌈 Rainbow Banner Pro ishga tushdi!\u001B[0m")

    while (true) {
        print("\n✨ Matn kiriting (chiqish uchun 'exit'): ")
        val input = scanner.nextLine()

        if (input.lowercase() == "exit") break

        println("\n--- 🎨 RAINBOW ART ---\n")
        rainbow.printRainbow(input)
        println("\n----------------------")
    }
}