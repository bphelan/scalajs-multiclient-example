package com.example

import me.shadaj.slinky.core._
import me.shadaj.slinky.core.annotations.react
import me.shadaj.slinky.web.html._

import scala.scalajs.js.annotation._

@JSExportTopLevel("App") @JSExportAll
@react class App extends Component {
  type Props = Unit

  def render() = {
    // TODO: replace with React Native components once facade available
    div(className := "App")(
      header(className := "App-header")(
        h1(className := "App-title")("Welcome to React (with Scala.js!)")
      )
    )
  }
}
