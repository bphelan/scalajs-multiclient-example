package electron.raw

import electron.ipc

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("electron", JSImport.Namespace)
@js.native
object Electron extends js.Object {
  val app: Application = js.native
  val BrowserWindow: js.Dynamic = js.native
  val ipcMain: nodejs.raw.EventEmitter = js.native
  val ipcRenderer: ipc.IpcRenderer = js.native
}
