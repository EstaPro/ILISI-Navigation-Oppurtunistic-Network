// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/BAROUCH_SHIP/Desktop/Authentification-Silhouette/conf/routes
// @DATE:Fri Mar 15 03:16:52 CET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
