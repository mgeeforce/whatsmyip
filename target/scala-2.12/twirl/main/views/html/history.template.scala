
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

object history extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[io.adeptus.whatismyip.models.Address],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addresses: List[io.adeptus.whatismyip.models.Address]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="jumbotron">
  <h1>Adeptus IP History</h1>
  <p class="lead">IP <strong>"""),_display_(/*6.31*/addresses(0)/*6.43*/.ipAddress),format.raw/*6.53*/("""</strong> was recorded at <strong>"""),_display_(/*6.88*/addresses(0)/*6.100*/.created.format("yyyy-MM-dd HH:mm:ss")),format.raw/*6.138*/("""</strong>.</p>
  <hr class="my-4">
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
  	
  	"""),_display_(/*21.5*/for(address <- addresses) yield /*21.30*/ {_display_(Seq[Any](format.raw/*21.32*/("""
  		"""),format.raw/*22.5*/("""<tr>
  			<td>"""),_display_(/*23.11*/address/*23.18*/.ipAddress),format.raw/*23.28*/("""</td>
  			<td>"""),_display_(/*24.11*/address/*24.18*/.created.format("yyyy-MM-dd HH:mm:ss")),format.raw/*24.56*/("""</td>
  		</tr>
  	""")))}),format.raw/*26.5*/("""
  	"""),format.raw/*27.4*/("""</tbody>
  </table>
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(addresses:List[io.adeptus.whatismyip.models.Address]): play.twirl.api.HtmlFormat.Appendable = apply(addresses)

  def f:((List[io.adeptus.whatismyip.models.Address]) => play.twirl.api.HtmlFormat.Appendable) = (addresses) => apply(addresses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 28 15:06:13 MDT 2017
                  SOURCE: /Users/mike/Projects/play/whatsmyip/app/views/history.scala.html
                  HASH: 974216b099fd9e507945cc4792db1b1775da975d
                  MATRIX: 986->1|1136->56|1164->59|1195->82|1234->84|1261->85|1371->169|1391->181|1421->191|1482->226|1503->238|1562->276|1828->516|1869->541|1909->543|1941->548|1983->563|1999->570|2030->580|2073->596|2089->603|2148->641|2198->661|2229->665|2280->686
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|38->6|38->6|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|56->24|56->24|58->26|59->27|61->29
                  -- GENERATED --
              */
          