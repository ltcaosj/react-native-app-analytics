import { NativeModules } from 'react-native';

const { LKAppAnalytics } = NativeModules;

export const setCurrentScreen = screenName => {
    LKAppAnalytics.setCurrentScreen(screenName)
};

export const logEvent = (eventName, parameters) => {
    LKAppAnalytics.logEvent(eventName, parameters)
};

export const Analytics = {
    setCurrentScreen,
    logEvent
}

export { LKAppAnalytics };
