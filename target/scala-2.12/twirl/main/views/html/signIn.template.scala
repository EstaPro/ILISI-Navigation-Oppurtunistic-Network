
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*7.2*/import forms.SignInForm.Data

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*11.2*/implicitFieldConstructor/*11.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*10.1*/("""
"""),format.raw/*11.64*/("""

"""),_display_(/*13.2*/main(messages("sign.in.title"))/*13.33*/ {_display_(Seq[Any](format.raw/*13.35*/("""
    """),format.raw/*14.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*15.18*/messages("sign.in.credentials")),format.raw/*15.49*/("""</legend>
        """),_display_(/*16.10*/helper/*16.16*/.form(action = controllers.routes.SignInController.submit())/*16.76*/ {_display_(Seq[Any](format.raw/*16.78*/("""
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),_display_(/*18.14*/b3/*18.16*/.email(signInForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*18.149*/("""
            """),_display_(/*19.14*/b3/*19.16*/.password(signInForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*19.161*/("""
            """),_display_(/*20.14*/b3/*20.16*/.checkbox(signInForm("rememberMe"), '_text -> messages("remember.me"), 'checked -> true)),format.raw/*20.104*/("""
            """),format.raw/*21.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*23.112*/messages("sign.in")),format.raw/*23.131*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*26.10*/("""

        """),format.raw/*28.9*/("""<div>
            <p class="not-a-member">"""),_display_(/*29.38*/messages("not.a.member")),format.raw/*29.62*/(""" """),format.raw/*29.63*/("""<a href=""""),_display_(/*29.73*/controllers/*29.84*/.routes.SignUpController.view),format.raw/*29.113*/("""">"""),_display_(/*29.116*/messages("sign.up.now")),format.raw/*29.139*/("""</a> | <a href=""""),_display_(/*29.156*/controllers/*29.167*/.routes.ForgotPasswordController.view()),format.raw/*29.206*/("""" title=""""),_display_(/*29.216*/messages("forgot.your.password")),format.raw/*29.248*/("""">"""),_display_(/*29.251*/messages("forgot.your.password")),format.raw/*29.283*/("""</a></p>
        </div>

        """),_display_(/*32.10*/if(socialProviders.providers.nonEmpty)/*32.48*/ {_display_(Seq[Any](format.raw/*32.50*/("""
            """),format.raw/*33.13*/("""<div class="social-providers">
                <p>"""),_display_(/*34.21*/messages("or.use.social")),format.raw/*34.46*/("""</p>
                <div>
                """),_display_(/*36.18*/for(p <- socialProviders.providers) yield /*36.53*/ {_display_(Seq[Any](format.raw/*36.55*/("""
                    """),format.raw/*37.21*/("""<a href=""""),_display_(/*37.31*/controllers/*37.42*/.routes.SocialAuthController.authenticate(p.id)),format.raw/*37.89*/("""" class="provider """),_display_(/*37.108*/p/*37.109*/.id),format.raw/*37.112*/("""" title=""""),_display_(/*37.122*/messages(p.id)),format.raw/*37.136*/(""""><img src=""""),_display_(/*37.149*/assets/*37.155*/.path(s"images/providers/${p.id}.png")),format.raw/*37.193*/("""" width="64px" height="64px" alt=""""),_display_(/*37.228*/messages(p.id)),format.raw/*37.242*/(""""></a>
                """)))}),format.raw/*38.18*/("""
                """),format.raw/*39.17*/("""</div>
            </div>
        """)))}),format.raw/*41.10*/("""

    """),format.raw/*43.5*/("""</fieldset>
""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(signInForm:Form[Data],socialProviders:SocialProviderRegistry,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def f:((Form[Data],SocialProviderRegistry) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages,webJarsUtil,assets) => apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 03:16:52 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/signIn.scala.html
                  HASH: 0dfbbeb0eb7d6d5e2cfaeba08d6499f02bb11b0e
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|300->237|709->268|963->437|996->461|1064->435|1093->499|1122->502|1162->533|1202->535|1234->540|1322->601|1374->632|1420->651|1435->657|1504->717|1544->719|1585->733|1600->739|1636->754|1677->768|1688->770|1843->903|1884->917|1895->919|2062->1064|2103->1078|2114->1080|2224->1168|2265->1181|2451->1339|2492->1358|2584->1419|2621->1429|2691->1472|2736->1496|2765->1497|2802->1507|2822->1518|2873->1547|2904->1550|2949->1573|2994->1590|3015->1601|3076->1640|3114->1650|3168->1682|3199->1685|3253->1717|3314->1751|3361->1789|3401->1791|3442->1804|3520->1855|3566->1880|3637->1924|3688->1959|3728->1961|3777->1982|3814->1992|3834->2003|3902->2050|3949->2069|3960->2070|3985->2073|4023->2083|4059->2097|4100->2110|4116->2116|4176->2154|4239->2189|4275->2203|4330->2227|4375->2244|4441->2279|4474->2285|4517->2298
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|15->9|19->11|19->11|20->10|21->11|23->13|23->13|23->13|24->14|25->15|25->15|26->16|26->16|26->16|26->16|27->17|27->17|27->17|28->18|28->18|28->18|29->19|29->19|29->19|30->20|30->20|30->20|31->21|33->23|33->23|36->26|38->28|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|39->29|42->32|42->32|42->32|43->33|44->34|44->34|46->36|46->36|46->36|47->37|47->37|47->37|47->37|47->37|47->37|47->37|47->37|47->37|47->37|47->37|47->37|47->37|47->37|48->38|49->39|51->41|53->43|54->44
                  -- GENERATED --
              */
          