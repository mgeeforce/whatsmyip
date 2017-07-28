
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mike/Projects/play/whatsmyip/conf/routes
// @DATE:Wed Jul 26 13:59:43 MDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
