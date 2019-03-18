
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Employee],Form[models.users.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empForm: Form[models.users.Employee], addressForm: Form[models.users.Address],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Employee",user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new Employee</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addEmployeeSubmit, 'class -> "form-horizontal", 'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*12.158*/ {_display_(Seq[Any](format.raw/*12.160*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
             """),_display_(/*16.15*/inputText(empForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.88*/("""
             """),_display_(/*17.15*/inputText(empForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.86*/("""
             """),_display_(/*18.15*/inputDate(empForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*18.122*/("""
             """),_display_(/*19.15*/inputText(empForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.94*/("""
             """),_display_(/*20.15*/select(
                empForm("department.depId"),
                options(department.Department.options),
                '_label -> "Department", '_default -> "-- Choose a department --", 
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*25.14*/("""         
             """),_display_(/*26.15*/inputText(empForm("jobRole"), '_label -> "Position", 'class -> "form-control")),format.raw/*26.93*/("""
             
		"""),format.raw/*28.3*/("""<p><strong>Assign Projects</strong></p>
            """),_display_(/*29.14*/for((value, name) <- project.Project.options) yield /*29.59*/ {_display_(Seq[Any](format.raw/*29.61*/("""
                """),format.raw/*30.17*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*30.68*/value),format.raw/*30.73*/(""""  
                    """),_display_(/*31.22*/if(empForm("id").getValue.isPresent && empForm("id").getValue.get != "")/*31.94*/ {_display_(Seq[Any](format.raw/*31.96*/(""" 
                        """),_display_(/*32.26*/if(project.Project.inProject(value.toLong, empForm("id").getValue.get.toLong))/*32.104*/ {_display_(Seq[Any](format.raw/*32.106*/("""
                            """),format.raw/*33.29*/("""checked
                        """)))}),format.raw/*34.26*/("""
                    """)))}),format.raw/*35.22*/(""" 
                """),format.raw/*36.17*/("""/> """),_display_(/*36.21*/name),format.raw/*36.25*/(""" """),format.raw/*36.26*/("""</br>
            """)))}),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""</p>

	
"""),_display_(/*41.2*/inputText(addressForm("street1"), '_label -> "Street 1 Address", 'class -> "form-control")),format.raw/*41.92*/("""
             """),_display_(/*42.15*/inputText(addressForm("street2"), '_label -> "Street 2 Address", 'class -> "form-control")),format.raw/*42.105*/("""
             """),_display_(/*43.15*/inputText(addressForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*43.90*/("""
             """),_display_(/*44.15*/inputText(addressForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*44.98*/("""

             """),_display_(/*46.15*/inputText(empForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*46.105*/("""
             """),_display_(/*47.15*/inputText(addressForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*47.82*/("""



             """),format.raw/*51.14*/("""<label>Image Upload</label>
             <input class="btn-sm btn-default" type="file" name="upload"> 

            
            <!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            
            """),_display_(/*60.14*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*60.108*/ {_display_(Seq[Any](format.raw/*60.110*/("""
            """),format.raw/*61.13*/("""<div class="actions">
                <input type="submit" value="Add / Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*63.27*/routes/*63.33*/.HomeController.usersEmployees()),format.raw/*63.65*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*67.10*/(""" """),format.raw/*68.24*/("""
""")))}),format.raw/*69.2*/(""" """),format.raw/*69.20*/("""
""")))}))
      }
    }
  }

  def render(empForm:Form[models.users.Employee],addressForm:Form[models.users.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(empForm,addressForm,user)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (empForm,addressForm,user) => apply(empForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 17:48:48 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/SDevCA1JamesAndStephen/SDevCA1JamesAndStephen/Employee System - Latest Copy/app/views/addEmployee.scala.html
                  HASH: 7abc221033465388ed738a27977d43c9e807a122
                  MATRIX: 1020->1|1196->108|1240->105|1268->124|1295->126|1328->151|1366->152|1397->157|1720->454|1882->606|1923->608|1960->645|1997->744|2034->754|2047->758|2078->768|2120->783|2214->856|2256->871|2348->942|2390->957|2519->1064|2561->1079|2661->1158|2703->1173|2999->1448|3050->1472|3149->1550|3193->1567|3273->1620|3334->1665|3374->1667|3419->1684|3497->1735|3523->1740|3575->1765|3656->1837|3696->1839|3750->1866|3838->1944|3879->1946|3936->1975|4000->2008|4053->2030|4099->2048|4130->2052|4155->2056|4184->2057|4234->2076|4275->2089|4310->2098|4421->2188|4463->2203|4575->2293|4617->2308|4713->2383|4755->2398|4859->2481|4902->2497|5014->2587|5056->2602|5144->2669|5189->2686|5590->3060|5694->3154|5735->3156|5776->3169|5943->3309|5958->3315|6011->3347|6176->3481|6205->3560|6237->3562|6266->3580
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|56->25|57->26|57->26|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|66->35|67->36|67->36|67->36|67->36|68->37|69->38|72->41|72->41|73->42|73->42|74->43|74->43|75->44|75->44|77->46|77->46|78->47|78->47|82->51|91->60|91->60|91->60|92->61|94->63|94->63|94->63|98->67|98->68|99->69|99->69
                  -- GENERATED --
              */
          