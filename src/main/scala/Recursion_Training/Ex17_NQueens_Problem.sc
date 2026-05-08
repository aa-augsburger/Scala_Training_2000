/*
 * Problème des N-Reines (N-Queens) - Backtracking
 *
 * Le but est de placer N reines sur un échiquier de N×N de telle sorte que 
 * deux reines ne puissent pas s'attaquer. 
 * Une reine peut attaquer une autre si elles partagent la même ligne, 
 * la même colonne ou la même diagonale.
 *
 * Objectif : Implémenter la fonction solveNQueens qui retourne toutes les configurations valides.
 * Chaque solution est représentée par une liste d'entiers où l'index i représente la ligne 
 * et la valeur sol(i) représente la colonne de la reine sur cette ligne.
 */

// 1. IMPLEMENTATION

def solveNQueens(n: Int): List[List[Int]] = {
  
  /**
   * Vérifie si on peut placer une reine à (row, col) étant donné le placement actuel.
   * @param board Liste des colonnes déjà occupées pour les lignes 0 à row-1
   * @param row Ligne actuelle
   * @param col Colonne testée
   */
  def isSafe(board: List[Int], row: Int, col: Int): Boolean = {
    // TODO: Implémenter la vérification de sécurité (ligne, colonne, diagonales)
    ???
  }

  /**
   * Fonction récursive de backtracking
   * @param board Placement actuel des reines
   * @param row Ligne actuelle à remplir
   */
  def backtrack(board: List[Int], row: Int): List[List[Int]] = {
    // TODO: Implémenter la logique de backtracking
    // 1. Cas de base : toutes les reines sont placées
    // 2. Cas récursif : essayer chaque colonne de la ligne actuelle
    ???
  }

  backtrack(List(), 0)
}

// 2. TESTS

println("=== Exercice : Problème des N-Reines ===\n")

// Test pour N = 4
println("Test 1: Solutions pour 4 reines")
val solutions4 = solveNQueens(4)
println(s"Nombre de solutions trouvées : ${solutions4.length} (Attendu : 2)")
solutions4.foreach(sol => println(s"  Solution : $sol"))
println()

// Visualisation (Helper)
def printBoard(solution: List[Int]): Unit = {
  val n = solution.length
  for (colPos <- solution) {
    val rowStr = (0 until n).map(c => if (c == colPos) " Q " else " . ").mkString("|")
    println(s"|$rowStr|")
  }
}

if (solutions4.nonEmpty) {
  println("Visualisation de la première solution (4x4) :")
  printBoard(solutions4.head)
}
println()

// Test pour N = 8
println("Test 2: Nombre de solutions pour 8 reines")
val count8 = solveNQueens(8).length
println(s"Nombre de solutions : $count8 (Attendu : 92)")
