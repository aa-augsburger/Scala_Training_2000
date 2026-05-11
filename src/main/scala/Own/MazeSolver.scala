object MazeSolver {

  val N = 5

  // Directions : Haut, Bas, Gauche, Droite
  val dRow = Array(-1, 1, 0, 0)
  val dCol = Array(0, 0, -1, 1)

  def isSafe(grid: Array[Array[Int]], r: Int, c: Int): Boolean = {
    // TODO: Vérifier les bornes et si la case vaut 0
    r >= 0 && r < N && c >= 0 && c < N && grid(r)(c) == 0
  }

  def solve(grid: Array[Array[Int]], r: Int, c: Int, endR: Int, endC: Int): Boolean = {
    // TODO: Cas de base, Marquage, Exploration et Backtrack
    if(!isSafe(grid, r, c))
      return false

    if(r == endR && c == endC)
      return true
    else {
     if(isSafe(grid, r, c)) {
       grid(r)(c) = 2
       if(solve(grid, r-1,c, endR, endC) ||
        solve(grid, r+1,c, endR, endC) ||
        solve(grid, r,c-1, endR, endC) ||
        solve(grid, r,c+1, endR, endC)) {
         return true
       }
      grid(r)(c) = 0
     }
      false
     }
    }


  def main(args: Array[String]): Unit = {
    val maze = Array(
      Array(0, 1, 0, 0, 0),
      Array(0, 1, 0, 1, 0),
      Array(0, 0, 0, 1, 0),
      Array(1, 1, 0, 1, 1),
      Array(0, 0, 0, 0, 0)
    )

    try {
      println("Lancement de la recherche de chemin...")

      if (solve(maze, 0, 0, N - 1, N - 1)) {
        println("SUCCÈS : Chemin trouvé !")
        // Ton code pour afficher la grille ici
      } else {
        println("ÉCHEC : Aucun chemin n'existe.")
      }

    } catch {
      case e: NotImplementedError =>
        println("ERREUR : Il reste des '???' dans ton code.")
      case e: ArrayIndexOutOfBoundsException =>
        println("ERREUR D'INDEX : Tu es sorti de la grille ! Vérifie ton isSafe.")
      case e: Throwable =>
        println(s"ERREUR : ${e.getMessage}")
    }
  }
}