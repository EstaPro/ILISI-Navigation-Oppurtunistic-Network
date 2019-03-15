
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*7.2*/import forms.SignInForm.Data

object sign_in extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*11.2*/implicitFieldConstructor/*11.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*9.168*/("""

"""),format.raw/*11.64*/("""

"""),format.raw/*13.1*/("""<!DOCTYPE html>

<html lang="en-US">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <link href=""""),_display_(/*21.18*/assets/*21.24*/.path("assets/fonts/font-awesome.css")),format.raw/*21.62*/("""" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href=""""),_display_(/*23.35*/assets/*23.41*/.path("assets/bootstrap/css/bootstrap.css")),format.raw/*23.84*/("""" type="text/css">
    <link rel="stylesheet" href=""""),_display_(/*24.35*/assets/*24.41*/.path("assets/css/bootstrap-select.min.css")),format.raw/*24.85*/("""" type="text/css">
    <link rel="stylesheet" href=""""),_display_(/*25.35*/assets/*25.41*/.path("assets/css/style.css")),format.raw/*25.70*/("""" type="text/css">
    <link rel="stylesheet" href=""""),_display_(/*26.35*/assets/*26.41*/.path("assets/css/user.style.css")),format.raw/*26.75*/("""" type="text/css">

    <title>Spotter</title>

</head>

<body onunload="" class="page-subpage page-sign-in navigation-off-canvas" id="page-top">

<!-- Outer Wrapper-->
<div id="outer-wrapper">
    <!-- Inner Wrapper -->
    <div id="inner-wrapper">
        <!-- Navigation-->
        <div class="header">
            <div class="wrapper">
                <div class="brand">
                    <a href="index-directory.html"><img src=""""),_display_(/*42.63*/assets/*42.69*/.path("assets/img/logo.png")),format.raw/*42.97*/("""" alt="logo"></a>
                </div>
                <nav class="navigation-items">
                    <div class="wrapper">
                        <ul class="main-navigation navigation-top-header"></ul>
                        <ul class="user-area">
                            <li><a href=""""),_display_(/*48.43*/controllers/*48.54*/.routes.SignInController.view),format.raw/*48.83*/("""">Sign In</a></li>
                            <li><a href=""""),_display_(/*49.43*/controllers/*49.54*/.routes.SignUpController.view),format.raw/*49.83*/(""""><strong>Register</strong></a></li>
                        </ul>
                        <a href="#" class="submit-item">
                            <div class="content"><span>Submit Your Item</span></div>
                            <div class="icon">
                                <i class="fa fa-plus"></i>
                            </div>
                        </a>
                        <div class="toggle-navigation">
                            <div class="icon">
                                <div class="line"></div>
                                <div class="line"></div>
                                <div class="line"></div>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <!-- end Navigation-->
        <!-- Page Canvas-->
        <div id="page-canvas">
            <!--Off Canvas Navigation-->
            <nav class="off-canvas-navigation">
                <header>Navigation</header>
                <div class="main-navigation navigation-off-canvas"></div>
            </nav>
            <!--end Off Canvas Navigation-->

            <!--Sub Header-->
            <section class="sub-header">
                <div class="search-bar horizontal collapse" id="redefine-search-form"></div>
                <!-- /.search-bar -->
                <div class="breadcrumb-wrapper">
                    <div class="container">
                       
                        <ol class="breadcrumb">
                            <li><a href="#"><i class="fa fa-home"></i></a></li>
                            <li><a href="#">Page</a></li>
                            <li class="active">Detail</li>
                        </ol>
                        <!-- /.breadcrumb-->
                    </div>
                    <!-- /.container-->
                </div>
                <!-- /.breadcrumb-wrapper-->
            </section>
            <!--end Sub Header-->

            <!--Page Content-->
            <div id="page-content">
                <section class="container">
                    <div class="block">
                            """),_display_(/*102.30*/request/*102.37*/.flash.get("error").map/*102.60*/ { msg =>_display_(Seq[Any](format.raw/*102.69*/("""
                                """),format.raw/*103.33*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                                    <a href="#" class="close" data-dismiss="alert">&times;</a>
                                    <strong>"""),_display_(/*105.46*/messages("error")),format.raw/*105.63*/("""</strong> """),_display_(/*105.74*/msg),format.raw/*105.77*/("""
                                """),format.raw/*106.33*/("""</div>
                            """)))}),format.raw/*107.30*/("""
                            """),_display_(/*108.30*/request/*108.37*/.flash.get("info").map/*108.59*/ { msg =>_display_(Seq[Any](format.raw/*108.68*/("""
                                """),format.raw/*109.33*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                                    <a href="#" class="close" data-dismiss="alert">&times;</a>
                                    <strong>"""),_display_(/*111.46*/messages("info")),format.raw/*111.62*/("""</strong> """),_display_(/*111.73*/msg),format.raw/*111.76*/("""
                                """),format.raw/*112.33*/("""</div>
                            """)))}),format.raw/*113.30*/("""
                            """),_display_(/*114.30*/request/*114.37*/.flash.get("success").map/*114.62*/ { msg =>_display_(Seq[Any](format.raw/*114.71*/("""
                                """),format.raw/*115.33*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                                    <a href="#" class="close" data-dismiss="alert">&times;</a>
                                    <strong>"""),_display_(/*117.46*/messages("success")),format.raw/*117.65*/("""</strong> """),_display_(/*117.76*/msg),format.raw/*117.79*/("""
                                """),format.raw/*118.33*/("""</div>
                            """)))}),format.raw/*119.30*/("""
                            
                        """),format.raw/*121.25*/("""<div class="row">
                            <div class="col-md-4 col-sm-6 col-md-offset-4 col-sm-offset-3">
                                <header>
                                <h1 class="page-title">"""),_display_(/*124.57*/messages("sign.in.credentials")),format.raw/*124.88*/("""</h1>
                                </header>
                                <hr>
                                """),_display_(/*127.34*/helper/*127.40*/.form(action = controllers.routes.SignInController.submit())/*127.100*/ {_display_(Seq[Any](format.raw/*127.102*/("""
                                    """),_display_(/*128.38*/helper/*128.44*/.CSRF.formField),format.raw/*128.59*/("""
                                    """),format.raw/*129.37*/("""<label for="form-sign-in-email">Email:</label>
                                    """),_display_(/*130.38*/b3/*130.40*/.email(
                                        signInForm("email"), 
                                        '_hiddenLabel -> messages("email"),
                                        'type -> "email",
                                        'class -> "form-control",
                                        'name -> "form-sign-in-email",
                                        'id -> "form-sign-in-email",
                                        'required -> true
                                    )),format.raw/*138.38*/("""
                                    """),format.raw/*139.37*/("""<label for="form-sign-in-email">Password:</label>
                                    """),_display_(/*140.38*/b3/*140.40*/.password(
                                        signInForm("password"), 
                                        '_hiddenLabel -> messages("password"),
                                        'type -> "password",
                                        'class -> "form-control",
                                        'name -> "form-sign-in-password",
                                        'id -> "form-sign-in-password",
                                        'required -> true
                                    )),format.raw/*148.38*/("""
                                    """),_display_(/*149.38*/b3/*149.40*/.checkbox(signInForm("rememberMe"), '_text -> messages("remember.me"), 'checked -> true)),format.raw/*149.128*/("""

                                    """),format.raw/*151.37*/("""<div class="form-group clearfix">
                                        <div>
                                            <button id="submit" type="submit" class="btn pull-right btn-default">"""),_display_(/*153.115*/messages("sign.in")),format.raw/*153.134*/("""</button>
                                        </div>
                                    </div>
                                """)))}),format.raw/*156.34*/("""

                                """),format.raw/*158.33*/("""<div>
                                        <p class="not-a-member">"""),_display_(/*159.66*/messages("not.a.member")),format.raw/*159.90*/(""" """),format.raw/*159.91*/("""<a href=""""),_display_(/*159.101*/controllers/*159.112*/.routes.SignUpController.view),format.raw/*159.141*/("""">"""),_display_(/*159.144*/messages("sign.up.now")),format.raw/*159.167*/("""</a> | <a href=""""),_display_(/*159.184*/controllers/*159.195*/.routes.ForgotPasswordController.view()),format.raw/*159.234*/("""" title=""""),_display_(/*159.244*/messages("forgot.your.password")),format.raw/*159.276*/("""">"""),_display_(/*159.279*/messages("forgot.your.password")),format.raw/*159.311*/("""</a></p>
                                </div>

                                """),_display_(/*162.34*/if(socialProviders.providers.nonEmpty)/*162.72*/ {_display_(Seq[Any](format.raw/*162.74*/("""
                                    """),format.raw/*163.37*/("""<div class="social-providers">
                                        <p>"""),_display_(/*164.45*/messages("or.use.social")),format.raw/*164.70*/("""</p>
                                        <div>
                                        """),_display_(/*166.42*/for(p <- socialProviders.providers) yield /*166.77*/ {_display_(Seq[Any](format.raw/*166.79*/("""
                                            """),format.raw/*167.45*/("""<a href=""""),_display_(/*167.55*/controllers/*167.66*/.routes.SocialAuthController.authenticate(p.id)),format.raw/*167.113*/("""" class="provider """),_display_(/*167.132*/p/*167.133*/.id),format.raw/*167.136*/("""" title=""""),_display_(/*167.146*/messages(p.id)),format.raw/*167.160*/(""""><img src=""""),_display_(/*167.173*/assets/*167.179*/.path(s"images/providers/${p.id}.png")),format.raw/*167.217*/("""" width="64px" height="64px" alt=""""),_display_(/*167.252*/messages(p.id)),format.raw/*167.266*/(""""></a>
                                        """)))}),format.raw/*168.42*/("""
                                        """),format.raw/*169.41*/("""</div>
                                    </div>
                                """)))}),format.raw/*171.34*/("""

                            """),format.raw/*173.29*/("""</div>
                        </div>
                    </div>
                </section>
                <!-- /.block-->
            </div>
            <!-- end Page Content-->
        </div>
        <!-- end Page Canvas-->
      
    </div>
    <!-- end Inner Wrapper -->
</div>
<!-- end Outer Wrapper-->


<script type="text/javascript" src=""""),_display_(/*189.38*/assets/*189.44*/.path("assets/js/jquery-2.1.0.min.js")),format.raw/*189.82*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*190.38*/assets/*190.44*/.path("assets/js/before.load.js")),format.raw/*190.77*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*191.38*/assets/*191.44*/.path("assets/js/jquery-migrate-1.2.1.min.js")),format.raw/*191.90*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*192.38*/assets/*192.44*/.path("assets/bootstrap/js/bootstrap.min.js")),format.raw/*192.89*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*193.38*/assets/*193.44*/.path("assets/js/smoothscroll.js")),format.raw/*193.78*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*194.38*/assets/*194.44*/.path("assets/js/bootstrap-select.min.js")),format.raw/*194.86*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*195.38*/assets/*195.44*/.path("assets/js/jquery.hotkeys.js")),format.raw/*195.80*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*196.38*/assets/*196.44*/.path("assets/js/custom.js")),format.raw/*196.72*/(""""></script>

<!--[if lte IE 9]>
<script type="text/javascript" src="assets/js/ie-scripts.js"></script>
<![endif]-->
</body>
</html>"""))
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
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/sign_in.scala.html
                  HASH: 9cd11967fe676c99eeb37e62f04d7bafc693f2d9
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|300->243|710->276|964->447|997->471|1066->442|1098->509|1129->513|1330->687|1345->693|1404->731|1612->912|1627->918|1691->961|1772->1015|1787->1021|1852->1065|1933->1119|1948->1125|1998->1154|2079->1208|2094->1214|2149->1248|2630->1702|2645->1708|2694->1736|3026->2041|3046->2052|3096->2081|3185->2143|3205->2154|3255->2183|5514->4414|5531->4421|5564->4444|5612->4453|5675->4487|5903->4687|5942->4704|5981->4715|6006->4718|6069->4752|6138->4789|6197->4820|6214->4827|6246->4849|6294->4858|6357->4892|6583->5090|6621->5106|6660->5117|6685->5120|6748->5154|6817->5191|6876->5222|6893->5229|6928->5254|6976->5263|7039->5297|7268->5498|7309->5517|7348->5528|7373->5531|7436->5565|7505->5602|7590->5658|7828->5868|7881->5899|8030->6020|8046->6026|8117->6086|8159->6088|8226->6127|8242->6133|8279->6148|8346->6186|8459->6271|8471->6273|9006->6786|9073->6824|9189->6912|9201->6914|9754->7445|9821->7484|9833->7486|9944->7574|10013->7614|10238->7810|10280->7829|10448->7965|10513->8001|10613->8073|10659->8097|10689->8098|10728->8108|10750->8119|10802->8148|10834->8151|10880->8174|10926->8191|10948->8202|11010->8241|11049->8251|11104->8283|11136->8286|11191->8318|11304->8403|11352->8441|11393->8443|11460->8481|11564->8557|11611->8582|11733->8676|11785->8711|11826->8713|11901->8759|11939->8769|11960->8780|12030->8827|12078->8846|12090->8847|12116->8850|12155->8860|12192->8874|12234->8887|12251->8893|12312->8931|12376->8966|12413->8980|12494->9029|12565->9071|12682->9156|12743->9188|13135->9552|13151->9558|13211->9596|13289->9646|13305->9652|13360->9685|13438->9735|13454->9741|13522->9787|13600->9837|13616->9843|13683->9888|13761->9938|13777->9944|13833->9978|13911->10028|13927->10034|13991->10076|14069->10126|14085->10132|14143->10168|14221->10218|14237->10224|14287->10252
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|15->9|19->11|19->11|20->9|22->11|24->13|32->21|32->21|32->21|34->23|34->23|34->23|35->24|35->24|35->24|36->25|36->25|36->25|37->26|37->26|37->26|53->42|53->42|53->42|59->48|59->48|59->48|60->49|60->49|60->49|113->102|113->102|113->102|113->102|114->103|116->105|116->105|116->105|116->105|117->106|118->107|119->108|119->108|119->108|119->108|120->109|122->111|122->111|122->111|122->111|123->112|124->113|125->114|125->114|125->114|125->114|126->115|128->117|128->117|128->117|128->117|129->118|130->119|132->121|135->124|135->124|138->127|138->127|138->127|138->127|139->128|139->128|139->128|140->129|141->130|141->130|149->138|150->139|151->140|151->140|159->148|160->149|160->149|160->149|162->151|164->153|164->153|167->156|169->158|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|170->159|173->162|173->162|173->162|174->163|175->164|175->164|177->166|177->166|177->166|178->167|178->167|178->167|178->167|178->167|178->167|178->167|178->167|178->167|178->167|178->167|178->167|178->167|178->167|179->168|180->169|182->171|184->173|200->189|200->189|200->189|201->190|201->190|201->190|202->191|202->191|202->191|203->192|203->192|203->192|204->193|204->193|204->193|205->194|205->194|205->194|206->195|206->195|206->195|207->196|207->196|207->196
                  -- GENERATED --
              */
          