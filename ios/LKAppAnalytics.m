#import <Foundation/Foundation.h>
#import "React/RCTViewManager.h"

@interface RCT_EXTERN_MODULE(LKAppAnalytics, RCTViewManager)
 RCT_EXTERN_METHOD(
                   setCurrentScreen:(NSString *)screenName
 )
RCT_EXTERN_METHOD(
                  logEvent:(NSString *)eventName
                  parameters: NSDictionary
)
@end
