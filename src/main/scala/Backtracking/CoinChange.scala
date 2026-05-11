object CoinChangeSolver {

  // Les pièces disponibles dans la machine
  val coins = Array(1, 2, 5)

  // Renvoie le nombre MINIMUM de pièces pour atteindre le montant 'amount'
  def solve(amount: Int): Int = {
    if(amount == 0) return amount

    var minCoins = 999999

    for(coin <- coins) {
      if(amount - coin >= 0)
        return 1 + solve(amount - coin)
    }
    amount
  }

  def main(args: Array[String]): Unit = {
    val targetAmount = 11

    try {
      println(s"Calcul du rendu optimal pour $targetAmount CHF...")
      val minCoins = solve(targetAmount)

      // Si le résultat est trop grand (proche de Int.MaxValue), c'est qu'aucun rendu n'est possible
      if (minCoins >= 999999) {
        println("ÉCHEC : Impossible de rendre la monnaie exacte avec ces pièces.")
      } else {
        // Pour 11 CHF avec [1, 2, 5], la réponse optimale est 3 (5 + 5 + 1)
        println(s"SUCCÈS : Rendu optimal en exactement $minCoins pièces ! 🪙")
      }

    } catch {
      case _: NotImplementedError =>
        println("🌱 Moteur en pause : il reste des '???' à remplacer.")
      case e: Throwable =>
        println(s"🌟 Erreur système : ${e.getMessage}")
    }
  }
}