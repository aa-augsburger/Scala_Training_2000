object Permutations {

  /**
   * Moteur récursif : Génère toutes les permutations en échangeant
   * les éléments à partir de l'index k.
   */
  def permute(arr: Array[Char], k: Int): Unit = {
    // 1. ARRÊT (SUCCÈS) : Toutes les positions sont fixées, on affiche !
    if (k == arr.length) {
      println(arr.mkString) // (ou printArr(arr))
      return
    }

    // 2. EXPLORATION
    for (i <- k until arr.length) {
      swap(arr, k, i)     // ACTION : on place le candidat en position k
      permute(arr, k + 1) // RÉCURSION : on fige k et on passe au reste
      swap(arr, k, i)     // BACKTRACK : on restaure l'ordre initial
    }
  }

  def printArr(arr: Array[Char]): Unit = {
    for(c <- arr) {
      print(c)
    }
    println()
  }

  /** Fonction utilitaire : Échange deux éléments d'un tableau en place. */
  def swap(arr: Array[Char], i: Int, j: Int): Unit = {
    val tmp = arr(i)
    arr(i) = arr(j)
    arr(j) = tmp
  }

  def main(args: Array[String]): Unit = {
    val input = "ABC".toCharArray

    try {
      println(s"Génération des permutations pour l'entrée '${input.mkString}' :")

      // On lance la machine en tentant de fixer à partir de l'index 0
      permute(input, 0)

      // Pour "ABC", il doit y avoir exactement 6 lignes imprimées (3! = 6 permutations)
    } catch {
      case _: NotImplementedError =>
        println("🌱 Moteur en pause : le code de permute n'est pas encore complété (???).")
      case e: Throwable =>
        println(s"🌟 Erreur inattendue : ${e.getMessage}")
    }
  }
}