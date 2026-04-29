
/*
 * Nom du probleme: TopKFrequentWords_Adv
 * Donnee: Retourne les k mots les plus frequents, en cas d egalite ordre lexicographique.
 */




// 1. IMPLEMENTATION


def topKWords(text: String, k: Int): Array[String] = {
    
}




// 2. TESTS

println("=== TEST: TopKFrequentWords_Adv ===")
val t = "to be or not to be that is the question to be"
println(topKWords(t, 3).mkString(", "))
// Attendu: be, to, is
