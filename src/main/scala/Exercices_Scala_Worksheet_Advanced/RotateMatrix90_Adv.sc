
/*
 * Nom du probleme: RotateMatrix90_Adv
 * Donnee: Rotation 90 degres horaire d une matrice carree NxN. Retourne une nouvelle matrice.
 */




// 1. IMPLEMENTATION


def rotate90(m: Array[Array[Int]]): Array[Array[Int]] = {
    
}




// 2. TESTS

println("=== TEST: RotateMatrix90_Adv ===")
val m = Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))
val r = rotate90(m)
println(r.map(_.mkString(" ")).mkString(" | "))
// Attendu: 7 4 1 | 8 5 2 | 9 6 3
