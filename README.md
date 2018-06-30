
# react-native-data-usage-library

## Getting started

`$ npm install react-native-data-usage-library --save`

### Mostly automatic installation

`$ react-native link react-native-data-usage-library`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-data-usage-library` and add `RNDataUsageLibrary.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNDataUsageLibrary.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNDataUsageLibraryPackage;` to the imports at the top of the file
  - Add `new RNDataUsageLibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-data-usage-library'
  	project(':react-native-data-usage-library').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-data-usage-library/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-data-usage-library')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNDataUsageLibrary.sln` in `node_modules/react-native-data-usage-library/windows/RNDataUsageLibrary.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Data.Usage.Library.RNDataUsageLibrary;` to the usings at the top of the file
  - Add `new RNDataUsageLibraryPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNDataUsageLibrary from 'react-native-data-usage-library';

// TODO: What to do with the module?
RNDataUsageLibrary;
```
  