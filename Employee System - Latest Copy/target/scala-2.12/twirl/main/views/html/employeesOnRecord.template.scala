
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

object employeesOnRecord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.department.Department],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],departments: List[models.department.Department], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("On Staff", user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h3>Employees</h3>


    """),format.raw/*6.74*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""




    """),format.raw/*16.5*/("""<div class="col-sm-6">
		<h4>Departments</h4>
	        <div class="list-group">
                <a href = """"),_display_(/*19.29*/routes/*19.35*/.HomeController.employeesOnRecord(0)),format.raw/*19.71*/("""" class="list-group-item">All Departments</a>
		        """),_display_(/*20.12*/for(c<-departments) yield /*20.31*/ {_display_(Seq[Any](format.raw/*20.33*/("""
			        """),format.raw/*21.12*/("""<a href = """"),_display_(/*21.24*/routes/*21.30*/.HomeController.employeesOnRecord(c.getId())),format.raw/*21.74*/("""" class="list-group-item catheight">"""),_display_(/*21.111*/c/*21.112*/.getName),format.raw/*21.120*/("""
                        """),format.raw/*22.25*/("""<span class="badge">"""),_display_(/*22.46*/c/*22.47*/.getEmployees.size),format.raw/*22.65*/("""</span> 
                    </a>
			    """)))}),format.raw/*24.9*/("""
            """),format.raw/*25.13*/("""</div>
    </div>

    <div class="col-sm-9">
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Department ID</th>
            <th>Department</th>
            <!-- <th>Start Date</th> -->
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*43.66*/("""
            """),_display_(/*44.14*/for(i<-employees) yield /*44.31*/ {_display_(Seq[Any](format.raw/*44.33*/("""
               """),format.raw/*45.16*/("""<tr>
                   """),_display_(/*46.21*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*46.103*/{_display_(Seq[Any](format.raw/*46.104*/("""
                       """),format.raw/*47.24*/("""<td><img src="/assets/images/productImages/"""),_display_(/*47.68*/(i.getId + "thumb.jpg")),format.raw/*47.91*/(""""/></td>
                   """)))}/*48.22*/else/*48.26*/{_display_(Seq[Any](format.raw/*48.27*/("""
                       """),format.raw/*49.24*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                   """)))}),format.raw/*50.21*/("""
                  """),format.raw/*51.19*/("""<td>"""),_display_(/*51.24*/i/*51.25*/.getName),format.raw/*51.33*/("""</td>
                  <td>"""),_display_(/*52.24*/i/*52.25*/.getDepartment.getId),format.raw/*52.45*/("""</td>
                  <td>"""),_display_(/*53.24*/i/*53.25*/.getDepartment.getName),format.raw/*53.47*/("""</td>
                
                  <!-- Update button -->
                """),_display_(/*56.18*/if((user != null) && ("admin".equals(user.getRole())))/*56.72*/{_display_(Seq[Any](format.raw/*56.73*/("""
					"""),format.raw/*57.6*/("""<td>
						<a href=""""),_display_(/*58.17*/routes/*58.23*/.HomeController.updateEmployee(i.getEmail)),format.raw/*58.65*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-pencil"></span>
						</a>
                </td>
                  <!-- Delete button -->
				<td>
					<a href=""""),_display_(/*64.16*/routes/*64.22*/.HomeController.deleteEmployee(i.getEmail)),format.raw/*64.64*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
                </td>
                """)))}),format.raw/*68.18*/("""
               """),format.raw/*69.16*/("""</tr>
            """)))}),format.raw/*70.14*/("""
        
        """),format.raw/*72.9*/("""</tbody>
    </table>
    """),_display_(/*74.6*/if((user != null) && ("admin".equals(user.getRole())))/*74.60*/{_display_(Seq[Any](format.raw/*74.61*/("""
    """),format.raw/*75.5*/("""<p>
        <a href=""""),_display_(/*76.19*/routes/*76.25*/.HomeController.addEmployee()),format.raw/*76.54*/("""">
            <button class="btn btn-primary">Add an Employee</button>
        </a>
    </p>
    """)))}),format.raw/*80.6*/("""
"""),format.raw/*81.1*/("""</div>
""")))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],departments:List[models.department.Department],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,departments,user,env)

  def f:((List[models.users.Employee],List[models.department.Department],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,departments,user,env) => apply(employees,departments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 19:15:07 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/SDevCA1JamesAndStephen/SDevCA1JamesAndStephen/Employee System - Latest Copy/app/views/employeesOnRecord.scala.html
                  HASH: 6ee932db15c4851ecb01ee37e5dd1c0c5c5e938d
                  MATRIX: 1055->1|1289->143|1319->165|1357->166|1388->171|1440->265|1468->268|1508->300|1547->302|1576->305|1639->343|1652->348|1687->363|1717->366|1755->374|1791->383|1926->491|1941->497|1998->533|2082->590|2117->609|2157->611|2197->623|2236->635|2251->641|2316->685|2381->722|2392->723|2422->731|2475->756|2523->777|2533->778|2572->796|2644->838|2685->851|3156->1347|3197->1361|3230->1378|3270->1380|3314->1396|3366->1421|3458->1503|3498->1504|3550->1528|3621->1572|3665->1595|3713->1625|3726->1629|3765->1630|3817->1654|3931->1737|3978->1756|4010->1761|4020->1762|4049->1770|4105->1799|4115->1800|4156->1820|4212->1849|4222->1850|4265->1872|4373->1953|4436->2007|4475->2008|4508->2014|4556->2035|4571->2041|4634->2083|4847->2269|4862->2275|4925->2317|5122->2483|5166->2499|5216->2518|5261->2536|5314->2563|5377->2617|5416->2618|5448->2623|5497->2645|5512->2651|5562->2680|5691->2779|5719->2780
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|55->24|56->25|74->43|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|81->50|82->51|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|87->56|87->56|87->56|88->57|89->58|89->58|89->58|95->64|95->64|95->64|99->68|100->69|101->70|103->72|105->74|105->74|105->74|106->75|107->76|107->76|107->76|111->80|112->81
                  -- GENERATED --
              */
          