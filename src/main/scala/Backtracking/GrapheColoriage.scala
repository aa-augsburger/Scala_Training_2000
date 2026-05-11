object GraphColoring {

  // --- LOGIQUE DU MOTEUR À COMPLÉTER ---

  /**
   * Vérifie si le sommet `v` peut recevoir la couleur `c`
   * en regardant la matrice d'adjacence `graph`.
   */
  def isValid(graph: Array[Array[Int]], colors: Array[Int], v: Int, c: Int): Boolean = {
    for(i <- graph.indices) {
    if(graph(v)(i) == 1 && colors(i) == c) return false
    }
    true
  }

  /**
   * Moteur récursif : tente de colorier le sommet `v` avec au plus `m` couleurs.
   */
  def solve(graph: Array[Array[Int]], colors: Array[Int], m: Int, v: Int): Boolean = {
    if(v == graph.length) return true

    for(c <- 1 to m) {
      if(isValid(graph, colors, v, c)) {
        colors(v) = c
        if(solve(graph, colors, m, v+1)) return true
        else {
          colors(v) = 0
        }
      }
    }
    false
  }

  def main(args: Array[String]): Unit = {
    // Matrice d'adjacence pour un graphe de 4 sommets (cycle 0-1-2-3-0)
    // 1 = connectés (voisins), 0 = pas d'arête directe
    val graph = Array(
      Array(0, 1, 0, 1), // Sommet 0 connecté à 1 et 3
      Array(1, 0, 1, 0), // Sommet 1 connecté à 0 et 2
      Array(0, 1, 0, 1), // Sommet 2 connecté à 1 et 3
      Array(1, 0, 1, 0)  // Sommet 3 connecté à 0 et 2
    )

    val m = 2 // Nombre maximum de couleurs autorisées
    val colors = Array.fill(graph.length)(0) // 0 = pas encore coloré

    try {
      println(s"Recherche d'une coloration valide avec $m couleurs...")

      // On lance la recherche en partant du sommet 0
      if (solve(graph, colors, m, 0)) {
        println("SUCCÈS : Configuration de couleurs trouvée !")
        for (i <- colors.indices) {
          println(s"  Sommet $i -> Couleur ${colors(i)}")
        }
      } else {
        println(s"ÉCHEC : Impossible de colorier ce graphe sans conflit avec seulement $m couleurs.")
      }

    } catch {
      case _: NotImplementedError =>
        println("🌱 Pas de panique ! Le code n'est pas encore écrit (les ??? sont toujours là), prends ton temps.")
      case e: Throwable =>
        println(s"🌟 Oups, une petite erreur inattendue est survenue : ${e.getMessage}")
    }
  }
}