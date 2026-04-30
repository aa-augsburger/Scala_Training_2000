/*
 * Titre : Chemins dans une grille (Intermédiaire)
 * Énoncé : Dans une grille de m x n, calcule le nombre de chemins possibles pour aller du coin haut-gauche (0,0) au coin bas-droite (m-1, n-1) en ne se déplaçant que vers la droite ou vers le bas.
 * Indice : Si tu es sur la dernière ligne ou dernière colonne, il n'y a qu'un seul chemin possible (tout droit). Sinon, la somme des chemins depuis le voisin de droite et celui du bas.
 */

// 1. IMPLEMENTATION

def countPaths(m: Int, n: Int): Int = {
    // Ton code ici
}

// 2. TESTS
println("=== TEST: Chemins Grille ===")
println(s"Test 3x3: ${countPaths(3, 3)} (Attendu: 6)")
println(s"Test 2x2: ${countPaths(2, 2)} (Attendu: 2)")
