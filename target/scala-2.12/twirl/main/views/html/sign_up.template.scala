
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import forms.SignUpForm.Data

object sign_up extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Data],RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(signUpForm: Form[Data])(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*8.127*/("""

"""),format.raw/*10.64*/("""

"""),format.raw/*12.1*/("""<!DOCTYPE html>

<html lang="en-US">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <link href=""""),_display_(/*20.18*/assets/*20.24*/.path("assets/fonts/font-awesome.css")),format.raw/*20.62*/("""" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href=""""),_display_(/*22.35*/assets/*22.41*/.path("assets/bootstrap/css/bootstrap.css")),format.raw/*22.84*/("""" type="text/css">
    <link rel="stylesheet" href=""""),_display_(/*23.35*/assets/*23.41*/.path("assets/css/bootstrap-select.min.css")),format.raw/*23.85*/("""" type="text/css">
    <link rel="stylesheet" href=""""),_display_(/*24.35*/assets/*24.41*/.path("assets/css/style.css")),format.raw/*24.70*/("""" type="text/css">
    <link rel="stylesheet" href=""""),_display_(/*25.35*/assets/*25.41*/.path("assets/css/user.style.css")),format.raw/*25.75*/("""" type="text/css">

    <title>Spotter</title>

</head>

<body onunload="" class="page-subpage page-register navigation-top-header" id="page-top">

<!-- Outer Wrapper-->
<div id="outer-wrapper">
    <!-- Inner Wrapper -->
    <div id="inner-wrapper">
        <!-- Navigation-->
        <div class="header">
            <div class="wrapper">
                <div class="brand">
                    <a href="/"><img src=""""),_display_(/*41.44*/assets/*41.50*/.path("assets/img/logo.png")),format.raw/*41.78*/("""" alt="logo"></a>
                </div>
                <nav class="navigation-items">
                    <div class="wrapper">
                        <ul class="main-navigation navigation-top-header"></ul>
                        <ul class="user-area">
                            <li><a href=""""),_display_(/*47.43*/controllers/*47.54*/.routes.SignInController.view),format.raw/*47.83*/("""">Sign In</a></li>
                            <li><a href=""""),_display_(/*48.43*/controllers/*48.54*/.routes.SignUpController.view),format.raw/*48.83*/(""""><strong>Register</strong></a></li>
                        </ul>
                        <a href="" class="submit-item">
                            <div class="content"><span>Submit a POI</span></div>
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
                            <li><a href="/"><i class="fa fa-home"></i></a></li>
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
                        """),_display_(/*101.26*/request/*101.33*/.flash.get("error").map/*101.56*/ { msg =>_display_(Seq[Any](format.raw/*101.65*/("""
                            """),format.raw/*102.29*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                                <a href="#" class="close" data-dismiss="alert">&times;</a>
                                <strong>"""),_display_(/*104.42*/messages("error")),format.raw/*104.59*/("""</strong> """),_display_(/*104.70*/msg),format.raw/*104.73*/("""
                            """),format.raw/*105.29*/("""</div>
                        """)))}),format.raw/*106.26*/("""
                        """),_display_(/*107.26*/request/*107.33*/.flash.get("info").map/*107.55*/ { msg =>_display_(Seq[Any](format.raw/*107.64*/("""
                            """),format.raw/*108.29*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                                <a href="#" class="close" data-dismiss="alert">&times;</a>
                                <strong>"""),_display_(/*110.42*/messages("info")),format.raw/*110.58*/("""</strong> """),_display_(/*110.69*/msg),format.raw/*110.72*/("""
                            """),format.raw/*111.29*/("""</div>
                        """)))}),format.raw/*112.26*/("""
                        """),_display_(/*113.26*/request/*113.33*/.flash.get("success").map/*113.58*/ { msg =>_display_(Seq[Any](format.raw/*113.67*/("""
                            """),format.raw/*114.29*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                                <a href="#" class="close" data-dismiss="alert">&times;</a>
                                <strong>"""),_display_(/*116.42*/messages("success")),format.raw/*116.61*/("""</strong> """),_display_(/*116.72*/msg),format.raw/*116.75*/("""
                            """),format.raw/*117.29*/("""</div>
                        """)))}),format.raw/*118.26*/("""
                        """),format.raw/*119.25*/("""<div class="row">
                            <div class="col-md-4 col-sm-6 col-md-offset-4 col-sm-offset-3">
                                <header>
                                    <h1 class="page-title">Register</h1>
                                </header>
                                <hr>
                                <!-- <form role="form" id="form-register" method="post" action="?">
                                    <div class="form-group">
                                        <label for="form-register-full-name">Full Name:</label>
                                        <input type="text" class="form-control" id="form-register-full-name" name="form-register-full-name" required>
                                    </div><!-- /.form-group --
                                    <div class="form-group">
                                        <label for="form-register-email">Email:</label>
                                        <input type="email" class="form-control" id="form-register-email" name="form-register-email" required>
                                    </div><!-- /.form-group --
                                    <div class="form-group">
                                        <label for="form-register-password">Password:</label>
                                        <input type="password" class="form-control" id="form-register-password" name="form-register-password" required>
                                    </div><!-- /.form-group --
                                    <div class="form-group">
                                        <label for="form-register-confirm-password">Confirm Password:</label>
                                        <input type="password" class="form-control" id="form-register-confirm-password" name="form-register-confirm-password" required>
                                    </div><!-- /.form-group --
                                    <div class="form-group clearfix">
                                        <button type="submit" class="btn pull-right btn-default" id="account-submit">Create an Account</button>
                                    </div><!-- /.form-group --
                                </form> -->
                                """),_display_(/*146.34*/helper/*146.40*/.form(action = controllers.routes.SignUpController.submit())/*146.100*/ {_display_(Seq[Any](format.raw/*146.102*/("""
                                    """),_display_(/*147.38*/helper/*147.44*/.CSRF.formField),format.raw/*147.59*/("""
                                    """),format.raw/*148.37*/("""<div class="form-group">
                                        <label for="form-register-full-name">First Name :</label>
                                        """),_display_(/*150.42*/b3/*150.44*/.text(signUpForm("firstName"), '_hiddenLabel -> messages("first.name"), 'class -> "form-control")),format.raw/*150.141*/("""
                                    """),format.raw/*151.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group">
                                        <label for="form-register-full-name">Last Name :</label>
                                        """),_display_(/*154.42*/b3/*154.44*/.text(signUpForm("lastName"), '_hiddenLabel -> messages("last.name"), 'class -> "form-control")),format.raw/*154.139*/("""
                                    """),format.raw/*155.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group">
                                        <label for="form-register-full-name">Email :</label>
                                        """),_display_(/*158.42*/b3/*158.44*/.text(signUpForm("email"), '_hiddenLabel -> messages("email"), 'class -> "form-control")),format.raw/*158.132*/("""
                                    """),format.raw/*159.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group">
                                        <label for="form-register-full-name">Password :</label>
                                        """),_display_(/*162.42*/b3/*162.44*/.text(signUpForm("password"), '_hiddenLabel -> messages("password"), 'class -> "form-control")),format.raw/*162.138*/("""
                                    """),format.raw/*163.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group clearfix">
                                            <button type="submit" value="submit" class="btn pull-right btn-default" id="submit">Create an Account</button>
                                    </div><!-- /.form-group -->

                                    <div class="sign-in-now">
                                        <p>"""),_display_(/*169.45*/messages("already.a.member")),format.raw/*169.73*/(""" """),format.raw/*169.74*/("""<a href=""""),_display_(/*169.84*/controllers/*169.95*/.routes.SignInController.view),format.raw/*169.124*/("""">"""),_display_(/*169.127*/messages("sign.in.now")),format.raw/*169.150*/("""</a></p>
                                    </div>
                                """)))}),format.raw/*171.34*/("""
                                """),format.raw/*172.33*/("""<hr>
                                <div class="center">
                                    <figure class="note">By clicking the “Create an Account” button you agree with our <a href="" class="link">Terms and conditions</a></figure>
                                </div>
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

<script type="text/javascript" src="assets/js/jquery-2.1.0.min.js"></script>
<script type="text/javascript" src="assets/js/before.load.js"></script>
<script type="text/javascript" src="assets/js/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="assets/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="assets/js/smoothscroll.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-select.min.js"></script>
<script type="text/javascript" src="assets/js/jquery.hotkeys.js"></script>
<script type="text/javascript" src="assets/js/icheck.min.js"></script>
<script type="text/javascript" src="assets/js/custom.js"></script>

<!--[if lte IE 9]>
<script type="text/javascript" src="assets/js/ie-scripts.js"></script>
<![endif]-->
</body>
</html>"""))
      }
    }
  }

  def render(signUpForm:Form[Data],request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request,messages,webJarsUtil,assets)

  def f:((Form[Data]) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request,messages,webJarsUtil,assets) => apply(signUpForm)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 03:18:48 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/sign_up.scala.html
                  HASH: 4687f82420c5dac4667beebb852282d8cf9f914f
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|608->202|821->332|854->356|923->327|955->394|986->398|1187->572|1202->578|1261->616|1469->797|1484->803|1548->846|1629->900|1644->906|1709->950|1790->1004|1805->1010|1855->1039|1936->1093|1951->1099|2006->1133|2469->1569|2484->1575|2533->1603|2865->1908|2885->1919|2935->1948|3024->2010|3044->2021|3094->2050|5337->4265|5354->4272|5387->4295|5435->4304|5494->4334|5714->4526|5753->4543|5792->4554|5817->4557|5876->4587|5941->4620|5996->4647|6013->4654|6045->4676|6093->4685|6152->4715|6370->4905|6408->4921|6447->4932|6472->4935|6531->4965|6596->4998|6651->5025|6668->5032|6703->5057|6751->5066|6810->5096|7031->5289|7072->5308|7111->5319|7136->5322|7195->5352|7260->5385|7315->5411|9624->7692|9640->7698|9711->7758|9753->7760|9820->7799|9836->7805|9873->7820|9940->7858|10134->8024|10146->8026|10266->8123|10333->8161|10591->8391|10603->8393|10721->8488|10788->8526|11042->8752|11054->8754|11165->8842|11232->8880|11489->9109|11501->9111|11618->9205|11685->9243|12143->9673|12193->9701|12223->9702|12261->9712|12282->9723|12334->9752|12366->9755|12412->9778|12531->9865|12594->9899
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|18->10|18->10|19->8|21->10|23->12|31->20|31->20|31->20|33->22|33->22|33->22|34->23|34->23|34->23|35->24|35->24|35->24|36->25|36->25|36->25|52->41|52->41|52->41|58->47|58->47|58->47|59->48|59->48|59->48|112->101|112->101|112->101|112->101|113->102|115->104|115->104|115->104|115->104|116->105|117->106|118->107|118->107|118->107|118->107|119->108|121->110|121->110|121->110|121->110|122->111|123->112|124->113|124->113|124->113|124->113|125->114|127->116|127->116|127->116|127->116|128->117|129->118|130->119|157->146|157->146|157->146|157->146|158->147|158->147|158->147|159->148|161->150|161->150|161->150|162->151|165->154|165->154|165->154|166->155|169->158|169->158|169->158|170->159|173->162|173->162|173->162|174->163|180->169|180->169|180->169|180->169|180->169|180->169|180->169|180->169|182->171|183->172
                  -- GENERATED --
              */
          