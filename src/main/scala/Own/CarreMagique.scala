object MagicSquareSolver {

  val N = 3
  val MagicSum = 15
  val MaxNum = N * N

  /**
   * Vérifie si le carré est valide à l'instant T.
   * Note : On ne vérifie les sommes finales que si la grille est pleine,
   * mais on peut vérifier l'absence de doublons à chaque étape.
   */
  def isValid(grid: Array[Array[Int]], row: Int, col: Int, num: Int): Boolean = {
    // 1. Vérifier si le nombre est déjà utilisé ailleurs dans la grille
    val alreadyUsed = grid.exists(r => r.contains(num))
    if (alreadyUsed) return false

    // Pour un carré magique, les sommes se vérifient surtout à la fin,
    // mais on peut vérifier si une ligne/colonne dépasse 15 en cours de route.
    true
  }

  /**
   * Vérifie si la grille complète respecte toutes les sommes (15).
   */
  def isMagic(grid: Array[Array[Int]]): Boolean = {
    // TODO: Vérifier lignes, colonnes et les 2 diagonales
    // Somme doit être égale à MagicSum
    val n = grid.length
    val magicSum = n*(n*n+1)/2

    var diag1 = 0
    var diag2 = 0
    for(x <- 0 until n) {
      var sumRow = 0
      var sumCol = 0
      for(y <- 0 until n) {
        sumRow += grid(x)(y)
        sumCol += grid(y)(x)
      }
      if(sumRow != magicSum) return false
      if(sumCol != magicSum) return false
      diag1 += grid(x)(x)
      diag2 += grid(x)(n-1-x)
    }
    if(diag1 != magicSum || diag2 != magicSum) return false

    true
  }

  def solve(grid: Array[Array[Int]]): Boolean = {
    findEmpty(grid) match {
      case None => isMagic(grid) //si c'est la fin on vérifie si c'est vraiment vide

      case Some(v) => {
        for(i <- 1 to MaxNum) {
              if(isValid(grid, v._1, v._2, i)) {
                grid(v._1)(v._2) = i
                if(solve(grid))
                  return true
                else
                  grid(v._1)(v._2) = 0
              }
            }
        false
      }
    }
  }


  def findEmpty(grid: Array[Array[Int]]): Option[(Int, Int)] = {
    for(x <- grid.indices) {
      for(y <- grid(0).indices) {
        if(grid(x)(y) == 0) return Some(x,y)
      }
    }
    None
  }

  def printGrid(grid: Array[Array[Int]]): Unit = {
    println("-" * 13)
    grid.foreach(row => println(row.mkString("| ", " | ", " |")))
    println("-" * 13)
  }

  def main(args: Array[String]): Unit = {
    val grid = Array.fill(N, N)(0)
    if (solve(grid)) {
      println("Carré Magique trouvé :")
      printGrid(grid)
    } else {
      println("Pas de solution.")
    }
  }
}