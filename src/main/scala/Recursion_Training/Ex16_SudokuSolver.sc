/*
 * Titre : Sudoku Solver (Difficile - Backtracking)
 * Énoncé : Implémente un solveur de Sudoku utilisant la récursion et le backtracking.
 * Le Sudoku est représenté par un tableau de tableaux d'entiers (Array[Array[Int]]) de taille 9x9.
 * Les cases vides sont représentées par le chiffre 0.
 * La fonction doit modifier la grille directement et retourner true si une solution est trouvée, false sinon.
 * 
 * Indices :
 * 1. Trouve la prochaine case vide (valeur 0).
 * 2. Pour chaque chiffre de 1 à 9, vérifie s'il peut être placé (pas de doublon en ligne, colonne ou bloc 3x3).
 * 3. Si oui, place-le et appelle récursivement la fonction pour la suite.
 * 4. Si la récursion échoue, remets la case à 0 (backtrack) et essaie le chiffre suivant.
 */

// 1. IMPLEMENTATION

type Board = Array[Array[Int]]

def solveSudoku(board: Board): Boolean = {
    // Ton code ici
    false
}

def printBoard(board: Board): Unit = {
    for (i <- 0 until 9) {
        if (i % 3 == 0 && i != 0) println("-" * 21)
        for (j <- 0 until 9) {
            if (j % 3 == 0 && j != 0) print("| ")
            print(s"${board(i)(j)} ")
        }
        println()
    }
}

// 2. TESTS
val grid: Board = Array(
    Array(5, 3, 0, 0, 7, 0, 0, 0, 0),
    Array(6, 0, 0, 1, 9, 5, 0, 0, 0),
    Array(0, 9, 8, 0, 0, 0, 0, 6, 0),
    Array(8, 0, 0, 0, 6, 0, 0, 0, 3),
    Array(4, 0, 0, 8, 0, 3, 0, 0, 1),
    Array(7, 0, 0, 0, 2, 0, 0, 0, 6),
    Array(0, 6, 0, 0, 0, 0, 2, 8, 0),
    Array(0, 0, 0, 4, 1, 9, 0, 0, 5),
    Array(0, 0, 0, 0, 8, 0, 0, 7, 9)
)

println("=== Grille initiale ===")
printBoard(grid)

// Test de l'algorithme (une fois implémenté)
// if (solveSudoku(grid)) {
//     println("\n=== Solution ===")
//     printBoard(grid)
// } else {
//     println("\nPas de solution trouvée.")
// }
