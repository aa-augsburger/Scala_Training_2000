
/*
 * Nom du probleme: BinaryTreeOps_Adv
 * Donnee: Arbre binaire. Calcule height, size, isBST (avec bornes), et inorder.
 */




// 1. IMPLEMENTATION

sealed trait BTree[+A]
case object Empty extends BTree[Nothing]
case class Node[A](value: A, left: BTree[A], right: BTree[A]) extends BTree[A]

def height[A](t: BTree[A]): Int = {
    
}

def size[A](t: BTree[A]): Int = {
    
}

def inorder[A](t: BTree[A]): Array[A] = {
    
}

def isBST(t: BTree[Int]): Boolean = {
    
}




// 2. TESTS

println("=== TEST: BinaryTreeOps_Adv ===")
val t = Node(2, Node(1, Empty, Empty), Node(3, Empty, Empty))
println(height(t))
// Attendu: 2
println(size(t))
// Attendu: 3
println(inorder(t).mkString(", "))
// Attendu: 1, 2, 3
println(isBST(t))
// Attendu: true
