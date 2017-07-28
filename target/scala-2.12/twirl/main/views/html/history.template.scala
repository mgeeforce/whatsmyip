
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

object history extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[io.adeptus.whatismyip.models.Address],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addresses: List[io.adeptus.whatismyip.models.Address], mode: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="jumbotron">
  <h1>Adeptus IP History</h1>
  <p class="lead">IP <strong>"""),_display_(/*6.31*/addresses(0)/*6.43*/.ipAddress),format.raw/*6.53*/("""</strong> was recorded at <strong>"""),_display_(/*6.88*/addresses(0)/*6.100*/.created.format("yyyy-MM-dd HH:mm:ss")),format.raw/*6.138*/("""</strong>.</p>
  <hr class="my-4">
  <p class="lead">Application running in <strong>"""),_display_(/*8.51*/mode),format.raw/*8.55*/("""</strong> mode.</p>
  
</div>
  
  Your IP address history is:
  
  <table class="table table-sm table-striped table-bordered">
  	<thead>
  		<tr>
  			<th>IP</th>
  			<th>Created</th>
  		</tr>
  	</thead>
  	<tbody>
  	
  	"""),_display_(/*23.5*/for(address <- addresses) yield /*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
  		"""),format.raw/*24.5*/("""<tr>
  			<td>"""),_display_(/*25.11*/address/*25.18*/.ipAddress),format.raw/*25.28*/("""</td>
  			<td>"""),_display_(/*26.11*/address/*26.18*/.created.format("yyyy-MM-dd HH:mm:ss")),format.raw/*26.56*/("""</td>
  		</tr>
  	""")))}),format.raw/*28.5*/("""
  	"""),format.raw/*29.4*/("""</tbody>
  </table>
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(addresses:List[io.adeptus.whatismyip.models.Address],mode:String): play.twirl.api.HtmlFormat.Appendable = apply(addresses,mode)

  def f:((List[io.adeptus.whatismyip.models.Address],String) => play.twirl.api.HtmlFormat.Appendable) = (addresses,mode) => apply(addresses,mode)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 28 16:16:40 MDT 2017
                  SOURCE: /Users/mike/Projects/play/whatsmyip/app/views/history.scala.html
                  HASH: df7cf8ac6e31e39bea2753359f8668101f5a96d8
                  MATRIX: 993->1|1157->70|1185->73|1216->96|1255->98|1282->99|1392->183|1412->195|1442->205|1503->240|1524->252|1583->290|1694->375|1718->379|1972->607|2013->632|2053->634|2085->639|2127->654|2143->661|2174->671|2217->687|2233->694|2292->732|2342->752|2373->756|2424->777
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|38->6|38->6|40->8|40->8|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|61->29|63->31
                  -- GENERATED --
              */
          