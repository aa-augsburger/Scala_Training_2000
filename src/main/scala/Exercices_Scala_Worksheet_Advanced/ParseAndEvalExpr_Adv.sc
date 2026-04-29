
/*
 * Nom du probleme: ParseAndEvalExpr_Adv
 * Donnee: Evalue une expression arithmetique avec + - * / et parentheses. Espaces possibles. Division Double.
 */




// 1. IMPLEMENTATION


def evalExpr(expr: String): Double = {
    
}




// 2. TESTS

println("=== TEST: ParseAndEvalExpr_Adv ===")
println(evalExpr("2*(3+4)"))
// Attendu: 14.0
println(evalExpr("10 + 2 * 6"))
// Attendu: 22.0
println(evalExpr("100 * ( 2 + 12 ) / 14"))
// Attendu: 100.0
