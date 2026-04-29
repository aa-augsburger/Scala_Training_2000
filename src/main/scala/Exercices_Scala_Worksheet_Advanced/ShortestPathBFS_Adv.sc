
/*
 * Nom du probleme: ShortestPathBFS_Adv
 * Donnee: Plus court chemin en BFS dans une grille avec obstacles. 0 libre, 1 mur. 4 voisins. Retourne distance ou -1.
 */




// 1. IMPLEMENTATION


def shortestPath(grid: Array[Array[Int]], start: (Int,Int), goal: (Int,Int)): Int = {
    
}




// 2. TESTS

println("=== TEST: ShortestPathBFS_Adv ===")
val g = Array(Array(0,0,0), Array(1,1,0), Array(0,0,0))
println(shortestPath(g, (0,0), (2,2)))
// Attendu: 4
