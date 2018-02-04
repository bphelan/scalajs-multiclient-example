# scalajs-multiclient-example

## About

Quick-and-dirty multi-client (web, mobile, desktop) Scala.js application using
[scalajs-bundler](https://github.com/scalacenter/scalajs-bundler), 
[Slinky](https://github.com/shadaj/slinky), 
[React](https://reactjs.org/),
[React Native](https://facebook.github.io/react-native/),
[Expo](https://expo.io/) and 
[Electron](https://electronjs.org/).

## Pre-requisites:

### Tools

- Oracle Java JDK 7/8/9
- sbt >= 0.13
- Node.js >= 6 (install via nvm to avoid issues with native packaged versions)
- yarn (optional)

### npm packages

- `npm install -g create-react-native-app`
- `npm install -g react-native-cli`
- `npm install -g electron`
- `npm install -g react-devtools`

## Usage

**Web client**, from sbt:

```sbtshell
webClient/fastOptJS::startWebpackServer
```

**Desktop client**, from sbt:

```sbtshell
desktopClient/electron
```

**Mobile client**, from sbt:

```sbtshell
mobileClient/expo
```

NB: Until a React Native facade exists for Slinky expect a big red warning about
missing components when you run the mobile client.

## Notes

In all 3 clients we're using (or misusing) scalajs-bundler to set up a Node.js 
project and deliver compiled Scala.js at `target/scala-2.12/scalajs-bundler/main`.
If you're curious or want to run npm/node/yarn directly you can look here after 
running the client-specific commands to build the project.


## TODO

- [x] web client
- [x] desktop client with Electron
  - [x] node project config managed in sbt
  - [x] launch Electron from sbt
  - [x] app setup in Scala.js
  - [ ] use Slinky/React to render the client
- [x] mobile client with React Native and Expo
  - [x] node project config managed in sbt
  - [x] launch Expo server from sbt
  - [ ] **facade for [React Native Components](https://facebook.github.io/react-native/docs/components-and-apis.html)**
  - [ ] use Slinky/React Native to render the client
- [x] embed [mscharley's Electron facade](https://github.com/mscharley/scalajs-electron) until PR is accepted and a compatible version published
- [ ] shared code & components across clients
- [ ] experiment with [react-native-web](https://github.com/necolas/react-native-web)
- [ ] experiment with [reactxp](https://github.com/Microsoft/reactxp)
- [ ] production builds



