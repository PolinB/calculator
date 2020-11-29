package ru.burtseva.sd.calculator

import ru.burtseva.sd.calculator.tokinazer.Tokenizer

fun main() {
    val tokens = Tokenizer.tokenize("1 + 2 * 100")
    println(tokens)
}