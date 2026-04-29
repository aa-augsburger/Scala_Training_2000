
/*
 * Nom du probleme: MergeIntervals_Adv
 * Donnee: Fusionne des intervalles qui se recouvrent. Entree: Array[(Int,Int)] avec a <= b. Sortie triee et fusionnee.
 */




// 1. IMPLEMENTATION


def mergeIntervals(xs: Array[(Int, Int)]): Array[(Int, Int)] = {
    
}




// 2. TESTS

println("=== TEST: MergeIntervals_Adv ===")
val in = Array((1,3),(2,6),(8,10),(15,18),(10,12))
val out = mergeIntervals(in)
println(out.mkString(", "))
// Attendu: (1,6), (8,12), (15,18)
