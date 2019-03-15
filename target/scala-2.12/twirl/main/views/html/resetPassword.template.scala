
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import java.util.UUID

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[String],UUID,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(form: Form[String], token: UUID)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.1*/("""
"""),_display_(/*10.2*/main(messages("reset.password.title"))/*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
    """),format.raw/*11.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*12.18*/messages("reset.password")),format.raw/*12.44*/("""</legend>
        """),_display_(/*13.10*/helper/*13.16*/.form(action = controllers.routes.ResetPasswordController.submit(token), 'autocomplete -> "off")/*13.112*/ {_display_(Seq[Any](format.raw/*13.114*/("""
            """),format.raw/*14.13*/("""<p class="info">"""),_display_(/*14.30*/messages("strong.password.info")),format.raw/*14.62*/("""</p>
            """),_display_(/*15.14*/helper/*15.20*/.CSRF.formField),format.raw/*15.35*/("""
            """),_display_(/*16.14*/passwordStrength(form("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*16.160*/("""
            """),format.raw/*17.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*19.112*/messages("reset")),format.raw/*19.129*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</fieldset>
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(form:Form[String],token:UUID,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(form,token)(request,messages,webJarsUtil,assets)

  def f:((Form[String],UUID) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (form,token) => (request,messages,webJarsUtil,assets) => apply(form,token)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 03:16:52 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/resetPassword.scala.html
                  HASH: 3719c0afe67524296fc855b82b75664e6961eee7
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|614->188|842->323|870->325|917->363|957->365|989->370|1077->431|1124->457|1170->476|1185->482|1291->578|1332->580|1373->593|1417->610|1470->642|1515->660|1530->666|1566->681|1607->695|1775->841|1816->854|2002->1012|2041->1029|2133->1090|2165->1095|2208->1108
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|19->9|20->10|20->10|20->10|21->11|22->12|22->12|23->13|23->13|23->13|23->13|24->14|24->14|24->14|25->15|25->15|25->15|26->16|26->16|27->17|29->19|29->19|32->22|33->23|34->24
                  -- GENERATED --
              */
          