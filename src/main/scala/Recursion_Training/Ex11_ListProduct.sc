/*
 * Titre : Produit d'une liste (Facile)
 * Énoncé : Écris une fonction récursive qui calcule le produit de tous les éléments d'une liste d'entiers.
 * Indice : Le produit d'une liste vide est 1 (élément neutre). Sinon, c'est la tête multipliée par le produit du reste.
 */

// 1. IMPLEMENTATION

def product(l: List[Int]): Int = {
    if()
}

// 2. TESTS
println("=== TEST: Produit de liste ===")
println(s"Test List(1, 2, 3, 4): ${product(List(1, 2, 3, 4))} (Attendu: 24)")
println(s"Test List(5, 10):      ${product(List(5, 10))} (Attendu: 50)")
println(s"Test List():           ${product(List())} (Attendu: 1)")
