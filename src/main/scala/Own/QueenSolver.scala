object QueensSolver {

  val N = 9 // Tu peux tester avec 4 pour commencer

  /**
   * Vérifie si on peut poser une reine en (row, col) sans qu'elle soit attaquée.
   * Rappel : Une reine attaque en ligne, colonne et diagonale.
   */
  def isValid(grid: Array[Array[Int]], row: Int, col: Int): Boolean = {
    // TODO: 1. Vérifier la ligne à gauche de la position actuelle
    for(i <- 1 to col) {
      if(grid(row)(col-i) == 1) return false
      if(row+i < N)
      if(grid(row+i)(col-i) == 1) return false
      if(row-i >= 0)
        if(grid(row-i)(col-i) == 1) return false
    }
    // TODO: 2. Vérifier la diagonale "haut-gauche" (row-1, col-1)
    // TODO: 3. Vérifier la diagonale "bas-gauche" (row+1, col-1)
    // Si aucune reine n'est trouvée sur ces chemins :

    true
  }


  /**
   * Algorithme de backtracking.
   * col : l'indice de la colonne sur laquelle on travaille actuellement.
   */
  def solve(grid: Array[Array[Int]], col: Int): Boolean = {
  if(col == N) return true
  else {
    for(i <- 0 until N) {
      if(isValid(grid, i, col)) {
        grid(i)(col) = 1
        if(solve(grid, col+1)) return true
        else {
          grid(i)(col) = 0
        }
      }
    }
    false
  }


  }
/*
    // CAS DE BASE :
    // Si l'indice de la colonne est égal à N, ça veut dire qu'on a placé
    // toutes les reines avec succès.
    if (col >= N) ???

    // LOGIQUE :
    // Pour la colonne actuelle 'col', on teste chaque ligne 'row' de 0 à N-1
    for (row <- 0 until N) {
      // 1. Appeler isValid pour voir si la position est sûre

      // 2. Si c'est bon, poser la reine (grid(row)(col) = 1)

      // 3. Appel récursif pour passer à la colonne SUIVANTE (col + 1)

      // 4. Si l'appel récursif renvoie true, on propage le succès

      // 5. BACKTRACK : Si ça n'a pas marché, on remet la case à 0
    }

    // Si on a testé toutes les lignes et que rien n'a fonctionné :
  }

 */

  def printGrid(grid: Array[Array[Int]]): Unit = {
    for (row <- grid) {
      println(row.map(x => if (x == 1) " Q " else " . ").mkString)
    }
  }

  def main(args: Array[String]): Unit = {
    val board = Array.fill(N, N)(0)

    try {
      println(s"Recherche d'une solution pour $N reines...")

      if (solve(board, 0)) {
        println(s"SUCCÈS : Solution trouvée !")
        printGrid(board)
      } else {
        println("ÉCHEC : Aucune solution n'existe pour cette configuration.")
      }

    } catch {
      case e: NotImplementedError =>
        println("ERREUR : Tu n'as pas encore complété toutes les fonctions (il reste des ???).")
      case e: ArrayIndexOutOfBoundsException =>
        println(s"ERREUR D'INDEX : Ton code a essayé d'accéder à une case hors du plateau (Ligne/Colonne invalide).")
      case e: Throwable =>
        println(s"ERREUR INCONNUE : ${e.getMessage}")
        e.printStackTrace()
    }
  }
}