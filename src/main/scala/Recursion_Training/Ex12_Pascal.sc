/*
 * Titre : Triangle de Pascal (Intermédiaire)
 * Énoncé : Calcule la valeur à la colonne 'c' et la ligne 'r' du triangle de Pascal.
 * Rappel : pascal(c, r) = pascal(c-1, r-1) + pascal(c, r-1)
 * Indice : Les bords du triangle (c == 0 ou c == r) valent toujours 1.
 */

// 1. IMPLEMENTATION

def pascal(c: Int, r: Int): Int = {
    // Ton code ici
}

// 2. TESTS
println("=== TEST: Triangle de Pascal ===")
println(s"Test col 1, row 2: ${pascal(1, 2)} (Attendu: 2)")
println(s"Test col 2, row 4: ${pascal(2, 4)} (Attendu: 6)")
println(s"Test col 0, row 5: ${pascal(0, 5)} (Attendu: 1)")
