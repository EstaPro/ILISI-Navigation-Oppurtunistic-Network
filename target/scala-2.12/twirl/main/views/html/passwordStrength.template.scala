
package views.html

/*1.2*/import play.api.data.Field
/*2.2*/import play.api.i18n.MessagesProvider

object passwordStrength extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Field,Array[scala.Tuple2[Symbol, Any]],MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(field: Field, options: (Symbol, Any)*)(implicit messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ b3.vertical.fieldConstructor() }};
Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.64*/("""

"""),format.raw/*8.1*/("""<section>
  """),_display_(/*9.4*/b3/*9.6*/.password(field, (Symbol("data-pwd"), "true") +: options:_*)),format.raw/*9.66*/("""

  """),format.raw/*11.3*/("""<meter max="4" id="password-strength-meter"></meter>
  <p id="password-strength-text"></p>
</section>
"""))
      }
    }
  }

  def render(field:Field,options:Array[scala.Tuple2[Symbol, Any]],messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(field,options:_*)(messagesProvider)

  def f:((Field,Array[scala.Tuple2[Symbol, Any]]) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (field,options) => (messagesProvider) => apply(field,options:_*)(messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 03:16:52 CET 2019
                  SOURCE: C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/app/views/passwordStrength.scala.html
                  HASH: 5002ede0d01e8bae842aa7d873856adc4c601fba
                  MATRIX: 28->1|62->29|464->69|635->156|667->180|734->154|762->218|790->220|828->233|837->235|917->295|948->299
                  LINES: 4->1|5->2|10->4|14->6|14->6|15->5|16->6|18->8|19->9|19->9|19->9|21->11
                  -- GENERATED --
              */
          