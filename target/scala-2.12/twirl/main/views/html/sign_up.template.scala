
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
                        <div class="row">
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
                                """),_display_(/*128.34*/helper/*128.40*/.form(action = controllers.routes.SignUpController.submit())/*128.100*/ {_display_(Seq[Any](format.raw/*128.102*/("""
                                    """),_display_(/*129.38*/helper/*129.44*/.CSRF.formField),format.raw/*129.59*/("""
                                    """),format.raw/*130.37*/("""<div class="form-group">
                                        <label for="form-register-full-name">First Name :</label>
                                        """),_display_(/*132.42*/b3/*132.44*/.text(signUpForm("firstName"), '_hiddenLabel -> messages("first.name"), 'class -> "form-control")),format.raw/*132.141*/("""
                                    """),format.raw/*133.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group">
                                        <label for="form-register-full-name">Last Name :</label>
                                        """),_display_(/*136.42*/b3/*136.44*/.text(signUpForm("lastName"), '_hiddenLabel -> messages("last.name"), 'class -> "form-control")),format.raw/*136.139*/("""
                                    """),format.raw/*137.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group">
                                        <label for="form-register-full-name">Email :</label>
                                        """),_display_(/*140.42*/b3/*140.44*/.text(signUpForm("email"), '_hiddenLabel -> messages("email"), 'class -> "form-control")),format.raw/*140.132*/("""
                                    """),format.raw/*141.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group">
                                        <label for="form-register-full-name">Password :</label>
                                        """),_display_(/*144.42*/b3/*144.44*/.text(signUpForm("password"), '_hiddenLabel -> messages("password"), 'class -> "form-control")),format.raw/*144.138*/("""
                                    """),format.raw/*145.37*/("""</div><!-- /.form-group -->
                                    <div class="form-group clearfix">
                                            <button type="submit" value="submit" class="btn pull-right btn-default" id="submit">Create an Account</button>
                                    </div><!-- /.form-group -->

                                    <div class="sign-in-now">
                                        <p>"""),_display_(/*151.45*/messages("already.a.member")),format.raw/*151.73*/(""" """),format.raw/*151.74*/("""<a href=""""),_display_(/*151.84*/controllers/*151.95*/.routes.SignInController.view),format.raw/*151.124*/("""">"""),_display_(/*151.127*/messages("sign.in.now")),format.raw/*151.150*/("""</a></p>
                                    </div>
                                """)))}),format.raw/*153.34*/("""
                                """),format.raw/*154.33*/("""<hr>
                                <div class="center">
                                    <figure class="note">By clicking the “Create an Account” button you agree with our <a href="terms-conditions.html" class="link">Terms and conditions</a></figure>
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
                  DATE: Sat Mar 16 02:52:40 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/sign_up.scala.html
                  HASH: 0aab80a151adaf243484418ced5c108d20e7fb44
                  MATRIX: 28->1|61->29|98->61|139->97|182->135|221->169|608->202|821->332|854->356|923->327|955->394|986->398|1187->572|1202->578|1261->616|1469->797|1484->803|1548->846|1629->900|1644->906|1709->950|1790->1004|1805->1010|1855->1039|1936->1093|1951->1099|2006->1133|2469->1569|2484->1575|2533->1603|2865->1908|2885->1919|2935->1948|3024->2010|3044->2021|3094->2050|7617->6545|7633->6551|7704->6611|7746->6613|7813->6652|7829->6658|7866->6673|7933->6711|8127->6877|8139->6879|8259->6976|8326->7014|8584->7244|8596->7246|8714->7341|8781->7379|9035->7605|9047->7607|9158->7695|9225->7733|9482->7962|9494->7964|9611->8058|9678->8096|10136->8526|10186->8554|10216->8555|10254->8565|10275->8576|10327->8605|10359->8608|10405->8631|10524->8718|10587->8752
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|18->10|18->10|19->8|21->10|23->12|31->20|31->20|31->20|33->22|33->22|33->22|34->23|34->23|34->23|35->24|35->24|35->24|36->25|36->25|36->25|52->41|52->41|52->41|58->47|58->47|58->47|59->48|59->48|59->48|139->128|139->128|139->128|139->128|140->129|140->129|140->129|141->130|143->132|143->132|143->132|144->133|147->136|147->136|147->136|148->137|151->140|151->140|151->140|152->141|155->144|155->144|155->144|156->145|162->151|162->151|162->151|162->151|162->151|162->151|162->151|162->151|164->153|165->154
                  -- GENERATED --
              */
          