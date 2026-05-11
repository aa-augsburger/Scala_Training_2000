package Labo.Labo17

object MagicPotionsSolution extends App {

  type Potions = Array[Array[Char]]

  // Données de test
  val initialPotions: Potions = Array(
    Array('V', 'J', 'V', 'J'),
    Array('J', 'V', 'J', 'V'),
    Array(' ', ' ', ' ', ' ')
  )

  // --- LANCEMENT ---
  try {
    println("Recherche de solution en cours...")
    if (solve(initialPotions)) {
      println("BRAVO : Labyrinthe chimique terminé !")
    } else {
      println("DOMMAGE : Pas de solution possible.")
    }
  } catch {
    case e: Throwable => println(s"Erreur critique : ${e.getMessage}")
  }

  // --- LE MOTEUR (L'algorithme de décision) ---
  def solve(etat: Potions): Boolean = {
    if(game_won(etat)) return true
    else {
      for(i <- etat.indices) {
        for(j <- etat.indices) {
          val backup = cloneGrid(etat)
          if(i != j) {
           if(peutVerser(etat,i,j)) {
            verser(etat, i, j)
             if(solve(etat))
               return true
             else {
              for(i <- etat.indices) {
                for(j <- etat(i).indices) {
                  etat(i)(j) = backup(i)(j)
                }
              }
             }
           }
          }
        }
      }
      false
    }
  }

  def cloneGrid(grid: Array[Array[Char]]): Array[Array[Char]] = {
    val rows = grid.length
    val cols = grid(0).length
    val copy = Array.ofDim[Char](rows, cols)

    for (r <- 0 until rows) {
      for (c <- 0 until cols) {
        copy(r)(c) = grid(r)(c)
      }
    }
    copy
  }

  def restoreGrid(dst: Array[Array[Char]], src: Array[Array[Char]]): Unit = {
    for (r <- 0 until dst.length) {
      for (c <- 0 until dst(0).length) {
        dst(r)(c) = src(r)(c)
      }
    }
  }


  def game_won(potions: Potions): Boolean = {
    // TODO: Parcourir chaque fiole.
    // Une fiole est OK si tous ses éléments non-vides sont identiques.
    for(fiole <- potions) {
      for(i <- fiole.indices) {
        if(fiole(0) != fiole(i)) return false
      }
    }
    true
  }

  def peutVerser(potions: Potions, i: Int, j: Int): Boolean = {
    // TODO:
    // - La fiole i n'est pas vide ?
    // - La fiole j a de la place ?
    // - Bonus : Le liquide du haut de i est le même que celui du haut de j (ou j est vide) ?
    var espaceVideSrc = 0
    var espaceVideDest = 0
    var hautSrc = ' '
    var hautDest = ' '
    var flagSrc = false
    var flagDest = false
    for(e <- potions(i).length - 1 to 0 by -1) {
      if (potions(i)(e) == ' ') espaceVideSrc += 1
      if(potions(j)(e) == ' ') espaceVideDest += 1


      if(potions(i)(e) != ' ' && !flagSrc) {
        hautSrc = potions(i)(e)
        flagSrc = true
      }
      if(potions(j)(e) != ' '  && !flagDest) {
        hautDest = potions(j)(e)
        flagDest = true
      }
    }

    if(espaceVideSrc == 4)
      return false
    if(espaceVideDest == 0)
      return false

    if(hautSrc != hautDest && espaceVideDest != 4) return false

    true
  }

  def verser(potions: Potions, i: Int, j: Int): Unit = {
    // TODO:
    // Prendre la dernière lettre de potions(i) qui n'est pas ' '
    // La mettre à la première place libre (' ') de potions(j)
    var src = potions(i)
    var dest = potions(j)
    var idxSrc = -1
    var idxDest = -1
    var flagSrc = false
    var flagDest = false
    for(e <- src.length - 1 to 0 by -1) {
      if(src(e) != ' ' && !flagSrc) {
        idxSrc = e
        flagSrc = true
      }
    }

    for(e <- dest.length - 1 to 0 by -1) {
      if(dest(e) != ' ' && !flagDest) {
        idxDest = e + 1
        flagDest = true
      }
      if(e == 0 && !flagDest) idxDest = 0
    }
    src(idxSrc) = ' '
    dest(idxDest) = src(idxSrc)
  }

  // Petit utilitaire pour voir tes fioles dans la console
  def display(p: Potions): Unit = {
    p.foreach(f => println(f.mkString("|", "", "|")))
    println("-------")
  }
}