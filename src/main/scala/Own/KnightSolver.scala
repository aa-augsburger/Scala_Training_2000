object KnightSolver extends App {

  val N = 5
  val board = Array.ofDim[Int](N, N)
  val maxMove = N*N

  // Vecteurs de déplacements (L-moves)
  val moveX = Array(2, 1, -1, -2, -2, -1, 1, 2)
  val moveY = Array(1, 2, 2, 1, -1, -2, -2, -1)

  try {
    board(0)(0) = 1
    if (solve(0, 0, 2)) {
      display()
    } else {
      println("✨ L'exploration est terminée, mais aucun chemin complet n'a été trouvé.")
    }
  } catch {
    case _: NotImplementedError =>
      println("🌱 Pas de panique ! Le code n'est pas encore écrit (les ??? sont toujours là), prends ton temps.")
    case e: Exception =>
      println(s"🌟 Oups, une petite erreur inattendue est survenue : ${e.getMessage}")
  }

  // --- LOGIQUE À RÉÉCRIRE ---

  def solve(currX: Int, currY: Int, stepCount: Int): Boolean = {
  if(stepCount  > maxMove) return true
    else{
      for(i <- moveX.indices) {
        val nextX =  currX + moveX(i)
        val nextY = currY + moveY(i)
        if (isSafe(nextX, nextY)) {
          board(nextX)(nextY) = stepCount
         if(solve(nextX, nextY, stepCount+1))
           return true
         else {
           board(nextX)(nextY) = 0
         }
        }
      }
      false
    }
  }


  def isSafe(x: Int, y: Int): Boolean = {
    x >= 0 && x < N && y >= 0 && y < N && board(x)(y) == 0
  }


  def display(): Unit = {
    println("-" * (N * 5))
    for (row <- board) {
      println(row.map("%2d".format(_)).mkString(" | "))
    }
    println("-" * (N * 5))
  }
}