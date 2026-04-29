/*
 * Nom du problème: AccessPark_2023
 * Donnée: Autorisé si : Age >= 10, 1.40 <= Taille <= 2.10.
 */

// 1. IMPLEMENTATION

def access(age: Int, height: Double): Boolean = {
    
}

// 2. TESTS
println("=== TEST: AccessPark_2023 ===")
println(s"Test (12, 1.50): ${access(12, 1.50)} (Attendu: true)")
println(s"Test (9, 1.50):  ${access(9, 1.50)} (Attendu: false)")