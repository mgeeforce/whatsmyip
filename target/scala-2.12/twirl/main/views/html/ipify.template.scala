
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object ipify extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ip: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  
  Your IP address is: """),_display_(/*6.24*/ip),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(ip:String): play.twirl.api.HtmlFormat.Appendable = apply(ip)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (ip) => apply(ip)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jul 26 11:25:36 MDT 2017
                  SOURCE: /Users/mike/Projects/play/whatsmyip/app/views/ipify.scala.html
                  HASH: b67e1ccdd1e3bd26d1d2b845bb058b66317a694e
                  MATRIX: 948->1|1055->13|1083->16|1114->39|1153->41|1182->44|1260->96|1282->98|1313->100
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|39->7
                  -- GENERATED --
              */
          