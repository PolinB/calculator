package ru.burtseva.sd.calculator

import ru.burtseva.sd.calculator.tokinazer.Tokenizer
import ru.burtseva.sd.calculator.visitors.CalcVisitor
import ru.burtseva.sd.calculator.visitors.ParserVisitor
import ru.burtseva.sd.calculator.visitors.PrintVisitor

class Runner(private val expression: String) {
    private val tokens = Tokenizer.tokenize(expression)
    private val rpnTokens = lazy { ParserVisitor().visit(tokens) }

    fun printTokens() {
        PrintVisitor.visit(tokens)
    }

    fun printRpn() {
        PrintVisitor.visit(rpnTokens.value)
    }

    fun getCalcValue(): Int {
        val calcVisitor = CalcVisitor()
        return calcVisitor.visit(rpnTokens.value)
    }

    fun printAllInfo() {
        printTokens()
        printRpn()
        println("$expression = ${getCalcValue()}")
    }
}