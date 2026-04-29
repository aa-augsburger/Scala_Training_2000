/*
 * Nom du problème: OverlappingRectangles_Exam3
 * Donnée: Vrai si les rectangles se superposent.
 */

// 1. IMPLEMENTATION
class Rectangle(val x0: Int, val y0: Int, val width: Int, val height: Int)

def isOverlapping(r1: Rectangle, r2: Rectangle): Boolean = {
    
}

// 2. TESTS
println("=== TEST: OverlappingRectangles_Exam3 ===")
val r1 = new Rectangle(0, 0, 10, 10)
val r2 = new Rectangle(5, 5, 10, 10)
println(s"Test Overlap: ${isOverlapping(r1, r2)} (Attendu: true)")