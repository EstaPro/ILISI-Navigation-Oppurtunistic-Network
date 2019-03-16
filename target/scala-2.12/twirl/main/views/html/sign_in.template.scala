
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
                    <a href="/"><img src=""""),_display_(/*42.44*/assets/*42.50*/.path("assets/img/logo.png")),format.raw/*42.78*/("""" alt="logo"></a>
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
                                    """),_display_(/*149.38*/b3/*149.40*/.checkbox(
                                        signInForm("rememberMe"), 
                                        'type -> "checkbox",
                                        '_text -> messages("remember.me"), 
                                        'checked -> true
                                    )),format.raw/*154.38*/("""

                                    """),format.raw/*156.37*/("""<div class="form-group clearfix">
                                        <div>
                                            <button id="submit" type="submit" class="btn pull-right btn-default">"""),_display_(/*158.115*/messages("sign.in")),format.raw/*158.134*/("""</button>
                                        </div>
                                    </div>
                                """)))}),format.raw/*161.34*/("""

                                """),format.raw/*163.33*/("""<div class="form-group clearfix">
                                        <p class="not-a-member">"""),_display_(/*164.66*/messages("not.a.member")),format.raw/*164.90*/(""" """),format.raw/*164.91*/("""<a href=""""),_display_(/*164.101*/controllers/*164.112*/.routes.SignUpController.view),format.raw/*164.141*/("""">"""),_display_(/*164.144*/messages("sign.up.now")),format.raw/*164.167*/("""</a> | <a href=""""),_display_(/*164.184*/controllers/*164.195*/.routes.ForgotPasswordController.view()),format.raw/*164.234*/("""" title=""""),_display_(/*164.244*/messages("forgot.your.password")),format.raw/*164.276*/("""">"""),_display_(/*164.279*/messages("forgot.your.password")),format.raw/*164.311*/("""</a></p>
                                </div>
<!-- 
                                """),_display_(/*167.34*/if(socialProviders.providers.nonEmpty)/*167.72*/ {_display_(Seq[Any](format.raw/*167.74*/("""
                                """),format.raw/*168.33*/("""<div class="social-providers">
                                    <p>"""),_display_(/*169.41*/messages("or.use.social")),format.raw/*169.66*/("""</p>
                                    <div>
                                        """),_display_(/*171.42*/for(p <- socialProviders.providers) yield /*171.77*/ {_display_(Seq[Any](format.raw/*171.79*/(""" """),format.raw/*171.80*/("""<a href=""""),_display_(/*171.90*/controllers/*171.101*/.routes.SocialAuthController.authenticate(p.id)),format.raw/*171.148*/(""""
                                            class="provider """),_display_(/*172.62*/p/*172.63*/.id),format.raw/*172.66*/("""" title=""""),_display_(/*172.76*/messages(p.id)),format.raw/*172.90*/(""""><img src=""""),_display_(/*172.103*/assets/*172.109*/.path(s" images/providers/${p.id}.png")),format.raw/*172.148*/(""""
                                                width="64px" height="64px" alt=""""),_display_(/*173.82*/messages(p.id)),format.raw/*173.96*/(""""></a>
                                            """)))}),format.raw/*174.46*/("""
                                    """),format.raw/*175.37*/("""</div>
                                </div>
                                """)))}),format.raw/*177.34*/(""" """),format.raw/*177.35*/("""-->

                            </div>
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


<script type="text/javascript" src=""""),_display_(/*195.38*/assets/*195.44*/.path("assets/js/jquery-2.1.0.min.js")),format.raw/*195.82*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*196.38*/assets/*196.44*/.path("assets/js/before.load.js")),format.raw/*196.77*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*197.38*/assets/*197.44*/.path("assets/js/jquery-migrate-1.2.1.min.js")),format.raw/*197.90*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*198.38*/assets/*198.44*/.path("assets/bootstrap/js/bootstrap.min.js")),format.raw/*198.89*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*199.38*/assets/*199.44*/.path("assets/js/smoothscroll.js")),format.raw/*199.78*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*200.38*/assets/*200.44*/.path("assets/js/bootstrap-select.min.js")),format.raw/*200.86*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*201.38*/assets/*201.44*/.path("assets/js/jquery.hotkeys.js")),format.raw/*201.80*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*202.38*/assets/*202.44*/.path("assets/js/custom.js")),format.raw/*202.72*/(""""></script>

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
                  DATE: Sat Mar 16 03:18:48 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/sign_in.scala.html
                  HASH: d74810ece0a90bbc07648c62b185aff4f42b2b8e
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|300->243|710->276|964->447|997->471|1066->442|1098->509|1129->513|1330->687|1345->693|1404->731|1612->912|1627->918|1691->961|1772->1015|1787->1021|1852->1065|1933->1119|1948->1125|1998->1154|2079->1208|2094->1214|2149->1248|2611->1683|2626->1689|2675->1717|3007->2022|3027->2033|3077->2062|3166->2124|3186->2135|3236->2164|5495->4395|5512->4402|5545->4425|5593->4434|5656->4468|5884->4668|5923->4685|5962->4696|5987->4699|6050->4733|6119->4770|6178->4801|6195->4808|6227->4830|6275->4839|6338->4873|6564->5071|6602->5087|6641->5098|6666->5101|6729->5135|6798->5172|6857->5203|6874->5210|6909->5235|6957->5244|7020->5278|7249->5479|7290->5498|7329->5509|7354->5512|7417->5546|7486->5583|7571->5639|7809->5849|7862->5880|8011->6001|8027->6007|8098->6067|8140->6069|8207->6108|8223->6114|8260->6129|8327->6167|8440->6252|8452->6254|8987->6767|9054->6805|9170->6893|9182->6895|9735->7426|9802->7465|9814->7467|10150->7781|10219->7821|10444->8017|10486->8036|10654->8172|10719->8208|10847->8308|10893->8332|10923->8333|10962->8343|10984->8354|11036->8383|11068->8386|11114->8409|11160->8426|11182->8437|11244->8476|11283->8486|11338->8518|11370->8521|11425->8553|11543->8643|11591->8681|11632->8683|11695->8717|11795->8789|11842->8814|11960->8904|12012->8939|12053->8941|12083->8942|12121->8952|12143->8963|12213->9010|12305->9074|12316->9075|12341->9078|12379->9088|12415->9102|12457->9115|12474->9121|12536->9160|12648->9244|12684->9258|12769->9311|12836->9349|12949->9430|12979->9431|13406->9830|13422->9836|13482->9874|13560->9924|13576->9930|13631->9963|13709->10013|13725->10019|13793->10065|13871->10115|13887->10121|13954->10166|14032->10216|14048->10222|14104->10256|14182->10306|14198->10312|14262->10354|14340->10404|14356->10410|14414->10446|14492->10496|14508->10502|14558->10530
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|15->9|19->11|19->11|20->9|22->11|24->13|32->21|32->21|32->21|34->23|34->23|34->23|35->24|35->24|35->24|36->25|36->25|36->25|37->26|37->26|37->26|53->42|53->42|53->42|59->48|59->48|59->48|60->49|60->49|60->49|113->102|113->102|113->102|113->102|114->103|116->105|116->105|116->105|116->105|117->106|118->107|119->108|119->108|119->108|119->108|120->109|122->111|122->111|122->111|122->111|123->112|124->113|125->114|125->114|125->114|125->114|126->115|128->117|128->117|128->117|128->117|129->118|130->119|132->121|135->124|135->124|138->127|138->127|138->127|138->127|139->128|139->128|139->128|140->129|141->130|141->130|149->138|150->139|151->140|151->140|159->148|160->149|160->149|165->154|167->156|169->158|169->158|172->161|174->163|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|175->164|178->167|178->167|178->167|179->168|180->169|180->169|182->171|182->171|182->171|182->171|182->171|182->171|182->171|183->172|183->172|183->172|183->172|183->172|183->172|183->172|183->172|184->173|184->173|185->174|186->175|188->177|188->177|206->195|206->195|206->195|207->196|207->196|207->196|208->197|208->197|208->197|209->198|209->198|209->198|210->199|210->199|210->199|211->200|211->200|211->200|212->201|212->201|212->201|213->202|213->202|213->202
                  -- GENERATED --
              */
          