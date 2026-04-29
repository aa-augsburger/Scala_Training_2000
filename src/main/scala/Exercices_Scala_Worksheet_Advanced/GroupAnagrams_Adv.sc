
/*
 * Nom du probleme: GroupAnagrams_Adv
 * Donnee: Regroupe les mots qui sont des anagrammes. Retourne Array[Array[String]].
 */




// 1. IMPLEMENTATION


def groupAnagrams(words: Array[String]): Array[Array[String]] = {
    
}




// 2. TESTS

println("=== TEST: GroupAnagrams_Adv ===")
val w = Array("eat", "tea", "tan", "ate", "nat", "bat")
val g = groupAnagrams(w)
println(g.map(_.mkString([, ", ", "]")).mkString(", "))
// Attendu: groupes contenant {eat,tea,ate} et {tan,nat} et {bat}
