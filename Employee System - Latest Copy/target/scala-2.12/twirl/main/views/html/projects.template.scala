
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], projects: List[models.project.Project],
user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Projects",user)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""

    """),_display_(/*5.6*/if((user != null) && ("employee".equals(user.getRole())))/*5.63*/ {_display_(Seq[Any](format.raw/*5.65*/("""
        """),format.raw/*6.9*/("""<h1>Your Current Projects</h1>
    """)))}/*7.7*/else/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""
        """),format.raw/*8.9*/("""<h1>Currently Active Projects</h1>
    """)))}),format.raw/*9.6*/("""


    """),format.raw/*12.74*/("""
	"""),_display_(/*13.3*/if(flash.containsKey("success"))/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
		"""),format.raw/*14.3*/("""<div class="alert alert-success">
			"""),_display_(/*15.5*/flash/*15.10*/.get("success")),format.raw/*15.25*/("""
		"""),format.raw/*16.3*/("""</div>
""")))}),format.raw/*17.2*/("""
    """),format.raw/*18.5*/("""<div class="col-sm-3">
        <h4>Project List</h4>
            <ul class="list-group">
                <a href = """"),_display_(/*21.29*/routes/*21.35*/.HomeController.projects(0)),format.raw/*21.62*/("""" class="list-group-item">All Projects</a>
            """),_display_(/*22.14*/for(p<-projects) yield /*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
                """),format.raw/*23.17*/("""<a href = """"),_display_(/*23.29*/routes/*23.35*/.HomeController.projects(p.getId())),format.raw/*23.70*/("""" class="list-group-item catheight">"""),_display_(/*23.107*/p/*23.108*/.getName),format.raw/*23.116*/("""
                    """),format.raw/*24.21*/("""<span class="badge">"""),_display_(/*24.42*/p/*24.43*/.getEmployees.size),format.raw/*24.61*/("""</span> 
                </a>
            """)))}),format.raw/*26.14*/("""
        """),format.raw/*27.9*/("""</ul>
    </div>

    <div class="col-sm-9">

        """),_display_(/*32.10*/if((user != null) && ("employee".equals(user.getRole())))/*32.67*/ {_display_(Seq[Any](format.raw/*32.69*/("""
            """),format.raw/*33.13*/("""<h4>Select from your assigned projects from the list to view full list of colleagues active on it.</h4>
        """)))}/*34.11*/else/*34.16*/{_display_(Seq[Any](format.raw/*34.17*/("""
            """),format.raw/*35.13*/("""<h4>Select a project from the list to view all employees currently assigned to it.</h4>
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""<table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Name</th>
            <th>Job Role</th>
            <th>Street1</th>
            <th>Street2</th>
            <th>Town</th>
            <th>Post Code</th>
            <th>Department</th>
            <th>Email</th>
            <th>DOB</th>
        </tr>
        </thead>
        <tbody>
        <!-- Employee row(s) -->
       
            """),format.raw/*57.66*/("""
            """),_display_(/*58.14*/for(e<-employees) yield /*58.31*/ {_display_(Seq[Any](format.raw/*58.33*/("""
               """),format.raw/*59.16*/("""<tr>
                    """),_display_(/*60.22*/if(env.resource("public/images/productImages/" + e.getId + "thumb.jpg").isDefined)/*60.104*/ {_display_(Seq[Any](format.raw/*60.106*/("""
                        """),format.raw/*61.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*61.69*/(e.getId + "thumb.jpg")),format.raw/*61.92*/(""""/></td>
                    """)))}/*62.23*/else/*62.28*/{_display_(Seq[Any](format.raw/*62.29*/("""
                        """),format.raw/*63.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*64.22*/("""
                  """),format.raw/*65.19*/("""<td>"""),_display_(/*65.24*/e/*65.25*/.getId),format.raw/*65.31*/("""</td>
                  <td>"""),_display_(/*66.24*/e/*66.25*/.getName),format.raw/*66.33*/("""</td>
                  <td>"""),_display_(/*67.24*/e/*67.25*/.getJobRole),format.raw/*67.36*/("""</td>
                  <td>"""),_display_(/*68.24*/e/*68.25*/.getAddress().getStreet1),format.raw/*68.49*/("""</td>
                  <td>"""),_display_(/*69.24*/e/*69.25*/.getAddress().getStreet2),format.raw/*69.49*/("""</td>
                  <td>"""),_display_(/*70.24*/e/*70.25*/.getAddress().getTown),format.raw/*70.46*/("""</td>
                  <td>"""),_display_(/*71.24*/e/*71.25*/.getAddress().getPostCode),format.raw/*71.50*/("""</td>
                  <td>"""),_display_(/*72.24*/e/*72.25*/.getDepartment),format.raw/*72.39*/("""</td>
                  <td>"""),_display_(/*73.24*/e/*73.25*/.getEmail),format.raw/*73.34*/("""</td>
                  <td>"""),_display_(/*74.24*/e/*74.25*/.getDateOfBirthString),format.raw/*74.46*/("""</td>

                  """),_display_(/*76.20*/if((user != null) && ("manager".equals(user.getRole())))/*76.76*/ {_display_(Seq[Any](format.raw/*76.78*/("""
                  """),format.raw/*77.19*/("""<!-- Update button -->

			    <td>
					<a href=""""),_display_(/*80.16*/routes/*80.22*/.HomeController.updateEmployee(e.getEmail)),format.raw/*80.64*/("""" class="button-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
                        </td> 
                  <!-- Delete button -->

				<td>
					<a href=""""),_display_(/*87.16*/routes/*87.22*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*87.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
                </td>
                  """)))}),format.raw/*91.20*/(""" 

                """)))}),format.raw/*93.18*/("""
               """),format.raw/*94.16*/("""</tr>
            """)))}),format.raw/*95.14*/("""
        
        """),format.raw/*97.9*/("""</tbody>
    </table>
    """),_display_(/*99.6*/if((user != null) && ("manager".equals(user.getRole())))/*99.62*/ {_display_(Seq[Any](format.raw/*99.64*/("""
    """),format.raw/*100.5*/("""<p>
        <a href=""""),_display_(/*101.19*/routes/*101.25*/.HomeController.usersEmployees()),format.raw/*101.57*/("""">
            <button class="btn btn-primary">Manage Employees</button>
        </a>
    </p>
    """)))}),format.raw/*105.6*/("""
"""),format.raw/*106.1*/("""</div>
 """))
      }
    }
  }

  def render(employees:List[models.users.Employee],projects:List[models.project.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.users.Employee],List[models.project.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 19:48:40 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/SDevCA1JamesAndStephen/SDevCA1JamesAndStephen/Employee System - Latest Copy/app/views/projects.scala.html
                  HASH: bf4a14bbe9229de216fc04d5768a81646895dcd0
                  MATRIX: 1040->1|1265->134|1294->155|1332->156|1364->163|1429->220|1468->222|1503->231|1556->268|1568->273|1606->274|1641->283|1710->323|1745->399|1774->402|1815->434|1855->436|1885->439|1949->477|1963->482|1999->497|2029->500|2067->508|2099->513|2243->630|2258->636|2306->663|2389->719|2421->735|2461->737|2506->754|2545->766|2560->772|2616->807|2681->844|2692->845|2722->853|2771->874|2819->895|2829->896|2868->914|2942->957|2978->966|3060->1021|3126->1078|3166->1080|3207->1093|3339->1207|3352->1212|3391->1213|3432->1226|3560->1323|3596->1332|4159->1920|4200->1934|4233->1951|4273->1953|4317->1969|4370->1995|4462->2077|4503->2079|4556->2104|4627->2148|4671->2171|4720->2202|4733->2207|4772->2208|4825->2233|4940->2317|4987->2336|5019->2341|5029->2342|5056->2348|5112->2377|5122->2378|5151->2386|5207->2415|5217->2416|5249->2427|5305->2456|5315->2457|5360->2481|5416->2510|5426->2511|5471->2535|5527->2564|5537->2565|5579->2586|5635->2615|5645->2616|5691->2641|5747->2670|5757->2671|5792->2685|5848->2714|5858->2715|5888->2724|5944->2753|5954->2754|5996->2775|6049->2801|6114->2857|6154->2859|6201->2878|6279->2929|6294->2935|6357->2977|6578->3171|6593->3177|6656->3219|6855->3387|6906->3407|6950->3423|7000->3442|7045->3460|7098->3487|7163->3543|7203->3545|7236->3550|7286->3572|7302->3578|7356->3610|7487->3710|7516->3711
                  LINES: 28->1|34->3|34->3|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|57->26|58->27|63->32|63->32|63->32|64->33|65->34|65->34|65->34|66->35|67->36|68->37|88->57|89->58|89->58|89->58|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|107->76|107->76|107->76|108->77|111->80|111->80|111->80|118->87|118->87|118->87|122->91|124->93|125->94|126->95|128->97|130->99|130->99|130->99|131->100|132->101|132->101|132->101|136->105|137->106
                  -- GENERATED --
              */
          