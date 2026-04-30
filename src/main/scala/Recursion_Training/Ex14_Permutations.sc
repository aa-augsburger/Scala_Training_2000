/*
 * Titre : Permutations d'une chaîne (Difficile)
 * Énoncé : Génère toutes les permutations possibles des caractères d'une chaîne.
 * Exemple : "abc" -> "abc", "acb", "bac", "bca", "cab", "cba"
 * Indice : Pour chaque caractère de la chaîne, place-le en tête et concatène-le avec toutes les permutations du reste de la chaîne.
 */

// 1. IMPLEMENTATION

def permutations(s: String): List[String] = {
    // Ton code ici
}

// 2. TESTS
println("=== TEST: Permutations ===")
val res = permutations("abc")
println(s"Test 'abc': ${res.sorted}")
println(s"Nombre de résultats: ${res.length} (Attendu: 6)")
