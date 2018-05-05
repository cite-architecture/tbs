package edu.holycross.shot.tbs

import edu.holycross.shot.cite._
import edu.holycross.shot.cex._
//import edu.holycross.shot.citeobj._
//import edu.holycross.shot.scm._

import scala.scalajs.js
import scala.scalajs.js.annotation._


/**  An individual text-bearing surface has an identifier and
* a citable documentary image.
*/
@JSExportAll case class Tbs (surface: Cite2Urn, image: Cite2Urn) {

}

/** Factory object for creating [[Tbs]]s from delimited string data.
*/
object Tbs {

  /** Create a [[Tbs]] from a String.
  *
  * @param s String data for a [[Tbs]].
  * @param delimiter Delimiting string.
  */
  def apply(s: String, delimiter: String = "#"):  Tbs = {
    val parts = s.split(delimiter)
    try {
      val surf = Cite2Urn(parts(0))
      val img = Cite2Urn(parts(1))
      Tbs(surf,img)
    } catch {
      case t: Throwable => throw(t)
    }
  }
}
