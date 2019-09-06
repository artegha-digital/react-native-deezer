# react-native-deezer

## Getting started

`$ npm install react-native-deezer --save`

### Mostly automatic installation

`$ react-native link react-native-deezer`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-deezer` and add `Deezer.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libDeezer.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.minaro.react.deezer.DeezerPackage;` to the imports at the top of the file
  - Add `new DeezerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-deezer'
  	project(':react-native-deezer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-deezer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-deezer')
  	```


## Usage
```javascript
import Deezer from 'react-native-deezer';

// TODO: What to do with the module?
Deezer;
```
