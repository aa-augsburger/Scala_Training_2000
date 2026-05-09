import scala.collection.mutable.ListBuffer

/*
 * Titre : Permutations d'une chaîne (Difficile)
 * Énoncé : Génère toutes les permutations possibles des caractères d'une chaîne.
 * Exemple : "abc" -> "abc", "acb", "bac", "bca", "cab", "cba"
 * Indice : Pour chaque caractère de la chaîne, place-le en tête et concatène-le avec toutes les permutations du reste de la chaîne.
 */

// 1. IMPLEMENTATION

def permutations(s: String): List[String] = {
  val result = new ListBuffer[String]()
    if (s.length == 1)
      List(s)
    else {
      for(i <- 0 until s.length) {
        val reste = s.substring(0,i) + s.substring(i+ 1)
        val permDuReste = permutations(reste)
        for(p <- permDuReste) {
          result += (s(i) + p)
        }
      }
      result.toList
    }

}

// 2. TESTS
println("=== TEST: Permutations ===")
val res = permutations("abc")
println(s"Test 'abc': ${res.sorted}")
println(s"Nombre de résultats: ${res.length} (Attendu: 6)")
