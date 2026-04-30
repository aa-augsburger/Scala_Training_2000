/*
 * Titre : Fusion de listes triées (Intermédiaire/Difficile)
 * Énoncé : Fusionne deux listes déjà triées en une seule liste triée.
 * Indice : Compare les têtes des deux listes. Ajoute la plus petite au résultat de la fusion récursive du reste.
 */

// 1. IMPLEMENTATION

def merge(l1: List[Int], l2: List[Int]): List[Int] = {
    // Ton code ici
}

// 2. TESTS
println("=== TEST: Fusion de listes ===")
val l1 = List(1, 4, 6)
val l2 = List(2, 3, 5, 8)
println(s"Test merge: ${merge(l1, l2)} (Attendu: List(1, 2, 3, 4, 5, 6, 8))")
