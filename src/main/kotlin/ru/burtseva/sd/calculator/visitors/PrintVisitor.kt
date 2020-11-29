package ru.burtseva.sd.calculator.visitors

import ru.burtseva.sd.calculator.tokinazer.Bracket
import ru.burtseva.sd.calculator.tokinazer.NumberToken
import ru.burtseva.sd.calculator.tokinazer.Operation

class PrintVisitor: TokenVisitor {
    override fun visit(token: NumberToken) {
        TODO("Not yet implemented")
    }

    override fun visit(token: Bracket) {
        TODO("Not yet implemented")
    }

    override fun visit(token: Operation) {
        TODO("Not yet implemented")
    }
}