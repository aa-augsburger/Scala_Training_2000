/*
 * Nom du problème: AutonomousCar_Exam3
 * Donnée: Traitement signal: trouver max et centre du pic.
 */

// 1. IMPLEMENTATION

def detectMax(in: Array[Int]): Int = {
    
}

def detectCenter(in: Array[Double], thresh: Double): Int = {
    
}

// 2. TESTS
println("=== TEST: AutonomousCar_Exam3 ===")
val img = Array(0, 0, 10, 50, 50, 50, 10, 0)
println(s"Max: ${detectMax(img)} (Attendu: 50)")
val signal = Array(0.0, 0.0, 100.0, 100.0, 100.0, 0.0)
println(s"Center: ${detectCenter(signal, 100.0)} (Attendu: 3)")