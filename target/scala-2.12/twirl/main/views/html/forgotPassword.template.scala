
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder

object forgotPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[String],RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(forgotPasswordForm: Form[String])(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*9.2*/implicitFieldConstructor/*9.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.64*/("""

"""),_display_(/*11.2*/main(messages("forgot.password.title"))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
    """),format.raw/*12.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*13.18*/messages("forgot.password")),format.raw/*13.45*/("""</legend>
        """),_display_(/*14.10*/helper/*14.16*/.form(action = controllers.routes.ForgotPasswordController.submit(), 'autocomplete -> "off")/*14.108*/ {_display_(Seq[Any](format.raw/*14.110*/("""
            """),format.raw/*15.13*/("""<p class="info">"""),_display_(/*15.30*/messages("forgot.password.info")),format.raw/*15.62*/("""</p>
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),_display_(/*17.14*/b3/*17.16*/.text(forgotPasswordForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*17.156*/("""
            """),format.raw/*18.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*20.112*/messages("send")),format.raw/*20.128*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</fieldset>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(forgotPasswordForm:Form[String],request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(forgotPasswordForm)(request,messages,webJarsUtil,assets)

  def f:((Form[String]) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (forgotPasswordForm) => (request,messages,webJarsUtil,assets) => apply(forgotPasswordForm)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 03:16:52 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/forgotPassword.scala.html
                  HASH: 9043a3ab7814c96d3588685adc7f0109f7f6e55a
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|581->165|803->303|835->327|902->301|930->365|959->368|1007->407|1047->409|1079->414|1167->475|1215->502|1261->521|1276->527|1378->619|1419->621|1460->634|1504->651|1557->683|1602->701|1617->707|1653->722|1694->736|1705->738|1867->878|1908->891|2094->1049|2132->1065|2224->1126|2256->1131|2299->1144
                  LINES: 4->1|5->2|6->3|7->4|8->5|13->7|17->9|17->9|18->8|19->9|21->11|21->11|21->11|22->12|23->13|23->13|24->14|24->14|24->14|24->14|25->15|25->15|25->15|26->16|26->16|26->16|27->17|27->17|27->17|28->18|30->20|30->20|33->23|34->24|35->25
                  -- GENERATED --
              */
          