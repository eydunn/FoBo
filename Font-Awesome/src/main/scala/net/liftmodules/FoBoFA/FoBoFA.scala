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
package object FoBoFA {

  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoFA.InitParam","1.6.0")
  def init() {
  }

  //@deprecated("","1.6.0")
  abstract sealed trait FAToolkit
  abstract sealed trait ToolKit
  abstract sealed trait Resource
  abstract sealed trait API
  
  
  /*=== ToolKit ============================================*/
  
  object ToolKit extends ToolKit {
    var Init: ToolKit = null 
    
   /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;5&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.5.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome450
     * }}}
     */    
     case object FontAwesome450 extends ToolKit {
       FoBoFARes.Resource.FontAwesome450
       //FoBoFAAPI.API.FontAwesome4
     } 
    
    
    /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.3.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome430
     * }}}
     */    
     case object FontAwesome430 extends ToolKit {
       FoBoFARes.Resource.FontAwesome430
       //FoBoFAAPI.API.FontAwesome4
     }  
    
    /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
     * }}}
     */    
     case object FontAwesome410 extends ToolKit {
       FoBoFARes.Resource.FontAwesome410
       //FoBoFAAPI.API.FontAwesome4
     }  
     
    /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
     * @version 4.0.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
     * }}}
     */    
     case object FontAwesome403 extends ToolKit {
       FoBoFARes.Resource.FontAwesome403
       //FoBoFAAPI.API.FontAwesome4
     }   
     
    /**
     * Enable usage of FoBo's FontAwesome resources and API version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFARes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
     * }}}
     */    
     case object FontAwesome321 extends ToolKit {
       FoBoFARes.Resource.FontAwesome321
       //FoBoFAAPI.API.FontAwesome4
     }     
    
  }
  

  /*=== Resource ============================================*/
  
  object Resource extends Resource {
    var Init: Resource = null
    
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;5&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.5.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome450
     * }}}
     */    
     case object FontAwesome450 extends Resource {
       FoBoFARes.Resource.FontAwesome450
     }     
    
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.3.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome430
     * }}}
     */    
     case object FontAwesome430 extends Resource {
       FoBoFARes.Resource.FontAwesome430
     } 
    
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
     * }}}
     */    
     case object FontAwesome410 extends Resource {
       FoBoFARes.Resource.FontAwesome410
     }  
     
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
     * @version 4.0.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
     * }}}
     */    
     case object FontAwesome403 extends Resource {
       FoBoFARes.Resource.FontAwesome403
     }   
     
    /**
     * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
     * }}}
     */    
     case object FontAwesome321 extends Resource {
       FoBoFARes.Resource.FontAwesome321
     }       
    
  }
  
  /*=== API ============================================*/
  
  object API extends API {
    var Init: API = null
    
    /**
     * Enable usage of FoBo's FontAwesome API version 4&#8228;X&#8228;X in your bootstrap liftweb Boot.
     * @version 4.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoFA => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.FontAwesome4
     * }}}
     */    
     case object FontAwesome4 extends API {
       //ToDo get from module fobo-fontawesome-api in FoBoFAAPI
       //FoBoFAAPI.API.FontAwesome4
       FoBoAPI.init
     }
    
  }
  
  /*=== InitParam (deprecated) ============================================*/
  
  /**
   *
   */
  @deprecated("Use FoBoFA.ToolKit.Init=FoBoFA.ToolKit.[Toolkit Object]","1.6.0")
  object InitParam extends FAToolkit {
    var ToolKit: FAToolkit = null 
  }

   /**
   * Enable usage of Font-Awesome version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
   * @version 4.3.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome430
   * }}}
   * @since v1.4
   */
  @deprecated("Use FoBoFA.ToolKit.Init=FoBoFA.ToolKit.FontAwesome430","1.6.0")
  case object FontAwesome430 extends FAToolkit {
    ToolKit.FontAwesome430
  }    
    
   /**
   * Enable usage of Font-Awesome version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
   * @version 4.1.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome410
   * }}}
   * @since v1.3
   */
  @deprecated("Use FoBoFA.ToolKit.Init=FoBoFA.ToolKit.FontAwesome410","1.6.0")
  case object FontAwesome410 extends FAToolkit {
    ToolKit.FontAwesome410
  }     
    
   /**
   * Enable usage of Font-Awesome version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
   * @version 4.0.3
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome403
   * }}}
   * @since v1.2
   */
  @deprecated("Use FoBoFA.ToolKit.Init=FoBoFA.ToolKit.FontAwesome403","1.6.0")
  case object FontAwesome403 extends FAToolkit {
    ToolKit.FontAwesome403
  } 
      
   /**
   * Enable usage of Font-Awesome version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
   * @version 3.2.1
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBoFA.InitParam.Toolkit=FoBoFA.FontAwesome321
   * }}}
   *
   */
  @deprecated("Use FoBoFA.ToolKit.Init=FoBoFA.ToolKit.FontAwesome321","1.6.0")
  case object FontAwesome321 extends FAToolkit {
    ToolKit.FontAwesome321
  }
        
  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoFA")  
    }
  }    

}




