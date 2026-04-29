
/*
 * Nom du probleme: RateLimiterTokenBucket_Adv
 * Donnee: Simule un token bucket. capacity tokens max, refillRate tokens par seconde. events = (timeSec, tokensNeeded). Retourne Array[Boolean] acceptes.
 */




// 1. IMPLEMENTATION


def tokenBucket(capacity: Int, refillRate: Double, events: Array[(Double, Int)]): Array[Boolean] = {
    
}




// 2. TESTS

println("=== TEST: RateLimiterTokenBucket_Adv ===")
val ev = Array((0.0, 3), (0.0, 3), (1.0, 2), (2.0, 4))
println(tokenBucket(5, 1.0, ev).mkString(", "))
// Attendu: true, false, true, true
