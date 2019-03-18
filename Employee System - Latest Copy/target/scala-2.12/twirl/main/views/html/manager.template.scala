
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

object manager extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Manager],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(managers: List[models.users.Manager],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Manager",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""

    """),_display_(/*4.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*4.100*/ {_display_(Seq[Any](format.raw/*4.102*/("""
    """),format.raw/*5.5*/("""<h1>Manager Management</h1>
    """)))}/*6.7*/else/*6.12*/{_display_(Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<h1>Manager List</h1>
    """)))}),format.raw/*8.6*/("""

    """),format.raw/*10.71*/("""
	"""),_display_(/*11.3*/if(flash.containsKey("success"))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
		"""),format.raw/*12.3*/("""<div class="alert alert-success">
			"""),_display_(/*13.5*/flash/*13.10*/.get("success")),format.raw/*13.25*/("""
		"""),format.raw/*14.3*/("""</div>
""")))}),format.raw/*15.2*/("""

    """),format.raw/*17.5*/("""<div class="col-sm-12">
        <h4>Here are all the current Managers on the system. </h4>

        <!-- """),_display_(/*20.15*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*20.109*/ {_display_(Seq[Any](format.raw/*20.111*/("""
            """),format.raw/*21.13*/("""<p>
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.HomeController.addManager()),format.raw/*22.61*/("""">
                    <button class="btn btn-primary">Add a new Manager</button>
                </a>
            </p>
        """)))}),format.raw/*26.10*/("""

        """),_display_(/*28.10*/if((user != null) && ("admin".equals(user.getRole())))/*28.64*/ {_display_(Seq[Any](format.raw/*28.66*/("""

            """),format.raw/*30.13*/("""<p>
                <a href=""""),_display_(/*31.27*/routes/*31.33*/.HomeController.addManager()),format.raw/*31.61*/("""">
                    <button class="btn btn-primary">Add a new Manager</button>
                </a>
            </p>

        """)))}),format.raw/*36.10*/(""" """),format.raw/*36.11*/("""-->


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
                <th>Department(Won't save)</th>
                <th>Email</th>
                <th>DOB</th>

            <!-- DO we also need to output their address here?  -->
        </tr>
        </thead>
        <tbody>
        <!-- Managers data -->
       
            """),format.raw/*61.62*/("""
            """),_display_(/*62.14*/for(m<-managers) yield /*62.30*/ {_display_(Seq[Any](format.raw/*62.32*/("""
               """),format.raw/*63.16*/("""<tr>
                    """),_display_(/*64.22*/if(env.resource("public/images/productImages/" + m.getId + "thumb.jpg").isDefined)/*64.104*/ {_display_(Seq[Any](format.raw/*64.106*/("""
                        """),format.raw/*65.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*65.69*/(m.getId + "thumb.jpg")),format.raw/*65.92*/(""""/></td>
                    """)))}/*66.23*/else/*66.28*/{_display_(Seq[Any](format.raw/*66.29*/("""
                        """),format.raw/*67.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*68.2*/("""
                    """),format.raw/*69.21*/("""<td>"""),_display_(/*69.26*/m/*69.27*/.getId),format.raw/*69.33*/("""</td>
                    <td>"""),_display_(/*70.26*/m/*70.27*/.getName),format.raw/*70.35*/("""</td>
                    <td>"""),_display_(/*71.26*/m/*71.27*/.getJobRole),format.raw/*71.38*/("""</td>
                    <td>"""),_display_(/*72.26*/m/*72.27*/.getAddress().getStreet1),format.raw/*72.51*/("""</td>
                    <td>"""),_display_(/*73.26*/m/*73.27*/.getAddress().getStreet2),format.raw/*73.51*/("""</td>
                    <td>"""),_display_(/*74.26*/m/*74.27*/.getAddress().getTown),format.raw/*74.48*/("""</td>
                    <td>"""),_display_(/*75.26*/m/*75.27*/.getAddress().getPostCode),format.raw/*75.52*/("""</td>
                    <td>"""),_display_(/*76.26*/m/*76.27*/.getDepartment()),format.raw/*76.43*/("""</td>
                    <td>"""),_display_(/*77.26*/m/*77.27*/.getEmail),format.raw/*77.36*/("""</td>
                    <td>"""),_display_(/*78.26*/m/*78.27*/.getDateOfBirthString),format.raw/*78.48*/("""</td>

                    """),_display_(/*80.22*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*80.116*/ {_display_(Seq[Any](format.raw/*80.118*/("""
                  """),format.raw/*81.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*83.18*/routes/*83.24*/.HomeController.updateManager(m.getEmail)),format.raw/*83.65*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*89.18*/routes/*89.24*/.HomeController.deleteManager(m.getEmail)),format.raw/*89.65*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*94.14*/(""" """),format.raw/*94.57*/("""
            
        """)))}),format.raw/*96.10*/("""
        
        """),format.raw/*98.9*/("""</tbody>
    </table>

    """),_display_(/*101.6*/if((user != null) && (("manager".equals(user.getRole())) || ("admin".equals(user.getRole()))))/*101.100*/ {_display_(Seq[Any](format.raw/*101.102*/("""
    """),format.raw/*102.5*/("""<p>
        <a href=""""),_display_(/*103.19*/routes/*103.25*/.HomeController.addManager()),format.raw/*103.53*/("""">
            <button class="btn btn-primary">Add a new Manager</button>
        </a>
    </p>
    """)))}),format.raw/*107.6*/("""
"""),format.raw/*108.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(managers:List[models.users.Manager],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(managers,user,env)

  def f:((List[models.users.Manager],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (managers,user,env) => apply(managers,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 17:41:57 GMT 2019
                  SOURCE: /home/wdd/Software-CA1/SDevCA1JamesAndStephen/SDevCA1JamesAndStephen/Employee System - Latest Copy/app/views/manager.scala.html
                  HASH: 6d3d37c9bf3d898f607670aaa39f6d909c0bd211
                  MATRIX: 1009->1|1192->92|1220->112|1258->113|1290->120|1393->214|1433->216|1464->221|1514->255|1526->260|1564->261|1595->266|1651->293|1685->365|1714->368|1755->400|1795->402|1825->405|1889->443|1903->448|1939->463|1969->466|2007->474|2040->480|2173->586|2277->680|2318->682|2359->695|2416->725|2431->731|2480->759|2640->888|2678->899|2741->953|2781->955|2823->969|2880->999|2895->1005|2944->1033|3105->1163|3134->1164|3834->1885|3875->1899|3907->1915|3947->1917|3991->1933|4044->1959|4136->2041|4177->2043|4230->2068|4301->2112|4345->2135|4394->2166|4407->2171|4446->2172|4499->2197|4593->2261|4642->2282|4674->2287|4684->2288|4711->2294|4769->2325|4779->2326|4808->2334|4866->2365|4876->2366|4908->2377|4966->2408|4976->2409|5021->2433|5079->2464|5089->2465|5134->2489|5192->2520|5202->2521|5244->2542|5302->2573|5312->2574|5358->2599|5416->2630|5426->2631|5463->2647|5521->2678|5531->2679|5561->2688|5619->2719|5629->2720|5671->2741|5726->2769|5830->2863|5871->2865|5918->2884|5996->2935|6011->2941|6073->2982|6300->3182|6315->3188|6377->3229|6603->3424|6632->3467|6686->3490|6731->3508|6786->3536|6891->3630|6933->3632|6966->3637|7016->3659|7032->3665|7082->3693|7214->3794|7243->3795
                  LINES: 28->1|33->2|33->2|33->2|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|51->20|51->20|51->20|52->21|53->22|53->22|53->22|57->26|59->28|59->28|59->28|61->30|62->31|62->31|62->31|67->36|67->36|92->61|93->62|93->62|93->62|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|111->80|111->80|111->80|112->81|114->83|114->83|114->83|120->89|120->89|120->89|125->94|125->94|127->96|129->98|132->101|132->101|132->101|133->102|134->103|134->103|134->103|138->107|139->108
                  -- GENERATED --
              */
          