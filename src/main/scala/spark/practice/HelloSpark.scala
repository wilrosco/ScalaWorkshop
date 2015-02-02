package spark.practice

/**
 * Created by will on 24/01/15.
 */
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
object HelloSpark {
  def main(args:Array[String]) = {

    def sc = new SparkContext();
    val textFile = sc.textFile("/home/will/fileToRead/cars.csv")
    println(textFile.collect().length);
  }
}
