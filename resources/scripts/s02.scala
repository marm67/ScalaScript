new Comando {
  val n: Int = 7
  def bucle() {
  	bucle(n)
  }
  def bucle(n: Int) {
  	for ( i <- 1 to n ) { println(s"""i = $i""") }
  }
}