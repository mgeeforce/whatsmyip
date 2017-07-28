
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

object heroku extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(responseBody: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  
  The response body looks like this: """),_display_(/*6.39*/responseBody),format.raw/*6.51*/("""
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(responseBody:String): play.twirl.api.HtmlFormat.Appendable = apply(responseBody)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (responseBody) => apply(responseBody)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jul 26 11:25:36 MDT 2017
                  SOURCE: /Users/mike/Projects/play/whatsmyip/app/views/heroku.scala.html
                  HASH: 3fc3c72120ff4361cede7264ac3bfb4f78ef166e
                  MATRIX: 949->1|1066->23|1094->26|1125->49|1164->51|1193->54|1286->121|1318->133|1349->135
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|39->7
                  -- GENERATED --
              */
          