package ru.burtseva.sd.calculator

import ru.burtseva.sd.calculator.tokinazer.Tokenizer
import ru.burtseva.sd.calculator.visitors.CalcVisitor
import ru.burtseva.sd.calculator.visitors.ParserVisitor
import ru.burtseva.sd.calculator.visitors.PrintVisitor

fun main() {
//    val tokens = Tokenizer.tokenize("1 + 2 * 100")
//    PrintVisitor.visit(tokens)
//
//    val parserVisitor = ParserVisitor()
//    val rpnTokens = parserVisitor.visit(tokens)
//    PrintVisitor.visit(rpnTokens)
//
//    val calcVisitor = CalcVisitor()
//    val calcValue = calcVisitor.visit(rpnTokens)
//    println(calcValue)
    Runner("1 + 2 * 13").printAllInfo()
    println("\n=====================\n")
    Runner("2 * 4 - 3 * 2 / 6").printAllInfo()
    println("\n=====================\n")
    Runner("(10 - 5) * (12 - 6)").printAllInfo()
}