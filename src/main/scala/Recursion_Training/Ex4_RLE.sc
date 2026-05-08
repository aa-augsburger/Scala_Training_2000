/*
 * Titre : Compression RLE récursive (Intermédiaire/Difficile)
 * Énoncé : Transforme une liste de caractères en une liste de tuples (Char, Int).
 * Exemple : List('a', 'a', 'b') -> List(('a', 2), ('b', 1))
 * Indice : Utilise le pattern matching. Tu peux utiliser 'span' pour séparer les éléments identiques en tête.
 */

// 1. IMPLEMENTATION

def encodeRLE(chars: List[Char]): List[(Char, Int)] = {

}

// 2. TESTS
println("=== TEST: Compression RLE ===")
val input = List('a', 'a', 'b', 'c', 'c', 'c')
println(s"Test RLE: ${encodeRLE(input)} (Attendu: List(('a', 2), ('b', 1), ('c', 3)))")
