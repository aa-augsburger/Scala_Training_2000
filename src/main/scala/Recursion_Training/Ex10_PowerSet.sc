/*
 * Titre : Power Set - Sous-ensembles (Difficile)
 * Énoncé : Génère tous les sous-ensembles possibles d'une liste donnée.
 * Exemple : List(1, 2) -> List(List(), List(1), List(2), List(1, 2))
 * Indice : Pour chaque élément, tu as deux choix : soit il est dans le sous-ensemble, soit il n'y est pas.
 */

// 1. IMPLEMENTATION

def powerSet(l: List[Int]): List[List[Int]] = {
    // Ton code ici
}

// 2. TESTS
println("=== TEST: Power Set ===")
println(s"Test List(1, 2): ${powerSet(List(1, 2))}")
// L'ordre peut varier, mais il doit y avoir 4 sous-ensembles.
