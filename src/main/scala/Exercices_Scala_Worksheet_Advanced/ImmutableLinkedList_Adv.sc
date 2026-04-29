
/*
 * Nom du probleme: ImmutableLinkedList_Adv
 * Donnee: Implmente map, filter, foldLeft sur une liste chainee immuable.
 */




// 1. IMPLEMENTATION

sealed trait MyList[+A]
case object MyNil extends MyList[Nothing]
case class MyCons[A](head: A, tail: MyList[A]) extends MyList[A]

def map[A,B](xs: MyList[A])(f: A => B): MyList[B] = {
    
}

def filter[A](xs: MyList[A])(p: A => Boolean): MyList[A] = {
    
}

def foldLeft[A,B](xs: MyList[A], init: B)(op: (B,A) => B): B = {
    
}




// 2. TESTS

println("=== TEST: ImmutableLinkedList_Adv ===")
val xs: MyList[Int] = MyCons(1, MyCons(2, MyCons(3, MyNil)))
val ys = map(xs)(_ * 2)
val zs = filter(xs)(_ % 2 == 1)
println(foldLeft(xs, 0)(_ + _))
// Attendu: 6
println(foldLeft(ys, 0)(_ + _))
// Attendu: 12
println(foldLeft(zs, 0)(_ + _))
// Attendu: 4
