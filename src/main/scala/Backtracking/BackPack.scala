object KnapsackSolver {

  // Les objets disponibles : (Poids, Valeur)
  // Objet 0 : 1kg, 1€ | Objet 1 : 3kg, 4€ | Objet 2 : 4kg, 5€ | Objet 3 : 5kg, 7€
  val weights = Array(1, 3, 4, 5)
  val values  = Array(1, 4, 5, 7)
  val maxCapacity = 7

  // --- LOGIQUE DU MOTEUR À COMPLÉTER ---
  // index         : l'objet qu'on est en train de regarder
  // currentWeight : le poids cumulé dans le sac actuellement
  // currentValue  : la valeur cumulée dans le sac actuellement
  def solve(index: Int, currentWeight: Int, currentValue: Int): Int = {
    if(index == weights.length) return currentValue

    //BRANCHE A ON LAISSE L'OBJECT ACTUEL
    val leaveScore = solve(index + 1, currentWeight, currentValue)

    //BRANCHE B ON PREND L'OBJECT ACTUEL
    var takeScore = 0
    if(currentWeight + weights(index) <= maxCapacity) {
      takeScore = solve(index + 1, currentWeight + weights(index), currentValue + values(index))
    }
    Math.max(leaveScore, takeScore)
  }

  def main(args: Array[String]): Unit = {
    try {
      println("Lancement de l'optimisation du sac à dos...")

      // On démarre à l'index 0, avec un sac vide (0 kg, 0 d'or)
      val maxGold = solve(0, 0, 0)

      println(s"SUCCÈS : Le butin maximal possible est de $maxGold 💰")
      // Indice de vérification : pour cet exemple, le max est 9 (en prenant l'objet 1 et l'objet 3 : 3kg+5kg n'est pas bon car 8kg > 7kg... attends, calcule-le par toi-même !)

    } catch {
      case _: NotImplementedError =>
        println("🌱 Pas de panique ! Le code n'est pas encore écrit (les ??? sont toujours là), prends ton temps.")
      case e: ArrayIndexOutOfBoundsException =>
        println("ERREUR D'INDEX : Attention à ta condition d'arrêt quand l'index arrive au bout du tableau !")
      case e: Throwable =>
        println(s"🌟 Oups, une petite erreur inattendue est survenue : ${e.getMessage}")
    }
  }
}