import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark._
import sys.process._
import org.apache.spark.sql.{Row, SparkSession, types}
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._

object Project1 {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("ComplexDataProcessing").setMaster("local[*]")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val spark = SparkSession.builder()
      .config("fs.s3a.access.key", "")
      .config("fs.s3a.secret.key", "")
      .getOrCreate()
    spark.conf.set("spark.sql.repl.eagerEval.enabled","true")


  }

}
