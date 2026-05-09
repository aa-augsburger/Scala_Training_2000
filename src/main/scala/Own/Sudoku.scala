import scala.collection.mutable.ArrayBuffer

object SudokuSolverSkeleton {

  /**
   * Résout la grille par récursion (backtracking).
   * Modifie la grille sur place et renvoie true si une solution est trouvée.
   */
  def solve(grid: Array[Array[Int]]): Boolean = {
    // TODO: Implémenter la logique de récursion ici
    val nextCase = findEmpty(grid)
    nextCase match {
      case Some(v) => {
      for (i <- 1 to 9) {
        if(isValid(grid,v._1, v._2, i)) {
          grid(v._1)(v._2) = i
          if(solve(grid))
            return true
          else
            grid(v._1)(v._2) = 0 // on annule si le choix n'est pas le bon

        }
      }
        false
    }
      case None => true
    }
    }


  /**
   * Vérifie si un chiffre peut être placé à la position donnée selon les règles.
   */
  def isValid(grid: Array[Array[Int]], row: Int, col: Int, num: Int): Boolean = {
    // TODO: Implémenter la vérification (ligne, colonne, bloc 3x3)
    for(i <- grid.indices) {
      if (grid(row)(i) == num)
        return false
      if (grid(i)(col) == num)
        return false
    }
      val startRow = (row / 3) * 3
      val startCol = (col / 3) * 3

      for(x <- startRow until startRow+3) {
        for(y <- startCol until startCol+3) {
          if(grid(x)(y) == num)
          return false
        }
      }

    true
  }

  /**
   * Trouve la première case vide (représentée par un 0).
   */
  def findEmpty(grid: Array[Array[Int]]): Option[(Int, Int)] = {
    // TODO: Parcourir la grille pour trouver le prochain 0
    for(x <- 0 until 9) {
      for(y <- 0 until 9) {
        if(grid(x)(y) == 0)
          return Some((x,y))
      }
    }
    None
  }

  def printGrid(grid: Array[Array[Int]]): Unit = {
    for (row <- grid) {
      println(row.mkString(" "))
    }
  }

  def main(args: Array[String]): Unit = {
    val initialGrid = Array(
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

    val expectedGrid = Array(
      Array(5, 3, 4, 6, 7, 8, 9, 1, 2),
      Array(6, 7, 2, 1, 9, 5, 3, 4, 8),
      Array(1, 9, 8, 3, 4, 2, 5, 6, 7),
      Array(8, 5, 9, 7, 6, 1, 4, 2, 3),
      Array(4, 2, 6, 8, 5, 3, 7, 9, 1),
      Array(7, 1, 3, 9, 2, 4, 8, 5, 6),
      Array(9, 6, 1, 5, 3, 7, 2, 8, 4),
      Array(2, 8, 7, 4, 1, 9, 6, 3, 5),
      Array(3, 4, 5, 2, 8, 6, 1, 7, 9)
    )

    val gridToSolve = initialGrid.map(_.clone())

    println("Grille initiale :")
    printGrid(gridToSolve)
    println()

    try {
      val success = solve(gridToSolve)

      if (success) {
        val isCorrect = gridToSolve.indices.forall { r =>
          gridToSolve(r).indices.forall(c => gridToSolve(r)(c) == expectedGrid(r)(c))
        }

        if (isCorrect) {
          println("SUCCÈS : Le Sudoku a été résolu correctement !")
          printGrid(gridToSolve)
        } else {
          println("ÉCHEC : La méthode solve renvoie true mais la grille finale est incorrecte.")
          printGrid(gridToSolve)
        }
      } else {
        println("ÉCHEC : La méthode solve a renvoyé false.")
      }
    } catch {
      case _: NotImplementedError =>
        println("Le squelette est prêt. Remplacez les ??? par votre implémentation pour lancer le test.")
    }
  }
}