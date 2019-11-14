//
//  LKAppAnalytics.swift
//  LKAppAnalytics
//
//  Created by Long Cao on 11/14/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation
import Firebase

@objc(LKAppAnalytics)
class LKAppAnalytics: RCTEventEmitter {
  
  override static func requiresMainQueueSetup() -> Bool {
     return false
   }
   
   // we need to override this method and
   // return an array of event names that we can listen to
   override func supportedEvents() -> [String]! {
     return [""]
   }
   
   @objc
   func setCurrentScreen(_ screenName : String) -> Void {
        Analytics.setScreenName(screenName, screenClass: nil)
   }
    
    @objc
    func logEvent(_ eventName : String, parameters: Dictionary) -> Void {
        Analytics.logEvent(eventName, parameters: parameters)
    }
}
