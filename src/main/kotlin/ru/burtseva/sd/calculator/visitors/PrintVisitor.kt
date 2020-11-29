package ru.burtseva.sd.calculator.visitors

import ru.burtseva.sd.calculator.tokinazer.Bracket
import ru.burtseva.sd.calculator.tokinazer.NumberToken
import ru.burtseva.sd.calculator.tokinazer.Operation
import ru.burtseva.sd.calculator.tokinazer.Token

object PrintVisitor: TokenVisitor {
    override fun visit(token: NumberToken) = println(token)

    override fun visit(token: Bracket) = println(token)

    override fun visit(token: Operation) = println(token)

    fun visit(tokens: List<Token>) {
        println(tokens.joinToString(" ") { it.toString() })
    }
}