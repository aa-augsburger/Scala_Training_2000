/*
 * Titre : Recherche Binaire (Intermédiaire)
 * Énoncé : Implémente la recherche binaire pour trouver l'indice d'un élément dans un tableau trié.
 * Signature : def binarySearch(arr: Array[Int], target: Int, low: Int, high: Int): Int
 * Indice : Compare la cible avec l'élément du milieu (mid). Si target < arr(mid), cherche à gauche, sinon cherche à droite.
 */

// 1. IMPLEMENTATION

def binarySearch(arr: Array[Int], target: Int, low: Int, high: Int): Int = {
    // Ton code ici (retourne -1 si non trouvé)
}

// 2. TESTS
println("=== TEST: Recherche Binaire ===")
val arr = Array(1, 3, 5, 7, 9, 11)
println(s"Test search 7: ${binarySearch(arr, 7, 0, arr.length - 1)} (Attendu: 3)")
println(s"Test search 2: ${binarySearch(arr, 2, 0, arr.length - 1)} (Attendu: -1)")
