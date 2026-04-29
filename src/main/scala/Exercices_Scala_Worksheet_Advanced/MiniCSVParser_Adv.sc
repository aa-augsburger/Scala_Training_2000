
/*
 * Nom du probleme: MiniCSVParser_Adv
 * Donnee: Parse un CSV simple. Separateur ';'. Champs peuvent etre entre doubles quotes et contenir ';'. Retourne Array[Array[String]].
 */




// 1. IMPLEMENTATION


def parseCsv(lines: Array[String]): Array[Array[String]] = {
    
}




// 2. TESTS

println("=== TEST: MiniCSVParser_Adv ===")
val lines = Array("a;b;c", ""x;1";y;z")
val out = parseCsv(lines)
println(out.map(_.mkString([, ", ", "]")).mkString(" | "))
// Attendu: [a, b, c] | [x;1, y, z]
