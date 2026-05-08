/*
 * Titre : Les escaliers de Fibonacci (Difficile)
 * Énoncé : Calcule le nombre de manières distinctes d'atteindre le sommet de n marches (1 ou 2 marches par pas).
 * Indice : C'est une variante de Fibonacci. Pense aux deux derniers pas possibles pour arriver à n.
 */

// 1. IMPLEMENTATION

def countWays(n: Int): Int = {
    if(n < 2)
      1
    else{
      countWays(n-1) + countWays(n-2)
    }
}

// 2. TESTS
println("=== TEST: Escaliers Fibonacci ===")
println(s"Test n=3: ${countWays(3)} (Attendu: 3)")
println(s"Test n=4: ${countWays(4)} (Attendu: 5)")
