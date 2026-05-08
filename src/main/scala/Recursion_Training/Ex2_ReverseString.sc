/*
 * Titre : Inversion de chaîne (Facile)
 * Énoncé : Écris une fonction récursive qui inverse les caractères d'une chaîne de caractères.
 * Indice : Pense à ce qu'il se passe si tu prends le dernier caractère et que tu le places devant le résultat de l'inversion du "reste" de la chaîne.
 */

// 1. IMPLEMENTATION

def reverse(s: String): String = {
    if(s.length == 1) {
      s
    }
    else {
      s.substring(s.length-1,s.length) + reverse(s.substring(0, s.length-1))
    }

}

// 2. TESTS
println("=== TEST: Inversion de chaîne ===")
println(s"Test 'scala': ${reverse("scala")} (Attendu: 'alacs')")
println(s"Test 'r':     ${reverse("r")} (Attendu: 'r')")
