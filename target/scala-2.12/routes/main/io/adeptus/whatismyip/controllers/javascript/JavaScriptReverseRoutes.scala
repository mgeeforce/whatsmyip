
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mike/Projects/play/whatsmyip/conf/routes
// @DATE:Wed Jul 26 13:59:43 MDT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package io.adeptus.whatismyip.controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "io.adeptus.whatismyip.controllers.HomeController.post",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
        }
      """
    )
  
    // @LINE:11
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "io.adeptus.whatismyip.controllers.HomeController.show",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show"})
        }
      """
    )
  
    // @LINE:7
    def ipify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "io.adeptus.whatismyip.controllers.HomeController.ipify",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ipify"})
        }
      """
    )
  
    // @LINE:10
    def whatismyip: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "io.adeptus.whatismyip.controllers.HomeController.whatismyip",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "whatismyip"})
        }
      """
    )
  
    // @LINE:9
    def receive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "io.adeptus.whatismyip.controllers.HomeController.receive",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "io.adeptus.whatismyip.controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
