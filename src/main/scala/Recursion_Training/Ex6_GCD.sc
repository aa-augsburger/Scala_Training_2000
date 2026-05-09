/*
 * Titre : PGCD - Plus Grand Commun Diviseur (Facile)
 * Énoncé : Calcule le PGCD de deux nombres a et b en utilisant l'algorithme d'Euclide récursif.
 * Indice : Le PGCD(a, b) est égal au PGCD(b, a % b). Le cas de base est quand b == 0.
 */

// 1. IMPLEMENTATION

def gcd(a: Int, b: Int): Int = {
    if(b == 0) {
      a
    } else {
      gcd(b, a%b)
    }
}

// 2. TESTS
println("=== TEST: PGCD ===")
println(s"Test gcd(48, 18): ${gcd(48, 18)} (Attendu: 6)")
println(s"Test gcd(10, 5):  ${gcd(10, 5)} (Attendu: 5)")
