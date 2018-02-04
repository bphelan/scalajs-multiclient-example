package electron

import scala.scalajs.reflect.annotation.EnableReflectiveInstantiation

@EnableReflectiveInstantiation
abstract class RendererProcess() {
  implicit val electron = new Electron()
}
