
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import play.twirl.api.Html
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Option[models.User],Html,RequestHeader,Messages,AssetsFinder,WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(title: String, user: Option[models.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, assets: AssetsFinder, webJarsUtil: WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/assets/*15.65*/.path("images/favicon.png")),format.raw/*15.92*/("""">
        <title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        """),_display_(/*19.10*/webJarsUtil/*19.21*/.locate("bootstrap.min.css").css()),format.raw/*19.55*/("""
        """),_display_(/*20.10*/webJarsUtil/*20.21*/.locate("bootstrap-theme.min.css").css()),format.raw/*20.61*/("""
        """),format.raw/*21.9*/("""<link rel="stylesheet" href=""""),_display_(/*21.39*/assets/*21.45*/.path("styles/main.css")),format.raw/*21.69*/("""">
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""),_display_(/*33.48*/messages("toggle.navigation")),format.raw/*33.77*/("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*38.52*/controllers/*38.63*/.routes.ApplicationController.index),format.raw/*38.98*/("""">Silhouette Seed Template</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""),_display_(/*42.39*/controllers/*42.50*/.routes.ApplicationController.index),format.raw/*42.85*/("""">"""),_display_(/*42.88*/messages("home")),format.raw/*42.104*/("""</a></li>
                        <li><a href="https://github.com/mohiva/play-silhouette-seed">GitHub</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*46.26*/user/*46.30*/.map/*46.34*/ { u =>_display_(Seq[Any](format.raw/*46.41*/("""
                            """),format.raw/*47.29*/("""<li><a href=""""),_display_(/*47.43*/controllers/*47.54*/.routes.ApplicationController.index),format.raw/*47.89*/("""">"""),_display_(/*47.92*/u/*47.93*/.name),format.raw/*47.98*/("""</a></li>
                            """),_display_(/*48.30*/if(u.loginInfo.providerID == com.mohiva.play.silhouette.impl.providers.CredentialsProvider.ID)/*48.124*/ {_display_(Seq[Any](format.raw/*48.126*/("""
                                """),format.raw/*49.33*/("""<li><a href=""""),_display_(/*49.47*/controllers/*49.58*/.routes.ChangePasswordController.view),format.raw/*49.95*/("""">"""),_display_(/*49.98*/messages("change.password")),format.raw/*49.125*/("""</a></li>
                            """)))}),format.raw/*50.30*/("""
                            """),format.raw/*51.29*/("""<li><a href=""""),_display_(/*51.43*/controllers/*51.54*/.routes.ApplicationController.signOut),format.raw/*51.91*/("""">"""),_display_(/*51.94*/messages("sign.out")),format.raw/*51.114*/("""</a></li>
                        """)))}/*52.26*/.getOrElse/*52.36*/ {_display_(Seq[Any](format.raw/*52.38*/("""
                            """),format.raw/*53.29*/("""<li><a href=""""),_display_(/*53.43*/controllers/*53.54*/.routes.SignInController.view),format.raw/*53.83*/("""">"""),_display_(/*53.86*/messages("sign.in")),format.raw/*53.105*/("""</a></li>
                            <li><a href=""""),_display_(/*54.43*/controllers/*54.54*/.routes.SignUpController.view),format.raw/*54.83*/("""">"""),_display_(/*54.86*/messages("sign.up")),format.raw/*54.105*/("""</a></li>
                        """)))}),format.raw/*55.26*/("""
                    """),format.raw/*56.21*/("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """),_display_(/*62.18*/request/*62.25*/.flash.get("error").map/*62.48*/ { msg =>_display_(Seq[Any](format.raw/*62.57*/("""
                    """),format.raw/*63.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*65.34*/messages("error")),format.raw/*65.51*/("""</strong> """),_display_(/*65.62*/msg),format.raw/*65.65*/("""
                    """),format.raw/*66.21*/("""</div>
                """)))}),format.raw/*67.18*/("""
                """),_display_(/*68.18*/request/*68.25*/.flash.get("info").map/*68.47*/ { msg =>_display_(Seq[Any](format.raw/*68.56*/("""
                    """),format.raw/*69.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*71.34*/messages("info")),format.raw/*71.50*/("""</strong> """),_display_(/*71.61*/msg),format.raw/*71.64*/("""
                    """),format.raw/*72.21*/("""</div>
                """)))}),format.raw/*73.18*/("""
                """),_display_(/*74.18*/request/*74.25*/.flash.get("success").map/*74.50*/ { msg =>_display_(Seq[Any](format.raw/*74.59*/("""
                    """),format.raw/*75.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*77.34*/messages("success")),format.raw/*77.53*/("""</strong> """),_display_(/*77.64*/msg),format.raw/*77.67*/("""
                    """),format.raw/*78.21*/("""</div>
                """)))}),format.raw/*79.18*/("""
                """),_display_(/*80.18*/content),format.raw/*80.25*/("""
            """),format.raw/*81.13*/("""</div>
        </main>
        """),_display_(/*83.10*/webJarsUtil/*83.21*/.locate("jquery.min.js").script()),format.raw/*83.54*/("""
        """),_display_(/*84.10*/webJarsUtil/*84.21*/.locate("bootstrap.min.js").script()),format.raw/*84.57*/("""
        """),format.raw/*85.9*/("""<script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""),_display_(/*86.23*/assets/*86.29*/.path("javascripts/zxcvbnShim.js")),format.raw/*86.63*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:Option[models.User],content:Html,request:RequestHeader,messages:Messages,assets:AssetsFinder,webJarsUtil:WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def f:((String,Option[models.User]) => (Html) => (RequestHeader,Messages,AssetsFinder,WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => (request,messages,assets,webJarsUtil) => apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 03:16:52 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/main.scala.html
                  HASH: 4ec3125a0f8dc26b461b8d6b74398b0ac42991e2
                  MATRIX: 28->1|65->32|106->67|140->95|183->132|591->166|850->332|877->333|1176->605|1191->611|1239->638|1285->657|1311->662|1585->909|1605->920|1660->954|1697->964|1717->975|1778->1015|1814->1024|1871->1054|1886->1060|1931->1084|2651->1777|2701->1806|2982->2060|3002->2071|3058->2106|3280->2301|3300->2312|3356->2347|3386->2350|3424->2366|3674->2589|3687->2593|3700->2597|3745->2604|3802->2633|3843->2647|3863->2658|3919->2693|3949->2696|3959->2697|3985->2702|4051->2741|4155->2835|4196->2837|4257->2870|4298->2884|4318->2895|4376->2932|4406->2935|4455->2962|4525->3001|4582->3030|4623->3044|4643->3055|4701->3092|4731->3095|4773->3115|4827->3150|4846->3160|4886->3162|4943->3191|4984->3205|5004->3216|5054->3245|5084->3248|5125->3267|5204->3319|5224->3330|5274->3359|5304->3362|5345->3381|5411->3416|5460->3437|5650->3600|5666->3607|5698->3630|5745->3639|5794->3660|5995->3834|6033->3851|6071->3862|6095->3865|6144->3886|6199->3910|6244->3928|6260->3935|6291->3957|6338->3966|6387->3987|6586->4159|6623->4175|6661->4186|6685->4189|6734->4210|6789->4234|6834->4252|6850->4259|6884->4284|6931->4293|6980->4314|7182->4489|7222->4508|7260->4519|7284->4522|7333->4543|7388->4567|7433->4585|7461->4592|7502->4605|7561->4637|7581->4648|7635->4681|7672->4691|7692->4702|7749->4738|7785->4747|7920->4855|7935->4861|7990->4895
                  LINES: 4->1|5->2|6->3|7->4|8->5|13->7|18->8|19->9|25->15|25->15|25->15|26->16|26->16|29->19|29->19|29->19|30->20|30->20|30->20|31->21|31->21|31->21|31->21|43->33|43->33|48->38|48->38|48->38|52->42|52->42|52->42|52->42|52->42|56->46|56->46|56->46|56->46|57->47|57->47|57->47|57->47|57->47|57->47|57->47|58->48|58->48|58->48|59->49|59->49|59->49|59->49|59->49|59->49|60->50|61->51|61->51|61->51|61->51|61->51|61->51|62->52|62->52|62->52|63->53|63->53|63->53|63->53|63->53|63->53|64->54|64->54|64->54|64->54|64->54|65->55|66->56|72->62|72->62|72->62|72->62|73->63|75->65|75->65|75->65|75->65|76->66|77->67|78->68|78->68|78->68|78->68|79->69|81->71|81->71|81->71|81->71|82->72|83->73|84->74|84->74|84->74|84->74|85->75|87->77|87->77|87->77|87->77|88->78|89->79|90->80|90->80|91->81|93->83|93->83|93->83|94->84|94->84|94->84|95->85|96->86|96->86|96->86
                  -- GENERATED --
              */
          