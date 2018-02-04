package electron

import scala.scalajs.js
import scala.scalajs.reflect.annotation.EnableReflectiveInstantiation

@EnableReflectiveInstantiation
abstract class ElectronApp {
  implicit val electron = new Electron()
  lazy val process = js.Dynamic.global.process

  val electronApp = electron.app
}
