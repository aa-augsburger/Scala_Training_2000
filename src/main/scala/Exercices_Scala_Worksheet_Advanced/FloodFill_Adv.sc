
/*
 * Nom du probleme: FloodFill_Adv
 * Donnee: Flood fill sur une grille. Remplace la region connectee (4 voisins) de start par newColor.
 */




// 1. IMPLEMENTATION


def floodFill(grid: Array[Array[Int]], sr: Int, sc: Int, newColor: Int): Array[Array[Int]] = {
    
}




// 2. TESTS

println("=== TEST: FloodFill_Adv ===")
val g = Array(Array(1,1,1), Array(1,1,0), Array(1,0,1))
val out = floodFill(g, 1, 1, 2)
println(out.map(_.mkString(" ")).mkString(" | "))
// Attendu: 2 2 2 | 2 2 0 | 2 0 1
