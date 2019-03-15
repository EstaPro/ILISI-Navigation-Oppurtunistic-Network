
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import forms.SignUpForm.Data

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Data],RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(signUpForm: Form[Data])(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*10.64*/("""

"""),_display_(/*12.2*/main(messages("sign.up.title"))/*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""
    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*14.18*/messages("sign.up.account")),format.raw/*14.45*/("""</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.SignUpController.submit())/*15.76*/ {_display_(Seq[Any](format.raw/*15.78*/("""
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),_display_(/*17.14*/b3/*17.16*/.text(signUpForm("firstName"), '_hiddenLabel -> messages("first.name"), 'placeholder -> messages("first.name"), 'class -> "form-control input-lg")),format.raw/*17.162*/("""
            """),_display_(/*18.14*/b3/*18.16*/.text(signUpForm("lastName"), '_hiddenLabel -> messages("last.name"), 'placeholder -> messages("last.name"), 'class -> "form-control input-lg")),format.raw/*18.159*/("""
            """),_display_(/*19.14*/b3/*19.16*/.text(signUpForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*19.148*/("""
            """),_display_(/*20.14*/passwordStrength(signUpForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*20.166*/("""
            """),format.raw/*21.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*23.112*/messages("sign.up")),format.raw/*23.131*/("""</button>
                </div>
            </div>
            <div class="sign-in-now">
                <p>"""),_display_(/*27.21*/messages("already.a.member")),format.raw/*27.49*/(""" """),format.raw/*27.50*/("""<a href=""""),_display_(/*27.60*/controllers/*27.71*/.routes.SignInController.view),format.raw/*27.100*/("""">"""),_display_(/*27.103*/messages("sign.in.now")),format.raw/*27.126*/("""</a></p>
            </div>
        """)))}),format.raw/*29.10*/("""
    """),format.raw/*30.5*/("""</fieldset>
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(signUpForm:Form[Data],request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request,messages,webJarsUtil,assets)

  def f:((Form[Data]) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request,messages,webJarsUtil,assets) => apply(signUpForm)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 03:16:52 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/signUp.scala.html
                  HASH: daa3d55138ff31ee645a80ceaa2c64455f78799d
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|607->195|820->323|853->347|920->321|949->385|978->388|1018->419|1058->421|1090->426|1178->487|1226->514|1272->533|1287->539|1356->599|1396->601|1437->615|1452->621|1488->636|1529->650|1540->652|1708->798|1749->812|1760->814|1925->957|1966->971|1977->973|2131->1105|2172->1119|2346->1271|2387->1284|2573->1442|2614->1461|2751->1571|2800->1599|2829->1600|2866->1610|2886->1621|2937->1650|2968->1653|3013->1676|3081->1713|3113->1718|3156->1731
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|18->10|18->10|19->9|20->10|22->12|22->12|22->12|23->13|24->14|24->14|25->15|25->15|25->15|25->15|26->16|26->16|26->16|27->17|27->17|27->17|28->18|28->18|28->18|29->19|29->19|29->19|30->20|30->20|31->21|33->23|33->23|37->27|37->27|37->27|37->27|37->27|37->27|37->27|37->27|39->29|40->30|41->31
                  -- GENERATED --
              */
          