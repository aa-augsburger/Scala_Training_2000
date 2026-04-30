/*
 * Titre : Somme des chiffres (Facile)
 * Énoncé : Écris une fonction récursive qui calcule la somme des chiffres d'un entier positif n.
 * Indice : Utilise l'opérateur modulo % 10 pour extraire le dernier chiffre et la division entière / 10 pour réduire la taille du nombre.
 */

// 1. IMPLEMENTATION

def sumDigits(n: Int): Int = {
    // Ton code ici
}

// 2. TESTS
println("=== TEST: Somme des chiffres ===")
println(s"Test 123:  ${sumDigits(123)} (Attendu: 6)")
println(s"Test 9052: ${sumDigits(9052)} (Attendu: 16)")
