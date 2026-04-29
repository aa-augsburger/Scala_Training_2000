
/*
 * Nom du probleme: SudokuValidator_Adv
 * Donnee: Verifie qu une grille 9x9 Sudoku est valide (sans forcement etre complete). '.' signifie vide.
 */




// 1. IMPLEMENTATION


def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    
}




// 2. TESTS

println("=== TEST: SudokuValidator_Adv ===")
val b = Array(
  Array('5','3','.','.','7','.','.','.','.'),
  Array('6','.','.','1','9','5','.','.','.'),
  Array('.','9','8','.','.','.','.','6','.'),
  Array('8','.','.','.','6','.','.','.','3'),
  Array('4','.','.','8','.','3','.','.','1'),
  Array('7','.','.','.','2','.','.','.','6'),
  Array('.','6','.','.','.','.','2','8','.'),
  Array('.','.','.','4','1','9','.','.','5'),
  Array('.','.','.','.','8','.','.','7','9')
)
println(isValidSudoku(b))
// Attendu: true
