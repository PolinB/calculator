package ru.burtseva.sd.calculator.visitors

import ru.burtseva.sd.calculator.tokinazer.Bracket
import ru.burtseva.sd.calculator.tokinazer.NumberToken
import ru.burtseva.sd.calculator.tokinazer.Operation

interface TokenVisitor {
    fun visit(token: NumberToken)
    fun visit(token: Bracket)
    fun visit(token: Operation)
}
