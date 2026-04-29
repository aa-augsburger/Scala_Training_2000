
/*
 * Nom du probleme: BinarySearchFirstLast_Adv
 * Donnee: Dans un tableau trie, retourne (firstIndex,lastIndex) d une valeur x, ou (-1,-1) si absent.
 */




// 1. IMPLEMENTATION


def firstLastIndex(xs: Array[Int], x: Int): (Int, Int) = {
    
}




// 2. TESTS

println("=== TEST: BinarySearchFirstLast_Adv ===")
val a = Array(1,2,2,2,3,4,4,5)
println(firstLastIndex(a, 2))
// Attendu: (1,3)
println(firstLastIndex(a, 6))
// Attendu: (-1,-1)
