package electron

import scala.scalajs.js

class Electron private[electron] {
  val app: Application = new Application(raw.Electron.app)
  val BrowserWindow: js.Dynamic = raw.Electron.BrowserWindow
  val ipcMain: nodejs.raw.EventEmitter = raw.Electron.ipcMain
  val ipcRenderer: ipc.IpcRenderer = raw.Electron.ipcRenderer
}
