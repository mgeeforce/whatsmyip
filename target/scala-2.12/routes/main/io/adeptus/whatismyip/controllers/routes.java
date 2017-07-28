
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mike/Projects/play/whatsmyip/conf/routes
// @DATE:Wed Jul 26 13:59:43 MDT 2017

package io.adeptus.whatismyip.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final io.adeptus.whatismyip.controllers.ReverseHomeController HomeController = new io.adeptus.whatismyip.controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final io.adeptus.whatismyip.controllers.javascript.ReverseHomeController HomeController = new io.adeptus.whatismyip.controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
