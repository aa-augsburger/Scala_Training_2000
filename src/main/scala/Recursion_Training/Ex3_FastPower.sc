/*
 * Titre : Exponentiation rapide (Intermédiaire)
 * Énoncé : Implémente la fonction puissance x^n de manière récursive.
 * Approche : Divide and Conquer.
 * - Si n est pair : x^n = (x^{n/2})^2
 * - Si n est impair : x^n = x * x^{n-1}
 * Indice : Le cas de base est n = 0. Calcule x^{n/2} une seule fois !
 */

// 1. IMPLEMENTATION

def power(x: Double, n: Int): Double = {
    if(n == 1)
      x
    else
      x * power(x, n-1)
}

// 2. TESTS
println("=== TEST: Exponentiation rapide ===")
println(s"Test 2.0^10: ${power(2.0, 10)} (Attendu: 1024.0)")
println(s"Test 3.0^3:  ${power(3.0, 3)} (Attendu: 27.0)")
