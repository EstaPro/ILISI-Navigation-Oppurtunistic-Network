
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import b3.inline.fieldConstructor

object changePassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[scala.Tuple2[String, String]],models.User,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(changePasswordForm: Form[(String, String)], user: models.User)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*10.64*/("""

"""),_display_(/*12.2*/main(messages("change.password.title"), Some(user))/*12.53*/ {_display_(Seq[Any](format.raw/*12.55*/("""
    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*14.18*/messages("change.password")),format.raw/*14.45*/("""</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.ChangePasswordController.submit, 'autocomplete -> "off")/*15.106*/ {_display_(Seq[Any](format.raw/*15.108*/("""
            """),format.raw/*16.13*/("""<p class="info">"""),_display_(/*16.30*/messages("strong.password.info")),format.raw/*16.62*/("""</p>
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),_display_(/*18.14*/b3/*18.16*/.password(changePasswordForm("current-password"), '_hiddenLabel -> messages("current.password"), 'placeholder -> messages("current.password"), 'class -> "form-control input-lg")),format.raw/*18.193*/("""
            """),_display_(/*19.14*/passwordStrength(changePasswordForm("new-password"), '_hiddenLabel -> messages("new.password"), 'placeholder -> messages("new.password"), 'class -> "form-control input-lg")),format.raw/*19.186*/("""
            """),format.raw/*20.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*22.112*/messages("change")),format.raw/*22.130*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</fieldset>
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(changePasswordForm:Form[scala.Tuple2[String, String]],user:models.User,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(changePasswordForm,user)(request,messages,webJarsUtil,assets)

  def f:((Form[scala.Tuple2[String, String]],models.User) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (changePasswordForm,user) => (request,messages,webJarsUtil,assets) => apply(changePasswordForm,user)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 03:16:51 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/changePassword.scala.html
                  HASH: 5fc62a19190645ba01265595fbe0812988fd3bee
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|656->200|908->367|941->391|1008->365|1037->429|1066->432|1126->483|1166->485|1198->490|1286->551|1334->578|1380->597|1395->603|1495->693|1536->695|1577->708|1621->725|1674->757|1719->775|1734->781|1770->796|1811->810|1822->812|2021->989|2062->1003|2256->1175|2297->1188|2483->1346|2523->1364|2615->1425|2647->1430|2690->1443
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|18->10|18->10|19->9|20->10|22->12|22->12|22->12|23->13|24->14|24->14|25->15|25->15|25->15|25->15|26->16|26->16|26->16|27->17|27->17|27->17|28->18|28->18|28->18|29->19|29->19|30->20|32->22|32->22|35->25|36->26|37->27
                  -- GENERATED --
              */
          