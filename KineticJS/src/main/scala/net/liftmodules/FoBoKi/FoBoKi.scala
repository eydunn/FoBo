package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo - Sub-module== 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without FoBo).
 * This package object provides information on how to initiate and use this module 
 * in your project. If you are using this module in FoBo see [[net.liftmodules.FoBo]] 
 * for usage information. 
 */
package object FoBoKi {

  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoKi.InitParam","1.6.0")
  def init() {
//    LiftRules.addToPackages("net.liftmodules.FoBoKi")
//    ResourceServer.allow {
//      case "fobo" :: tail => true
//    }
  }

  abstract sealed trait KiToolkit

  /**
   *
   */
  object InitParam extends KiToolkit {
    var ToolKit: KiToolkit = null 
  }

  
/**
 * Enable usage of KineticJS version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
 * @version 5.1.0
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoKi.InitParam.Toolkit=FoBoKi.KineticJS510
 * }}}
 * @since v1.3
 */
  case object KineticJS510 extends KiToolkit {
    FoBoResources.init
    FoBoResources.KineticJS510
  }


/**
 * Object for initiating FoBo API packages. 
 */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoKi")  
    }
  }
  
  /**
   * Object holding internally used FoBo resources.
   */
  private object FoBoResources {

    lazy val init: Unit = {
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }
  
    lazy val KineticJS510: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "kinetic.js" :: Nil if Props.devMode => List("fobo", "kinetic", "5.1.0", "js", "kinetic.js")
        case "fobo" :: "kinetic.js" :: Nil => List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")                
      }
    }
 
  }
  
}




