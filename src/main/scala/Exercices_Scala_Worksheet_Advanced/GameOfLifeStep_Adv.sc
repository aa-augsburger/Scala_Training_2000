
/*
 * Nom du probleme: GameOfLifeStep_Adv
 * Donnee: Calcule une etape du Game of Life. 0 mort, 1 vivant. Grille torique false: bords fixes.
 */




// 1. IMPLEMENTATION


def lifeStep(grid: Array[Array[Int]]): Array[Array[Int]] = {
    
}




// 2. TESTS

println("=== TEST: GameOfLifeStep_Adv ===")
val g = Array(Array(0,1,0), Array(0,1,0), Array(0,1,0))
val out = lifeStep(g)
println(out.map(_.mkString(" ")).mkString(" | "))
// Attendu: 0 0 0 | 1 1 1 | 0 0 0
