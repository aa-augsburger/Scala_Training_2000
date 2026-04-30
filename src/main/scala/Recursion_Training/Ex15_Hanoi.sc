/*
 * Titre : Les Tours de Hanoï (Difficile - Structurel)
 * Énoncé : Affiche la suite de mouvements pour déplacer n disques de la tour 'A' vers la tour 'C' en utilisant la tour 'B' comme intermédiaire.
 * Règle : Un disque plus grand ne peut jamais être placé sur un disque plus petit.
 * Indice : Pour déplacer n disques de A vers C : 
 * 1. Déplace n-1 disques de A vers B.
 * 2. Déplace le dernier disque de A vers C.
 * 3. Déplace les n-1 disques de B vers C.
 */

// 1. IMPLEMENTATION

def hanoi(n: Int, from: String, to: String, aux: String): Unit = {
    // Ton code ici (utilise println pour chaque mouvement, ex: println(s"Move $from to $to"))
}

// 2. TESTS
println("=== TEST: Tours de Hanoï (n=3) ===")
hanoi(3, "A", "C", "B")
