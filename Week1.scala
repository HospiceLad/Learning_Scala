package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = if (c==0 || c==r) 1 else pascal(c-1,r-1)+pascal(c,r-1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def comptage(chaine: List[Char],nbre:Int=0): Int=
        if (nbre<0 || chaine.isEmpty) nbre
        else if (chaine.head=='(') comptage(chaine.tail,nbre+1)
        else if (chaine.head==')') comptage(chaine.tail,nbre-1)
        else comptage(chaine.tail,nbre)
      comptage(chars)==0
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
      if (money<0 || coins.isEmpty) 0
      else if (money==0) 1
      else countChange(money-coins.head,coins)+countChange(money,coins.tail)

}
