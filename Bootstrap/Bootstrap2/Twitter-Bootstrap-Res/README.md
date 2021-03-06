# FoBo Twitter Bootstrap Resource Module

This resource module provides Twitter Bootstrap v2.x resource components to the FoBo's Twitter Bootstrap Toolkit Module, 
but can also be used as-is (see below for setup information).

### Components and available versions 

- Bootstrap [v2.3.2] - [Bootstrap](http://twitter.github.com/bootstrap/)

### Integration into your project 

## Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-twitter-bootstrap_3.0 % "1.6"
```      
**Maven:**
 ```xml     
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-twitter-bootstrap_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.Resource.Init=FoBo.Resource.BootstrapXXX 
```
### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoTBRes => FoBo}
  :
FoBo.Resource.Init=FoBo.Resource.BootstrapXXX 
```
### Lift FoBo Template hooks
```html
<link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap.css'> 
<link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap-responsive.css'> 
  :
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
  :
  :
<script type="text/javascript" src="/classpath/fobo/bootstrap.js"></script>
```
For more information on how to use Twitter Bootstrap see [Twitter Bootstrap](http://twitter.github.com/bootstrap/)

### Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

