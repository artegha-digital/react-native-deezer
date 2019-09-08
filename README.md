# react-native-deezer

## Getting started

`$ yarn i rn-deezer-sdk`

or

`$ npm install rn-deezer-sdk`

`$ react-native link rn-deezer-sdk`

if you get a Haste module naming collision
add this in the root of your project, in metro.config.js :

`const blacklist = require('metro-config/src/defaults/blacklist');
module.exports = {
    resolver: {
        blacklistRE: blacklist([
            /node_modules\/.*\/node_modules\/react-native\/.*/,
        ])
    },
};`


## Try it
```javascript
import Deezer from 'rn-deezer';

Deezer.getModuleName((msg) => console.log(msg))

```
## To Do

- add methods from deezer-sdk in `android\src\main\java\com\minaro\react\deezer\DeezerModule.java`
- Xcode installation
