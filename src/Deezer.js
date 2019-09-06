import { NativeModules } from 'react-native';

const { Deezer } = NativeModules;

Deezer.sayHello = (callback) => {
  return Deezer.getModuleName(callback)
}

export default Deezer;
