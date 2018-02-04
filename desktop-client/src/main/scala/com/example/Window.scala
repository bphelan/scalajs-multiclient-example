package com.example

import scala.scalajs.js
import scala.scalajs.js.Dynamic.global
import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("ElectronQuickStart.Window")
class Window {
  global.console.log("Loading window...");
  global.document.getElementsByTagName("BODY").asInstanceOf[js.Array[js.Dynamic]].apply(0).style = "background: #0f9;"
}
