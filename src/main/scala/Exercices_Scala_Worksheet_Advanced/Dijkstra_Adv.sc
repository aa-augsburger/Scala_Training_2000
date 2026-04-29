
/*
 * Nom du probleme: Dijkstra_Adv
 * Donnee: Dijkstra sur graphe pondere non negatif. edges: Array[(u,v,w)]. Retourne distances depuis source (taille n).
 */




// 1. IMPLEMENTATION


def dijkstra(n: Int, edges: Array[(Int, Int, Int)], source: Int): Array[Int] = {
    
}




// 2. TESTS

println("=== TEST: Dijkstra_Adv ===")
val edges = Array((0,1,4),(0,2,1),(2,1,2),(1,3,1),(2,3,5))
println(dijkstra(4, edges, 0).mkString(", "))
// Attendu: 0, 3, 1, 4
