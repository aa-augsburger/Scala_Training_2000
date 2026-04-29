
/*
 * Nom du probleme: BalancedBrackets_Adv
 * Donnee: Retourne true si les parenthèses (), crochets [], accolades {} sont bien équilibrés.
 */




// 1. IMPLEMENTATION


def isBalanced(s: String): Boolean = {
    
}




// 2. TESTS

println("=== TEST: BalancedBrackets_Adv ===")
println(s"Test '([]{})': ${isBalanced("([]{})")} (Attendu: true)")
println(s"Test '([)]':   ${isBalanced("([)]")} (Attendu: false)")
println(s"Test '(()':    ${isBalanced("(()")} (Attendu: false)")
