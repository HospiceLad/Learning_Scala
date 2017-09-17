def insert(a:Int, coins:List[Int]): List[Int]=
  if (coins.isEmpty || a <= coins.head) a::coins else coins.head::insert(a,coins.tail)

def tri_insertion(coins:List[Int]): List[Int]=
  if (coins.isEmpty) List() else
    insert(coins.head,tri_insertion(coins.tail))
