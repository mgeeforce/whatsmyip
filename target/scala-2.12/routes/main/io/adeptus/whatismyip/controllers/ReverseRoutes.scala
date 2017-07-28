
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mike/Projects/play/whatsmyip/conf/routes
// @DATE:Wed Jul 26 13:59:43 MDT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package io.adeptus.whatismyip.controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def post(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "post")
    }
  
    // @LINE:11
    def show(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "show")
    }
  
    // @LINE:7
    def ipify(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ipify")
    }
  
    // @LINE:10
    def whatismyip(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "whatismyip")
    }
  
    // @LINE:9
    def receive(): Call = {
      
      Call("POST", _prefix)
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
