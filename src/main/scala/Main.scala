import com.twitter.io.TempFile
import com.twitter.util.Eval
import java.io.{File, FileWriter}

trait Comando {
  val n: Int
  def bucle(n: Int): Unit
  def bucle(): Unit
}

object Main extends App {

    // val path = s"""c:/scala/proyectos/morfeo/resources/scripts/$s"""
    // val script = Source.fromFile(path).mkString.toUpperCase
    // println(script.mkString)

    // val eval = new Eval
    // val config = eval[MyConfig](new File("config/config.scala"))
    // println("name: %s, number: %d".format(config.name, config.number))
    // 
    

    // The Eval Function evaluates files, strings, or input streams as Scala code, and returns the result.
    // http://vishnu667.github.io/run-time-scala-script-evaluation-using-twitters-util-eval/


	val eval = new Eval // Initializing The Eval without any target location

//	val script = "c://scala//proyectos//scalascript//resources//OnePlusOne.scala"
//	val csvEval: Int = eval[Int](new File(script))

	val path = "c://scala//proyectos//scalascript//resources//scripts//"
	var script = path + "s01.scala"

//    val x1 = (new Eval).apply[Int]("1 + 1")
    println("Ejecutando = " + script)
    val x2 = eval.apply[Unit](new File(script))
    println("x2 = " + x2)

    script = path + "s02.scala"
    println("Ejecutando = " + script)
    val comando = eval.apply[Comando](new File(script))
    comando.bucle(3)

}