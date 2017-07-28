
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mike/Projects/play/whatsmyip/conf/routes
// @DATE:Wed Jul 26 13:59:43 MDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: io.adeptus.whatismyip.controllers.HomeController,
  // @LINE:15
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: io.adeptus.whatismyip.controllers.HomeController,
    // @LINE:15
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """io.adeptus.whatismyip.controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ipify""", """io.adeptus.whatismyip.controllers.HomeController.ipify"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """io.adeptus.whatismyip.controllers.HomeController.post"""),
    ("""POST""", this.prefix, """io.adeptus.whatismyip.controllers.HomeController.receive"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """whatismyip""", """io.adeptus.whatismyip.controllers.HomeController.whatismyip"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """show""", """io.adeptus.whatismyip.controllers.HomeController.show"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "io.adeptus.whatismyip.controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_ipify1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ipify")))
  )
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_ipify1_invoker = createInvoker(
    HomeController_1.ipify,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "io.adeptus.whatismyip.controllers.HomeController",
      "ipify",
      Nil,
      "GET",
      this.prefix + """ipify""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_post2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_post2_invoker = createInvoker(
    HomeController_1.post,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "io.adeptus.whatismyip.controllers.HomeController",
      "post",
      Nil,
      "GET",
      this.prefix + """post""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_receive3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_receive3_invoker = createInvoker(
    HomeController_1.receive,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "io.adeptus.whatismyip.controllers.HomeController",
      "receive",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_whatismyip4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("whatismyip")))
  )
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_whatismyip4_invoker = createInvoker(
    HomeController_1.whatismyip,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "io.adeptus.whatismyip.controllers.HomeController",
      "whatismyip",
      Nil,
      "GET",
      this.prefix + """whatismyip""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("show")))
  )
  private[this] lazy val io_adeptus_whatismyip_controllers_HomeController_show5_invoker = createInvoker(
    HomeController_1.show,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "io.adeptus.whatismyip.controllers.HomeController",
      "show",
      Nil,
      "GET",
      this.prefix + """show""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case io_adeptus_whatismyip_controllers_HomeController_index0_route(params) =>
      call { 
        io_adeptus_whatismyip_controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case io_adeptus_whatismyip_controllers_HomeController_ipify1_route(params) =>
      call { 
        io_adeptus_whatismyip_controllers_HomeController_ipify1_invoker.call(HomeController_1.ipify)
      }
  
    // @LINE:8
    case io_adeptus_whatismyip_controllers_HomeController_post2_route(params) =>
      call { 
        io_adeptus_whatismyip_controllers_HomeController_post2_invoker.call(HomeController_1.post)
      }
  
    // @LINE:9
    case io_adeptus_whatismyip_controllers_HomeController_receive3_route(params) =>
      call { 
        io_adeptus_whatismyip_controllers_HomeController_receive3_invoker.call(HomeController_1.receive)
      }
  
    // @LINE:10
    case io_adeptus_whatismyip_controllers_HomeController_whatismyip4_route(params) =>
      call { 
        io_adeptus_whatismyip_controllers_HomeController_whatismyip4_invoker.call(HomeController_1.whatismyip)
      }
  
    // @LINE:11
    case io_adeptus_whatismyip_controllers_HomeController_show5_route(params) =>
      call { 
        io_adeptus_whatismyip_controllers_HomeController_show5_invoker.call(HomeController_1.show)
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
