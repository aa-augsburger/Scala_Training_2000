/*
 * Titre : Liste triée (Facile/Intermédiaire)
 * Énoncé : Vérifie récursivement si une liste d'entiers est triée par ordre croissant.
 * Indice : Une liste est triée si le premier élément est inférieur ou égal au deuxième ET que le reste de la liste est trié.
 */

// 1. IMPLEMENTATION

def isSorted(l: List[Int]): Boolean = {
    // Ton code ici
}

// 2. TESTS
println("=== TEST: Liste triée ===")
println(s"Test List(1, 2, 3, 5): ${isSorted(List(1, 2, 3, 5))} (Attendu: true)")
println(s"Test List(1, 5, 2):    ${isSorted(List(1, 5, 2))} (Attendu: false)")
