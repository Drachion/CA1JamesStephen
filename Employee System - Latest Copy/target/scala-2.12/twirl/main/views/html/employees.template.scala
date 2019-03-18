
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.department.Department],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],departments: List[models.department.Department], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""

    """),_display_(/*4.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*4.100*/ {_display_(Seq[Any](format.raw/*4.102*/("""
    """),format.raw/*5.5*/("""<h1>Employee Management</h1>
    """)))}/*6.7*/else/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<h1>Employee List</h1>
    """)))}),format.raw/*8.6*/("""

    """),format.raw/*10.71*/("""
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
		"""),format.raw/*12.3*/("""<div class="alert alert-success">
			"""),_display_(/*13.5*/flash/*13.10*/.get("success")),format.raw/*13.25*/("""
		"""),format.raw/*14.3*/("""</div>
""")))}),format.raw/*15.2*/("""

    """),format.raw/*17.5*/("""<div class="col-sm-12">
        <h4>Here are all the current employees on the system. </h4>



        <div class="col-sm-6">
            <h4>Departments</h4>
                <div class="list-group">
                    <a href = """"),_display_(/*25.33*/routes/*25.39*/.HomeController.employeesOnRecord()),format.raw/*25.74*/("""" class="list-group-item">All Departments</a>
                    """),_display_(/*26.22*/for(c<-departments) yield /*26.41*/ {_display_(Seq[Any](format.raw/*26.43*/("""
                        """),format.raw/*27.25*/("""<a href = """"),_display_(/*27.37*/routes/*27.43*/.HomeController.employeesOnRecord(c.getId())),format.raw/*27.87*/("""" class="list-group-item catheight">"""),_display_(/*27.124*/c/*27.125*/.getName),format.raw/*27.133*/("""
                            """),format.raw/*28.29*/("""<span class="badge">"""),_display_(/*28.50*/c/*28.51*/.getEmployees.size),format.raw/*28.69*/("""</span> 
                        </a>
                    """)))}),format.raw/*30.22*/("""
                """),format.raw/*31.17*/("""</div>
        </div>







        <table class="table table-bordered table-hover table-condensed">
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
                <th>Department ID</th>
                <th>Department(Won't save!)</th>
                <th>Email</th>
                <th>DOB</th>

            <!-- DO we also need to output their address here?  -->
        </tr>
        </thead>
        <tbody>
        <!-- Managers data -->
       
            """),format.raw/*63.62*/("""
            """),_display_(/*64.14*/for(e<-employees) yield /*64.31*/ {_display_(Seq[Any](format.raw/*64.33*/("""
               """),format.raw/*65.16*/("""<tr>
                    """),_display_(/*66.22*/if(env.resource("public/images/productImages/" + e.getId + "thumb.jpg").isDefined)/*66.104*/ {_display_(Seq[Any](format.raw/*66.106*/("""
                        """),format.raw/*67.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*67.69*/(e.getId + "thumb.jpg")),format.raw/*67.92*/(""""/></td>
                    """)))}/*68.23*/else/*68.28*/{_display_(Seq[Any](format.raw/*68.29*/("""
                        """),format.raw/*69.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*70.2*/("""
                    """),format.raw/*71.21*/("""<td>"""),_display_(/*71.26*/e/*71.27*/.getId),format.raw/*71.33*/("""</td>
                    <td>"""),_display_(/*72.26*/e/*72.27*/.getName),format.raw/*72.35*/("""</td>
                    <td>"""),_display_(/*73.26*/e/*73.27*/.getJobRole),format.raw/*73.38*/("""</td>
                    <td>"""),_display_(/*74.26*/e/*74.27*/.getAddress().getStreet1),format.raw/*74.51*/("""</td>
                    <td>"""),_display_(/*75.26*/e/*75.27*/.getAddress().getStreet2),format.raw/*75.51*/("""</td>
                    <td>"""),_display_(/*76.26*/e/*76.27*/.getAddress().getTown),format.raw/*76.48*/("""</td>
                    <td>"""),_display_(/*77.26*/e/*77.27*/.getAddress().getPostCode),format.raw/*77.52*/("""</td>
                    <td>"""),_display_(/*78.26*/e/*78.27*/.getDepartment.getId),format.raw/*78.47*/("""</td>
                    <td>"""),_display_(/*79.26*/e/*79.27*/.getDepartment().getName),format.raw/*79.51*/("""</td>
                    <td>"""),_display_(/*80.26*/e/*80.27*/.getEmail),format.raw/*80.36*/("""</td>
                    <td>"""),_display_(/*81.26*/e/*81.27*/.getDateOfBirthString),format.raw/*81.48*/("""</td>

                    """),_display_(/*83.22*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*83.116*/ {_display_(Seq[Any](format.raw/*83.118*/("""
                  """),format.raw/*84.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*86.18*/routes/*86.24*/.HomeController.updateEmployee(e.getEmail)),format.raw/*86.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*92.18*/routes/*92.24*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*92.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*97.14*/(""" """),format.raw/*97.57*/("""
            
        """)))}),format.raw/*99.10*/("""
        
        """),format.raw/*101.9*/("""</tbody>
    </table>

    """),_display_(/*104.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*104.100*/ {_display_(Seq[Any](format.raw/*104.102*/("""
    """),format.raw/*105.5*/("""<p>
        <a href=""""),_display_(/*106.19*/routes/*106.25*/.HomeController.addEmployee()),format.raw/*106.54*/("""">
            <button class="btn btn-primary">Add a new Employee</button>
        </a>
    </p>
    """)))}),format.raw/*110.6*/("""
"""),format.raw/*111.1*/("""</div>
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
                  DATE: Mon Mar 18 19:20:29 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/SDevCA1JamesAndStephen/SDevCA1JamesAndStephen/Employee System - Latest Copy/app/views/employees.scala.html
                  HASH: ae33156aa3833947816efc2e40e992cfc53cbe84
                  MATRIX: 1047->1|1281->143|1311->165|1349->166|1381->173|1484->267|1524->269|1555->274|1606->309|1618->314|1656->315|1687->320|1744->348|1778->420|1807->423|1848->455|1888->457|1918->460|1982->498|1996->503|2032->518|2062->521|2100->529|2133->535|2392->767|2407->773|2463->808|2557->875|2592->894|2632->896|2685->921|2724->933|2739->939|2804->983|2869->1020|2880->1021|2910->1029|2967->1058|3015->1079|3025->1080|3064->1098|3154->1157|3199->1174|3962->1958|4003->1972|4036->1989|4076->1991|4120->2007|4173->2033|4265->2115|4306->2117|4359->2142|4430->2186|4474->2209|4523->2240|4536->2245|4575->2246|4628->2271|4722->2335|4771->2356|4803->2361|4813->2362|4840->2368|4898->2399|4908->2400|4937->2408|4995->2439|5005->2440|5037->2451|5095->2482|5105->2483|5150->2507|5208->2538|5218->2539|5263->2563|5321->2594|5331->2595|5373->2616|5431->2647|5441->2648|5487->2673|5545->2704|5555->2705|5596->2725|5654->2756|5664->2757|5709->2781|5767->2812|5777->2813|5807->2822|5865->2853|5875->2854|5917->2875|5972->2903|6076->2997|6117->2999|6164->3018|6242->3069|6257->3075|6320->3117|6547->3317|6562->3323|6625->3365|6851->3560|6880->3603|6934->3626|6980->3644|7035->3672|7140->3766|7182->3768|7215->3773|7265->3795|7281->3801|7332->3830|7465->3932|7494->3933
                  LINES: 28->1|33->2|33->2|33->2|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|61->30|62->31|94->63|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|114->83|114->83|114->83|115->84|117->86|117->86|117->86|123->92|123->92|123->92|128->97|128->97|130->99|132->101|135->104|135->104|135->104|136->105|137->106|137->106|137->106|141->110|142->111
                  -- GENERATED --
              */
          