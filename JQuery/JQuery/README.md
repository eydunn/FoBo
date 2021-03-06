# FoBo JQuery Toolkit Module

This FoBo toolkit module provides JQuery to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- FoBo-JQuery [v1.7.2, v1.8,2, v1.9.1, v1.10.2, v1.11.0, v1.11.1, v1.11.3, v2.1.1, v2.1.4, v2.2.4, v3.0.0, v3.1.0] - [JQuery](http://jquery.com/)
- FoBo-JQuery-Migrate [v1.2.1, v1.4.1, v3.0.0] - [JQuery-Migrate](https://github.com/jquery/jquery-migrate/)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-jquery_3.0 % "1.6"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-jquery_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoJQ => FoBo} 
  :
FoBo.Toolkit.Init=FoBo.Toolkit.JQueryXYZ
```    
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.Toolkit.Init=FoBo.Toolkit.JQueryXYZ
```    
### Lift FoBo Template hooks
```html
<script src="/classpath/fobo/jquery.js" type="text/javascript"></script>
```    
Note: This module is basicly a simple wrapper around the lift-jquery-module to be able to provide a path with the namespace fobo in it.

For more information on how to use JQuery see [JQuery](http://jquery.com/)

## Contributions

Improvements, contributions and suggestions are welcome! 
Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

 

